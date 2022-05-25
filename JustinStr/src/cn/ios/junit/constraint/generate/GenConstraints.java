package cn.ios.junit.constraint.generate;

import cn.ios.junit.config.GlobalCons;
import cn.ios.junit.constraint.DTO.MethodCallDTO;
import cn.ios.junit.constraint.DTO.ParamConstraintDTO;
import cn.ios.junit.constraint.VO.ParamConstraintVO;
import cn.ios.junit.enums.TraceTypeEnum;
import cn.ios.junit.util.ClassUtil;
import cn.ios.junit.util.ListUtil;
import cn.ios.junit.util.TypeUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import soot.*;
import soot.jimple.BinopExpr;
import soot.jimple.Constant;
import soot.jimple.IfStmt;
import soot.jimple.ReturnStmt;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class GenConstraints {

	public static Map<String, Map<String, Map<Integer, ParamConstraintVO>>> getConstraintsFromDirectIf() {
		return getConstraintsForAllClass();
	}

	private static Map<String, Map<String, Map<Integer, ParamConstraintVO>>> getConstraintsForAllClass(){
		Map<String, Map<String, Map<Integer, ParamConstraintVO>>> constraintsForAllClasses = Maps.newHashMap();
		HashSet<SootClass> applicationClasses = new HashSet<>(Scene.v().getApplicationClasses());
		for (SootClass sootClass : applicationClasses) {
			if (ClassUtil.isIgnoredClass(sootClass)) {
				continue;
			}
			Map<String, Map<Integer, ParamConstraintVO>> constraintsForEachClass = Maps.newHashMap();
			HashSet<SootMethod> sootMethods = new HashSet<SootMethod>(sootClass.getMethods());
			for (SootMethod sootMethod : sootMethods) {
				if (ClassUtil.isIgnoredMethod(sootMethod) || !sootMethod.hasActiveBody()) {
					continue;
				}
				boolean flag = false;
				for (Type parameterType : sootMethod.getParameterTypes()) {
					if (TypeUtil.isStringType(parameterType)) {
						flag = true;
					}
				}
				if (flag) {
					Body body = sootMethod.getActiveBody();
					try {
						Map<Integer, ParamConstraintVO> constraintsInMethod = getConstraintsInMethod(new BriefUnitGraph(body), body, sootMethod);

						if (!constraintsInMethod.isEmpty()) {
							constraintsForEachClass.put(sootMethod.getSignature(), constraintsInMethod);
							GlobalCons.CANDIDATE_METHODS.add(sootMethod);

							List<String> strings = Lists.newArrayList();
							if (GlobalCons.FILTER_METHOD_NAME.containsKey(sootClass.getName())) {
								strings = GlobalCons.FILTER_METHOD_NAME.get(sootClass.getName());
							}
							strings.add(sootMethod.getName());
							GlobalCons.FILTER_METHOD_NAME.put(sootClass.getName(),strings);

							List<String> strings1 = Lists.newArrayList();
							if (GlobalCons.CONSTRAINT_METHOD_NAME.containsKey(sootClass.getName())) {
								strings1 = GlobalCons.CONSTRAINT_METHOD_NAME.get(sootClass.getName());
							}
							strings1.add(sootMethod.getName());
							GlobalCons.CONSTRAINT_METHOD_NAME.put(sootClass.getName(),strings1);

						}
					} catch (Exception | Error e) {

					}
				}
			}
			if (!constraintsForEachClass.isEmpty()) {
				constraintsForAllClasses.put(sootClass.getName(), constraintsForEachClass);
			}
		}

		return constraintsForAllClasses;
	}

	private static Map<Integer, ParamConstraintVO> getConstraintsInMethod(UnitGraph unitGraph, Body body, SootMethod sootMethod) {
		Map<Integer, ParamConstraintVO> savedResult = Maps.newHashMap();
		for (Unit unit : body.getUnits()) {
			ParamConstraintDTO paramConstraintDTO = new ParamConstraintDTO();
			if (unit instanceof IfStmt) {
				IfStmt ifStmt = (IfStmt) unit;
				Value conditionExpr = ifStmt.getCondition();
				if (conditionExpr instanceof BinopExpr) {
					BinopExpr binopExpr = (BinopExpr) conditionExpr;
					paramConstraintDTO.setOperator(binopExpr.getSymbol());
					Value leftValue = binopExpr.getOp1();
					Value rightValue = binopExpr.getOp2();

					// constant is compareValue
					if (rightValue instanceof Constant) {
						paramConstraintDTO.setCompareValue(rightValue.toString());
						if (leftValue instanceof Local) {
							Trace.traceLocal(unitGraph, unit, (Local) leftValue, paramConstraintDTO, Maps.newHashMap(),
									TraceTypeEnum.IfStmt, -1);
						}
					} else if (leftValue instanceof Constant) {
						paramConstraintDTO.setCompareValue(leftValue.toString());
						if (rightValue instanceof Local) {
							Trace.traceLocal(unitGraph, unit, (Local) rightValue, paramConstraintDTO, Maps.newHashMap(),
									TraceTypeEnum.IfStmt, -1);
						}
					} else {
						if (leftValue instanceof Local) {
							Trace.traceLocal(unitGraph, unit, (Local) leftValue, paramConstraintDTO, Maps.newHashMap(),
									TraceTypeEnum.IfStmt, -1);
						}
						if (rightValue instanceof Local) {
							Trace.traceLocal(unitGraph, unit, (Local) rightValue, paramConstraintDTO, Maps.newHashMap(),
									TraceTypeEnum.IfStmt, -1);
						}
					}
				}
			}
			else if (unit instanceof ReturnStmt) {
				// for : return str.contains("s")
				Value returnValue = ((ReturnStmt) unit).getOp();
				if (returnValue instanceof Local) {
					Trace.traceLocal(unitGraph, unit, (Local) returnValue, paramConstraintDTO, Maps.newHashMap(), TraceTypeEnum.ReturnStmt, -1);
				}
			}

			if (paramConstraintDTO.getParamIndex() >= 0) {
				List<MethodCallDTO> methodCallList = paramConstraintDTO.getMethodCallList();
				if (methodCallList.size() > 1 && methodCallList.get(methodCallList.size() - 2).getMethodSig().isEmpty()) {
					continue;
				}
				dealMethodCallList(paramConstraintDTO);
				addToParamConstraintVO(savedResult, paramConstraintDTO, sootMethod);
			}
		}
		return savedResult;
	}

	private static void  addToParamConstraintVO(Map<Integer, ParamConstraintVO> paramConstraintVOMap,
												ParamConstraintDTO paramConstraintDTO, SootMethod sootMethod){

		int paramIndex = paramConstraintDTO.getParamIndex();
		Type paramType = paramConstraintDTO.getParamType();
		List<String> arithmeticList = paramConstraintDTO.getArithmeticList();
		if (paramIndex < 0 ) return;

		// generate regex or constraint value
		Set<String> regexSet = GenRegex.genRegexByParamConstraintInfo(paramConstraintDTO, sootMethod);

		ParamConstraintVO paramConstraintVO = paramConstraintVOMap.containsKey(paramIndex) ?
				paramConstraintVOMap.get(paramIndex) :
				new ParamConstraintVO(paramIndex,paramType);

		if (TypeUtil.isPrimType(paramType) || TypeUtil.isStringType(paramType)
				|| TypeUtil.isCollectionType(paramType) || TypeUtil.isArrayType(paramType)) {
			Set<String> possibleValuesForSimpleType = paramConstraintVO.getPossibleValuesForSimpleType();
			possibleValuesForSimpleType.addAll(regexSet);
			Set<String> simplifiedRegex = Sets.newHashSet();
			for (String regex : possibleValuesForSimpleType) {
				String[] split = regex.split("##");
				if (split.length == 2) {
					String quote2 = Pattern.quote("]*");
					String quote3 = Pattern.quote("]+");
					String s1 = split[0].replaceAll(quote2, "]{0}").replaceAll(quote3,"]{1}");

					String quote4 = Pattern.quote("[\\s\\S]{0}");
					String s2 = s1.replaceAll(quote4,"");
					if (s2.isEmpty()) s2 = s1;

					simplifiedRegex.add(s2+"##"+split[1]);
				}
			}
			paramConstraintVO.setPossibleValuesForSimpleType(simplifiedRegex);
			paramConstraintVO.setArithmeticList(arithmeticList);
		}
		paramConstraintVO.setNumsOfPossibleValues();
		paramConstraintVO.setArithmeticList(arithmeticList);

		if (paramConstraintVO.getNumsOfPossibleValues() > 0) {
			paramConstraintVOMap.put(paramIndex, paramConstraintVO);
		}
	}

	private static void dealMethodCallList(ParamConstraintDTO paramConstraintInfo){
		List<MethodCallDTO> methodCallList = paramConstraintInfo.getMethodCallList();
		List<String> arithmeticList = paramConstraintInfo.getArithmeticList();
		MethodCallDTO lastElement = ListUtil.getLastElement(methodCallList);
		if (lastElement != null && lastElement.getMethodSig().isEmpty()) {
			ListUtil.removeLastElement(methodCallList);
		}
		List<MethodCallDTO> reverseMethodCallList = ListUtil.reverse(methodCallList);
		paramConstraintInfo.setMethodCallList(reverseMethodCallList);

		List<String> reverseArithmeticList = ListUtil.reverse(arithmeticList);
		paramConstraintInfo.setArithmeticList(reverseArithmeticList);
	}
}
