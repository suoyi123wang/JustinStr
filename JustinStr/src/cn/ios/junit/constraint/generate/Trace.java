package cn.ios.junit.constraint.generate;

import cn.ios.junit.config.GlobalCons;
import cn.ios.junit.constraint.DTO.MethodCallDTO;
import cn.ios.junit.constraint.DTO.ParamConstraintDTO;
import cn.ios.junit.enums.TraceTypeEnum;
import cn.ios.junit.util.ListUtil;
import cn.ios.junit.util.TypeUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import soot.Local;
import soot.Unit;
import soot.Value;
import soot.jimple.*;
import soot.shimple.PhiExpr;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.SimpleLocalDefs;
import soot.toolkits.scalar.ValueUnitPair;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class Trace {

    public static void traceLocal(UnitGraph unitGraph, Unit unit, Local localTemp,
                                  ParamConstraintDTO paramConstraintDTO, Map<String, Integer> visited, TraceTypeEnum type, int index) {
		String sig = getHashString(unit, localTemp, type, index);
		if (!visited.containsKey(sig)) {
            visited.put(sig,1);
		} else {
            Integer num= visited.get(sig);
            if (num >= GlobalCons.MAX_UNIT_VISIT_TIME) {
                return;
            }
            visited.put(sig, num + 1);
        }


        List<Unit> defsOfOps = new SimpleLocalDefs(unitGraph).getDefsOfAt(localTemp, unit);
        if (defsOfOps.size() == 1) {
            Unit defOfLocal = defsOfOps.get(0);
            if (defOfLocal.equals(unit)) {
                return;
            }
            if (defOfLocal instanceof DefinitionStmt) {
                dealDefineStmt(unitGraph, (DefinitionStmt) defOfLocal, paramConstraintDTO, visited);
            }
        }
    }

    private static void dealDefineStmt(UnitGraph unitGraph, DefinitionStmt definitionStmt,
                                       ParamConstraintDTO paramConstraintDTO, Map<String, Integer> visited) {
        Value rightValue = definitionStmt.getRightOp();
        if (rightValue instanceof ParameterRef) {
            if (!paramConstraintDTO.isDealingMethodArg()) {
                int paraIndex = ((ParameterRef) rightValue).getIndex();
                if (TypeUtil.isStringType(rightValue.getType())) {
                    paramConstraintDTO.setParamIndex(paraIndex);
                    paramConstraintDTO.setParamType(rightValue.getType());
                }
            }
        } else if (rightValue instanceof InstanceInvokeExpr) {
            InstanceInvokeExpr instanceInvokeExpr = (InstanceInvokeExpr) rightValue;
            String calledMethodSig = instanceInvokeExpr.getMethod().getSignature();
            Value caller = instanceInvokeExpr.getBaseBox().getValue();

            if (!TypeUtil.isCanDealMethod(calledMethodSig)) return;

            // dealMethodSignature
            MethodCallDTO currentMethodCall = getCurrentMethodCall(paramConstraintDTO);
            currentMethodCall.setMethodSig(calledMethodSig);
            List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
            methodCallInfoList.add(currentMethodCall);
            paramConstraintDTO.setMethodCallList(methodCallInfoList);

            // dealMethodArgs
            paramConstraintDTO.setDealingMethodArg(true);
            dealMethodArgs(instanceInvokeExpr.getArgs(), unitGraph, definitionStmt, paramConstraintDTO, visited);
            paramConstraintDTO.setDealingMethodArg(false);

            if (caller instanceof Local) {
                // 2. invokeExprCaller
                traceLocal(unitGraph, definitionStmt, (Local) caller, paramConstraintDTO, visited,
                        TraceTypeEnum.InvokeExprCaller, -1);
            }

        } else if (rightValue instanceof ArrayRef) {
            // a[1]
            Value base = ((ArrayRef) rightValue).getBase();
            Value index = ((ArrayRef) rightValue).getIndex();
            if (index instanceof Constant) {
                MethodCallDTO currentMethodCall = getCurrentMethodCall(paramConstraintDTO);
                currentMethodCall.setArrayIndex(Integer.parseInt(index.toString()));

                List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
                methodCallInfoList.add(currentMethodCall);
                paramConstraintDTO.setMethodCallList(methodCallInfoList);
            }
            if (base instanceof Local) {
                // 4. ArrayRef
                traceLocal(unitGraph, definitionStmt, (Local) base, paramConstraintDTO, visited, TraceTypeEnum.ArrayRef,
                        -1);
            }
        } else if (rightValue instanceof LengthExpr) {

            MethodCallDTO currentMethodCall = getCurrentMethodCall(paramConstraintDTO);
            currentMethodCall.setMethodSig("length");
            List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
            methodCallInfoList.add(currentMethodCall);
            paramConstraintDTO.setMethodCallList(methodCallInfoList);

            Value arrayValue = ((LengthExpr) rightValue).getOp();
            if (arrayValue instanceof Local) {
                // 5. LengthExpr
                traceLocal(unitGraph, definitionStmt, (Local) arrayValue, paramConstraintDTO, visited,
                        TraceTypeEnum.LengthExpr, -1);
            }

        } else if (rightValue instanceof BinopExpr) {
            dealBinopExpr((BinopExpr) rightValue, unitGraph, definitionStmt, paramConstraintDTO, visited);
        } else if (rightValue instanceof CastExpr) {
            // a = (double) b
            Value castValue = ((CastExpr) rightValue).getOp();
            if (castValue instanceof Local) {
                // 6. CastExpr
                traceLocal(unitGraph, definitionStmt, (Local) castValue, paramConstraintDTO, visited,
                        TraceTypeEnum.CastExpr, -1);
            }
        } else if (rightValue instanceof Constant) {
            if (paramConstraintDTO.isDealingMethodArg()) {
                MethodCallDTO currentMethodCall = getCurrentMethodCall(paramConstraintDTO);
                Map<Integer, Set<String>> paramMap = currentMethodCall.getParamMap();
                int currentMethodArgIndex = currentMethodCall.getCurrentMethodArgIndex();
                Set<String> paramArgList = paramMap.containsKey(currentMethodArgIndex)
                        ? paramMap.get(currentMethodArgIndex)
                        : Sets.newHashSet();
                if (rightValue instanceof StringConstant) {
                    paramArgList.add(((StringConstant) rightValue).value);
                } else {
                    paramArgList.add(rightValue.toString());
                }
                paramMap.put(currentMethodArgIndex, paramArgList);
                currentMethodCall.setParamMap(paramMap);
                List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
                methodCallInfoList.add(currentMethodCall);
                paramConstraintDTO.setMethodCallList(methodCallInfoList);
            } else {
                paramConstraintDTO.setCompareValue(rightValue.toString());
            }

        } else if (rightValue instanceof PhiExpr) {
            List<ValueUnitPair> possibleValues = ((PhiExpr) rightValue).getArgs();
            for (int i = 0; i < possibleValues.size(); i++) {
                if (paramConstraintDTO.getParamIndex() < 0) {
                    ValueUnitPair valueUnitPair = possibleValues.get(i);
                    Value value = valueUnitPair.getValue();
                    if (value instanceof Local) {
                        traceLocal(unitGraph, definitionStmt, (Local) value, paramConstraintDTO, visited,
                                TraceTypeEnum.PhiExpr, i);
                    }
                }
            }
        }
    }

    private static void dealBinopExpr(BinopExpr expr, UnitGraph unitGraph, Unit unit,
                                      ParamConstraintDTO paramConstraintDTO, Map<String, Integer> visited) {

        if (expr instanceof CmpExpr || expr instanceof CmpgExpr || expr instanceof CmplExpr) {
            Value op1 = expr.getOp1();
            Value op2 = expr.getOp2();
            if (op1 instanceof Constant) {
                paramConstraintDTO.setCompareValue(op1.toString());
            } else if (op1 instanceof Local) {
                traceLocal(unitGraph, unit, (Local) op1, paramConstraintDTO, visited, TraceTypeEnum.BinopExpr, -1);
            }

            if (op2 instanceof Constant) {
                paramConstraintDTO.setCompareValue(op2.toString());
            } else if (op2 instanceof Local) {
                traceLocal(unitGraph, unit, (Local) op2, paramConstraintDTO, visited, TraceTypeEnum.BinopExpr, -1);
            }
        } else if (expr instanceof AddExpr || expr instanceof SubExpr || expr instanceof MulExpr || expr instanceof DivExpr) {
            Value op1 = expr.getOp1();
            Value op2 = expr.getOp2();
            if (op1 instanceof Local && op2 instanceof Constant) {
                List<String> arithmeticList = paramConstraintDTO.getArithmeticList();
                arithmeticList.add(getArithmeticSymbol(expr) + op2.toString());
                paramConstraintDTO.setArithmeticList(arithmeticList);
                traceLocal(unitGraph, unit, (Local) op1, paramConstraintDTO, visited, TraceTypeEnum.BinopExpr, -1);
            }
        }
    }

    private static void dealMethodArgs(List<Value> methodArgs, UnitGraph unitGraph, Unit unit,
                                       ParamConstraintDTO paramConstraintDTO, Map<String, Integer> visited) {
        for (int i = 0; i < methodArgs.size(); i++) {
            Value methodArg = methodArgs.get(i);

            MethodCallDTO currentMethodCall = getCurrentMethodCall(paramConstraintDTO);
            currentMethodCall.setCurrentMethodArgIndex(i);
            List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
            methodCallInfoList.add(currentMethodCall);
            paramConstraintDTO.setMethodCallList(methodCallInfoList);

            if (methodArg instanceof Local) {
                paramConstraintDTO.setDealingMethodArg(true);
                // 3. methodArg
                traceLocal(unitGraph, unit, (Local) methodArg, paramConstraintDTO, visited, TraceTypeEnum.MethodArg, i);
            } else if (methodArg instanceof Constant) {
                MethodCallDTO currentMethodCall1 = getCurrentMethodCall(paramConstraintDTO);
                int currentMethodArgIndex = currentMethodCall1.getCurrentMethodArgIndex();
                Map<Integer, Set<String>> paramMap = currentMethodCall1.getParamMap();

                Set<String> paramArgList = paramMap.containsKey(currentMethodArgIndex)
                        ? paramMap.get(currentMethodArgIndex)
                        : Sets.newHashSet();

                if (methodArg instanceof StringConstant) {
                    paramArgList.add(((StringConstant) methodArg).value);
                } else {
                    paramArgList.add(methodArg.toString());
                }
                paramMap.put(currentMethodArgIndex, paramArgList);
                currentMethodCall.setParamMap(paramMap);

                List<MethodCallDTO> methodCallInfoList1 = paramConstraintDTO.getMethodCallList();
                methodCallInfoList.add(currentMethodCall1);
                paramConstraintDTO.setMethodCallList(methodCallInfoList1);
            }
        }

        List<MethodCallDTO> methodCallInfoList2 = paramConstraintDTO.getMethodCallList();
        methodCallInfoList2.add(new MethodCallDTO());
        paramConstraintDTO.setMethodCallList(methodCallInfoList2);
    }

    private static MethodCallDTO getCurrentMethodCall(ParamConstraintDTO paramConstraintDTO) {
        List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
        MethodCallDTO currentMethodCall = ListUtil.getLastElement(methodCallInfoList) == null
                ? new MethodCallDTO()
                : ListUtil.getLastElement(methodCallInfoList);
        ListUtil.removeLastElement(methodCallInfoList);
        methodCallInfoList = methodCallInfoList == null ? Lists.newArrayList() : methodCallInfoList;

        paramConstraintDTO.setMethodCallList(methodCallInfoList);
        return currentMethodCall;
    }

    private static String getHashString(Unit unit, Local local, TraceTypeEnum type, int index) {
        return unit.hashCode() + type.toString() + local.hashCode() + "index=" + index;
    }

    private static String getArithmeticSymbol(Value value){
        if (value instanceof AddExpr) {
            return "+";
        } else if (value instanceof SubExpr) {
            return "-";
        } else if (value instanceof MulExpr) {
            return "*";
        } else if (value instanceof DivExpr) {
            return "/";
        }
        return "";
    }
}