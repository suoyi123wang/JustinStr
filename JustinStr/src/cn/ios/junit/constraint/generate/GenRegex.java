package cn.ios.junit.constraint.generate;

import cn.ios.junit.constraint.DTO.MethodCallDTO;
import cn.ios.junit.constraint.DTO.ParamConstraintDTO;
import cn.ios.junit.constraint.DTO.SimpleMethodCallDTO;
import cn.ios.junit.enums.ComplexStringAPIEnum;
import cn.ios.junit.enums.SimpleStringAPIEnum;
import cn.ios.junit.util.BaseUtil;
import cn.ios.junit.util.ListUtil;
import cn.ios.junit.util.TypeUtil;
import cn.ios.junit.util.log.Log;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import soot.SootMethod;
import soot.Type;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

public class GenRegex {
    public static Set<String>  genRegexByParamConstraintInfo(ParamConstraintDTO paramConstraintDTO, SootMethod sootMethod) {
        Set<String> paramRegexSet = Sets.newHashSet();
        if (paramConstraintDTO == null) return paramRegexSet;
        String compareValue = paramConstraintDTO.getCompareValue();
        Type paramType = paramConstraintDTO.getParamType();
        Type fieldType = paramConstraintDTO.getFieldType();
        List<String> arithmeticList = paramConstraintDTO.getArithmeticList();

        Set<String> suitableParamList = Sets.newHashSet();

        if ( (paramType== null || !paramType.toString().equals("java.lang.String")) &&
                (fieldType == null || !fieldType.toString().equals("java.lang.String")) ) {
            suitableParamList = paramConstraintDTO.isHasMemberField()?
                    getSuitableValuesForBasicTypes(compareValue, null, fieldType, true) : getSuitableValuesForBasicTypes(compareValue, arithmeticList, paramType, true);
            if (!suitableParamList.isEmpty()){
                paramRegexSet.addAll(suitableParamList);
            }
        } else {
            List<MethodCallDTO> methodCallInfoList = paramConstraintDTO.getMethodCallList();
            List<List<SimpleMethodCallDTO>> simpleMethodCallLists = transferToSimpleMethodCall(methodCallInfoList);
            if (simpleMethodCallLists == null) return paramRegexSet;
            for (List<SimpleMethodCallDTO> simpleMethodCallList : simpleMethodCallLists) {
                suitableParamList = getRegexForString(compareValue, simpleMethodCallList, "");
                if (!suitableParamList.isEmpty()) {
                    paramRegexSet.addAll(suitableParamList);
                }
            }
        }

        return paramRegexSet;
    }

    public static Set<String> getRegexForString(String compareValue, List<SimpleMethodCallDTO> simpleMethodCallList, String lowerToMergeRegex){
        Set<String> result = Sets.newHashSet();
        Set<String> canMergeAgainRegex = Sets.newHashSet();
        if (!lowerToMergeRegex.isEmpty()) {
            canMergeAgainRegex.add(lowerToMergeRegex);
        }
        if (simpleMethodCallList == null || simpleMethodCallList.isEmpty()) {
            return result;
        }

        String anyLiteral = "[\\s\\S]";

        List<SimpleMethodCallDTO> reverseSimpleMethodCallList = ListUtil.reverse(simpleMethodCallList);
        // only the first of reverseSimpleMethodCallList is SimpleAPI, others are all Complex API

        // 先把complexAPI的anyLiteral合并
        String allAnyLiteral = "";
        List<Set<String[]>> complexRegexList = Lists.newArrayList();
        Set<String> anyLiteralSet = Sets.newHashSet();
        for (SimpleMethodCallDTO simpleMethodCallDTO : reverseSimpleMethodCallList) {
            if (SimpleStringAPIEnum.isSimpleAPI(simpleMethodCallDTO.getMethodSig())) {
                canMergeAgainRegex.addAll(getRegexFromSimpleMethod(simpleMethodCallDTO.getMethodSig(), simpleMethodCallDTO.getParamList(), compareValue, allAnyLiteral));
            } else if (ComplexStringAPIEnum.isComplexAPI(simpleMethodCallDTO.getMethodSig())) {
                Set<String[]> regexFromComplexMethod =
                        getRegexFromComplexMethod(simpleMethodCallDTO.getMethodSig(), simpleMethodCallDTO.getParamList(), compareValue, simpleMethodCallDTO.getArrayIndex(), anyLiteral);
                complexRegexList.add(regexFromComplexMethod);
                if (!regexFromComplexMethod.isEmpty()) {
                    for (String[] strings : regexFromComplexMethod) {
                        if (!strings[3].isEmpty()) {
                            anyLiteralSet.add(strings[3]);
                        }
                    }
                }
            }
        }
        if (!anyLiteralSet.isEmpty()) {
            for (String s : anyLiteralSet) {
                if (!s.equals("[\\s\\S]")) {
                    try {
                        if (s.contains("\\Q") && s.contains("\\E")) {
                            allAnyLiteral += s.substring(s.indexOf("\\Q") + 2,s.indexOf("\\E"));
                        } else {
                            allAnyLiteral += s.substring(s.indexOf("(") + 1, s.indexOf(")"));
                        }

                    } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                        Log.e("TODO ---------StringIndexOutOfBoundsException");
                    }

                }
            }
        }

        if (!allAnyLiteral.isEmpty()) {
            allAnyLiteral = "[^(" + Pattern.quote(allAnyLiteral) + ")]";
        }


        for (Set<String[]> regexFromComplexMethod : complexRegexList) {
            for (String[] upperRegexArray : regexFromComplexMethod) {
                if (!allAnyLiteral.isEmpty()) {
                    upperRegexArray[3] = allAnyLiteral;
                }

                List<Set<String>> setList = upToMergeRegex(upperRegexArray, canMergeAgainRegex);
                if (!setList.get(0).isEmpty()) {
                    result.addAll(setList.get(0));
                }
                if (!setList.get(1).isEmpty()) {
                    canMergeAgainRegex = Sets.newHashSet();
                    canMergeAgainRegex.addAll(setList.get(1));
                }
            }
        }

        for (String s : canMergeAgainRegex) {
            if (s.split("##").length == 2) {
                result.add(s);
            }
        }

        return result;
    }

    public static Set<String> getSuitableValuesForBasicTypes(String compareValue, List<String> arithmeticList, Type type, boolean flag) {
        Set<String> result = Sets.newHashSet();
        if (compareValue.isEmpty()) {
            return result;
        }
        if (compareValue.endsWith("L")) {
            compareValue = compareValue.split("L")[0];
        } else if (compareValue.endsWith("F")) {
            compareValue = compareValue.split("F")[0];
        }
        try {
            if (TypeUtil.isPrimType(type)) {
                if (TypeUtil.isBooleanType(type)) {
                    result.add("true");
                    result.add("false");
                } else if (TypeUtil.isIntType(type)) {
                    int intBound = Integer.parseInt(compareValue);
                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            int i1 = Integer.parseInt(s.substring(1));
                            if (s.startsWith("+")) {
                                intBound -= i1;
                            } else if (s.startsWith("-")) {
                                intBound += i1;
                            } else if (s.startsWith("*")) {
                                intBound /= i1;
                            } else if (s.startsWith("/")) {
                                intBound *= i1;
                            }
                        }
                    }
                    result.add(String.valueOf(intBound));
                    if (flag) {
                        result.add(String.valueOf(intBound + 1));
                        result.add(String.valueOf(intBound - 1));
                        result.add("0");
                        result.add(String.valueOf(Integer.MAX_VALUE));
                        result.add(String.valueOf(Integer.MIN_VALUE));
                    }
                } else if (TypeUtil.isShortType(type)) {
                    short shortBound = Short.parseShort(compareValue);

                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            short i1 = Short.parseShort(s.substring(1));
                            if (s.startsWith("+")) {
                                shortBound -= i1;
                            } else if (s.startsWith("-")) {
                                shortBound += i1;
                            } else if (s.startsWith("*")) {
                                shortBound /= i1;
                            } else if (s.startsWith("/")) {
                                shortBound *= i1;
                            }
                        }
                    }
                    result.add(String.valueOf(shortBound));
                    if (flag) {
                        result.add(String.valueOf(shortBound + 1));
                        result.add(String.valueOf(shortBound - 1));
                        result.add(String.valueOf(Short.MAX_VALUE));
                        result.add(String.valueOf(Short.MIN_VALUE));
                    }
                } else if (TypeUtil.isLongType(type)) {
                    if (compareValue.endsWith("L")) {
                        compareValue = compareValue.split("L")[0];
                    }
                    long longBound = Long.parseLong(compareValue);

                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            long i1 = Long.parseLong(s.substring(1));
                            if (s.startsWith("+")) {
                                longBound -= i1;
                            } else if (s.startsWith("-")) {
                                longBound += i1;
                            } else if (s.startsWith("*")) {
                                longBound /= i1;
                            } else if (s.startsWith("/")) {
                                longBound *= i1;
                            }
                        }
                    }

                    result.add(String.valueOf(longBound));
                    if (flag) {
                        result.add(String.valueOf(longBound + 1));
                        result.add(String.valueOf(longBound - 1));
                        result.add(String.valueOf(Long.MAX_VALUE));
                        result.add(String.valueOf(Long.MIN_VALUE));
                    }
                } else if (TypeUtil.isCharType(type)) {
                    if (BaseUtil.isNumeric(compareValue)) {
                        int charValue = Integer.parseInt(compareValue);

                        if (arithmeticList != null && !arithmeticList.isEmpty()) {
                            for (String s: arithmeticList) {
                                if (BaseUtil.isNumeric(s.substring(1))) {
                                    int i1 = Integer.parseInt(s.substring(1));
                                    if (s.startsWith("+")) {
                                        charValue -= i1;
                                    } else if (s.startsWith("-")) {
                                        charValue += i1;
                                    } else if (s.startsWith("*")) {
                                        charValue /= i1;
                                    } else if (s.startsWith("/")) {
                                        charValue *= i1;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }

                        result.add(String.valueOf((char) charValue));
                        if (flag) {
                            result.add(String.valueOf((char) (charValue + 1)));
                            result.add(String.valueOf((char) (charValue - 1)));
                            result.add(String.valueOf(Character.MAX_VALUE));
                            result.add(String.valueOf(Character.MIN_VALUE));
                        }
                    }
                } else if (TypeUtil.isFloatType(type)) {
                    float floatBound = Float.parseFloat(compareValue);

                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            float i1 = Float.parseFloat(s.substring(1));
                            if (s.startsWith("+")) {
                                floatBound -= i1;
                            } else if (s.startsWith("-")) {
                                floatBound += i1;
                            } else if (s.startsWith("*")) {
                                floatBound /= i1;
                            } else if (s.startsWith("/")) {
                                floatBound *= i1;
                            }
                        }
                    }

                    result.add(String.valueOf(floatBound));
                    if (flag) {
                        result.add(String.valueOf(floatBound + 0.1));
                        result.add(String.valueOf(floatBound - 0.1));
                        result.add(String.valueOf(Float.MAX_VALUE));
                        result.add(String.valueOf(Float.MIN_VALUE));
                    }

                } else if (TypeUtil.isDoubleType(type)) {
                    double doubleBound = Double.parseDouble(compareValue);

                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            double i1 = Double.parseDouble(s.substring(1));
                            if (s.startsWith("+")) {
                                doubleBound -= i1;
                            } else if (s.startsWith("-")) {
                                doubleBound += i1;
                            } else if (s.startsWith("*")) {
                                doubleBound /= i1;
                            } else if (s.startsWith("/")) {
                                doubleBound *= i1;
                            }
                        }
                    }

                    result.add(String.valueOf(doubleBound));

                    if (flag) {
                        result.add(String.valueOf(doubleBound + 0.01));
                        result.add(String.valueOf(doubleBound - 0.01));
                        result.add(String.valueOf(Double.MAX_VALUE));
                        result.add(String.valueOf(Double.MIN_VALUE));
                    }

                } else if (TypeUtil.isByteType(type)) {
                    byte byteBound = Byte.parseByte(compareValue);

                    if (arithmeticList != null && !arithmeticList.isEmpty()) {
                        for (String s: arithmeticList) {
                            byte i1 = Byte.parseByte(s.substring(1));
                            if (s.startsWith("+")) {
                                byteBound -= i1;
                            } else if (s.startsWith("-")) {
                                byteBound += i1;
                            } else if (s.startsWith("*")) {
                                byteBound /= i1;
                            } else if (s.startsWith("/")) {
                                byteBound *= i1;
                            }
                        }
                    }

                    result.add(String.valueOf(byteBound));
                    if (flag) {
                        result.add(String.valueOf(byteBound + 1));
                        result.add(String.valueOf(byteBound - 1));
                        result.add(String.valueOf(Byte.MAX_VALUE));
                        result.add(String.valueOf(Byte.MIN_VALUE));
                    }

                }
            } else {
                if (compareValue.equals("null")) {
                    result.add("null");
                    return result;
                } else if (!BaseUtil.isNumeric(compareValue) || Integer.parseInt(compareValue) < 0) {
                    return result;
                }

                if (TypeUtil.isArrayType(type) || TypeUtil.isCollectionType(type)) {
                    int length = Integer.parseInt(compareValue);
                    result.add(String.valueOf(length));
                    result.add(String.valueOf(length + 1));
                    if (length - 1 > 0) {
                        result.add(String.valueOf(length - 1));
                    }
                    result.add(String.valueOf(0));
                }
            }
        } catch (NumberFormatException e) {
            Log.e("exception In getSuitableValuesFromParamConstraintInfo: " + e.toString());
        }
       return result;
    }

    private static Set<String> getRegexFromSimpleMethod(String methodName, List<String> paraList, String compareValue, String anyLiteral){
        Set<String> regexList = Sets.newHashSet();
        String subAnyLiteral = "";
        if (anyLiteral.isEmpty()) {
            anyLiteral = "[\\s\\S]";
        } else {
            subAnyLiteral = anyLiteral.substring(anyLiteral.indexOf("^(") + 2, anyLiteral.indexOf(")]") );
        }

        StringBuilder regex = new StringBuilder();
        try {
            switch (Objects.requireNonNull(SimpleStringAPIEnum.getByValue(methodName))){
                case ISEMPTY:
                    regexList.add(anyLiteral + "{1}" + anyLiteral + "*" + "##1");
                    regexList.add(anyLiteral + "{0}" + "##0");
                    break;
                case EQUALS:
                case COTENTEQUALS:
                case COMPARETO:
                case COMPARETO1:
                case COMPARETOIGNORECASE:
                case EQUALSIGNORECASE:
                    if (paraList.size() == 1) {
                        String var1 = Pattern.quote(paraList.get(0));
                        regex = new StringBuilder();
                        regex.append(var1);
                        regexList.add(regex.toString() + "##" + paraList.get(0).length());

                        regex = new StringBuilder();
                        regex.append("[^(").append(var1).append(")]+");
                        regexList.add(regex.toString() + "##1");
                    }
                    break;
                case REGIONMATCHES:
                    if (paraList.size() == 4) {
                        regex = new StringBuilder();
                        int offset = Integer.parseInt(paraList.get(2));
                        int len = Integer.parseInt(paraList.get(3));
                        String str = Pattern.quote(paraList.get(1).substring(offset, offset + len));

                        regex.append(anyLiteral).append("{").append(paraList.get(0)).append("}").
                                append(str).append(anyLiteral).append("*");
                        int l = paraList.get(0).length() + paraList.get(1).substring(offset, offset + len).length();
                        regexList.add(regex.toString() + "##" + l);


                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("+");
                        regexList.add(regex.toString() + "##1");
                    }

                    break;
                case REGIONMATCHES1:
                    if (paraList.size() == 5) {
                        regex = new StringBuilder();
                        int offset1 = Integer.parseInt(paraList.get(3));
                        int len1 = Integer.parseInt(paraList.get(4));
                        String str1 = Pattern.quote(paraList.get(2).substring(offset1, offset1 + len1));

                        regex.append(anyLiteral).append("{").append(paraList.get(1)).append("}").
                                append(str1).append(anyLiteral).append("*");
                        int l1 = paraList.get(1).length() + paraList.get(2).substring(offset1, offset1 + len1).length();
                        regexList.add(regex.toString() + "##" + l1);
                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("+");
                        regexList.add(regex.toString() + "##1");
                    }
                    break;
                case STARTSWITH:
                    if (paraList.size() == 2) {
                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("{").append(paraList.get(1)).append("}").
                                append(Pattern.quote(paraList.get(0))).append(anyLiteral).append("*");
                        int i1 = paraList.get(1).length() + paraList.get(0).length();
                        regexList.add(regex.toString() + "##" + i1);

                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("+");
                        regexList.add(regex.toString() + "##1");
                    }
                    break;
                case STARTSWITH1:
                case CONTAINS:
                    if (paraList.size() == 1) {
                        regex = new StringBuilder();
                        regex.append(Pattern.quote(paraList.get(0))).append(anyLiteral).append("*");
                        regexList.add(regex.toString() + "##" + paraList.get(0).length());

                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("+");
                        regexList.add(regex.toString() + "##1");
                    }
                    break;
                case ENDSWITH:

                    if (paraList.size() == 1) {
                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("*").append(Pattern.quote(paraList.get(0)));
                        regexList.add(regex.toString() + "##" + paraList.get(0).length());

                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("+");
                        regexList.add(regex.toString() + "##1");
                    }
                    break;

                case LENGTH:

                    regex = new StringBuilder();
                    int compareLength = Integer.parseInt(compareValue) - 1;
                    if (compareLength >= 0) {
                        regex.append(anyLiteral).append("{").append(compareLength).append("}");
                        regexList.add(regex.toString() + "##" + compareLength);
                    }

                    regex = new StringBuilder();
                    compareLength = Integer.parseInt(compareValue) + 1;
                    if (compareLength >= 0) {
                        regex.append(anyLiteral).append("{").append(compareLength).append("}");
                        regexList.add(regex.toString() + "##" + compareLength);
                    }

                    regex = new StringBuilder();
                    if (Integer.parseInt(compareValue) >= 0) {
                        regex.append(anyLiteral).append("{").append(compareValue).append("}");
                        regexList.add(regex.toString() + "##" + compareValue);
                    }

                    break;
                case INDEXOF:
                case INDEXOF2:
                    if (paraList.size() == 1) {
                        regex = new StringBuilder();
                        String para0 = paraList.get(0);
                        if (BaseUtil.isNumeric(para0)){
                            para0 = String.valueOf((char) Integer.parseInt(paraList.get(0)));
                        }
                        int para0Len = para0.length();
                        para0 = Pattern.quote(para0);

                        if (compareValue.equals("-1")) {
                            regex = new StringBuilder();
                            regex.append(anyLiteral).append("*").append(para0).append(anyLiteral).append("*");
                            regexList.add(regex.toString() + "##" + paraList.get(0).length());
                        } else {
                            if (Integer.parseInt(compareValue) >= 0) {
                                regex = new StringBuilder();
                                regex.append("[^(").append(para0).append(subAnyLiteral).append(")]{").append(compareValue).
                                        append("}").append(para0).append(anyLiteral).append("*");
                                int i12 = Integer.parseInt(compareValue) + para0Len;
                                regexList.add(regex.toString() + "##" +i12);
                            }


                            regex = new StringBuilder();
                            int indexLen1 = Integer.parseInt(compareValue) + 1;
                            if (indexLen1 >= 0) {
                                regex.append("[^(").append(para0).append(")]{").append(indexLen1).
                                        append("}").append(para0).append(anyLiteral).append("*");
                                int i1 = indexLen1 + para0Len;
                                regexList.add(regex.toString() + "##" + i1);
                            }


                            regex = new StringBuilder();
                            int indexLen2 = Integer.parseInt(compareValue) - 1;
                            if (indexLen2 >= 0) {
                                regex.append("[^(").append(para0).append(")]{").append(indexLen2).
                                        append("}").append(para0).append(anyLiteral).append("*");
                                int i2 = indexLen2 + para0Len;
                                regexList.add(regex.toString() + "##" + i2);
                            }
                        }
                    }
                    break;
                case INDEXOF1:
                case INDEXOF3:
                    if (paraList.size() == 2) {
                        regex = new StringBuilder();
                        String para00 = paraList.get(0);
                        if (BaseUtil.isNumeric(para00)){
                            para00 = String.valueOf((char) Integer.parseInt(paraList.get(0)));
                        }
                        int para0Len0 = para00.length();
                        String para0 = Pattern.quote(para00);
                        if (compareValue.equals("-1")) {
                            regex = new StringBuilder();
                            regex.append(anyLiteral).append("*").append(para0).append(anyLiteral).append("*");
                            regexList.add(regex.toString() + "##" + paraList.get(0).length());
                        } else {
                            regex = new StringBuilder();
                            Integer integer = Integer.parseInt(compareValue) - Integer.parseInt(paraList.get(1));
                            int i1_1 =Integer.parseInt(paraList.get(1)) + integer + para0Len0;
                            if (integer >= 0) {
                                regex.append(anyLiteral).append("{").append(paraList.get(1)).append("}").append("[^(").
                                        append(para0).append(subAnyLiteral).append(")]{").append(integer).append("}").
                                        append(para0).append(anyLiteral).append("*");
                                regexList.add(regex.toString() + "##" + i1_1);
                            }

                            regex = new StringBuilder();
                            int indexLen1 = integer + 1;
                            if (indexLen1 >= 0) {
                                regex.append(anyLiteral).append("{").append(paraList.get(1)).append("}").append("[^(").
                                        append(para0).append(")]{").append(indexLen1).append("}").append(para0).append(anyLiteral).append("*");
                                i1_1 = i1_1 + 1;
                                regexList.add(regex.toString() + "##" + i1_1);
                            }

                            regex = new StringBuilder();
                            int indexLen2 = integer - 1;
                            if (indexLen2 >= 0) {
                                regex.append(anyLiteral).append("{").append(paraList.get(1)).append("}").append("[^(").
                                        append(para0).append(")]{").append(indexLen2).append("}").append(para0).append(anyLiteral).append("*");
                                i1_1 = i1_1 - 2;
                                regexList.add(regex.toString() + "##" + i1_1);
                            }
                        }
                    }
                    break;
                case LASTINDEXOF:
                case LASTINDEXOF2:
                    if (paraList.size() == 1) {
                        regex = new StringBuilder();
                        String firstPara = paraList.get(0);
                        if (BaseUtil.isNumeric(firstPara)){
                            firstPara = String.valueOf((char) Integer.parseInt(paraList.get(0)));
                        }
                        int firatParaLen = firstPara.length();
                        firstPara = Pattern.quote(firstPara);

                        if (compareValue.equals("-1")) {
                            regex = new StringBuilder();
                            regex.append(anyLiteral).append("*").append(firstPara).append(anyLiteral).append("*");
                            regexList.add(regex.toString() + "##" + paraList.get(0).length());
                        } else {
                            regex = new StringBuilder();
                            regex.append(anyLiteral).append("{").append(compareValue).append("}").append(firstPara).
                                    append("[^(").append(firstPara).append(subAnyLiteral).append(")]*");
                            int i11 = Integer.parseInt(compareValue) + firatParaLen;
                            regexList.add(regex.toString() + "##" + i11);

                            regex = new StringBuilder();
                            int lastIndexLen1 = Integer.parseInt(compareValue) + 1;
                            if (lastIndexLen1 >= 0) {
                                regex.append(anyLiteral).append("{").append(lastIndexLen1).append("}").append(firstPara).
                                        append("[^(").append(firstPara).append(")]*");
                                i11 = i11 + 1;
                                regexList.add(regex.toString() + "##" + i11);
                            }


                            regex = new StringBuilder();
                            int lastIndexLen2 = Integer.parseInt(compareValue) - 1;
                            if (lastIndexLen2 >= 0) {
                                regex.append(anyLiteral).append("{").append(lastIndexLen2).append("}").append(firstPara).
                                        append("[^(").append(firstPara).append(")]*");
                                i11 = i11 - 2;
                                regexList.add(regex.toString() + "##" + i11);
                            }
                        }
                    }

                    break;
                case LASTINDEXOF1:
                case LASTINDEXOF3:
                    if (paraList.size() == 2) {
                        regex = new StringBuilder();
                        String firstPara0 = paraList.get(0);
                        if (BaseUtil.isNumeric(firstPara0)){
                            firstPara0 = String.valueOf((char) Integer.parseInt(paraList.get(0)));
                        }
                        int firatParaLen0 = firstPara0.length();
                        firstPara0 = Pattern.quote(firstPara0);

                        if (compareValue.equals("-1")) {
                            regex = new StringBuilder();
                            regex.append(anyLiteral).append("*").append(firstPara0).append(anyLiteral).append("*");
                            regexList.add(regex.toString() + "##" + paraList.get(0).length());
                        } else {
                            regex = new StringBuilder();
                            Integer integer0 = Integer.parseInt(paraList.get(1)) - Integer.parseInt(compareValue);
                            regex.append("[^(").append(firstPara0).append(subAnyLiteral).append(")]{").append(compareValue).append("}").
                                    append(firstPara0).append("[^(").append(firstPara0).append(subAnyLiteral).append(")]{").
                                    append(integer0).append("}").append(anyLiteral).append("*");
                            int i10 = Integer.parseInt(compareValue) + firatParaLen0 + integer0;
                            regexList.add(regex.toString() + "##" + i10);

                            regex = new StringBuilder();
                            int lastIndexLen1 = Integer.parseInt(compareValue) + 1;
                            if (lastIndexLen1 >= 0) {
                                regex.append("[^(").append(firstPara0).append(")]{").append(lastIndexLen1).append("}").
                                        append(firstPara0).append("[^(").append(firstPara0).append(")]{").
                                        append(integer0).append("}").append(anyLiteral).append("*");
                                i10 = i10 + 1;
                                regexList.add(regex.toString() + "##" + i10);
                            }

                            regex = new StringBuilder();
                            int lastIndexLen2 = Integer.parseInt(compareValue) - 1;
                            if (lastIndexLen2 >= 0) {
                                regex.append("[^(").append(firstPara0).append(")]{").append(lastIndexLen2).append("}").
                                        append(firstPara0).append("[^(").append(firstPara0).append(")]{").
                                        append(integer0).append("}").append(anyLiteral).append("*");
                                i10 = i10 - 2;
                                regexList.add(regex.toString() + "##" + i10);
                            }

                        }
                    }
                    break;
                case CHARAT:
                case CODEPOINTAT:
                case CODEPOINTBEFORE:
                    if (paraList.size() == 1) {
                        if (BaseUtil.isNumeric(compareValue)){
                            compareValue = String.valueOf((char) Integer.parseInt(compareValue));
                        }
                        String firstParam = methodName.equals("codePointBefore")? String.valueOf(Integer.parseInt(paraList.get(0)) - 1) : paraList.get(0);

                        // 长度小于charAt的长度
                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("{").append(firstParam).append("}");
                        regexList.add(regex.toString() + "##" + firstParam);

                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("{").append(firstParam).append("}").append(Pattern.quote(compareValue)).append(anyLiteral).append("*");
                        int i13 = Integer.parseInt(firstParam) + compareValue.length();
                        regexList.add(regex.toString() + "##" + i13);


                        regex = new StringBuilder();
                        int charAtLen1 = Integer.parseInt(firstParam) + 1;
                        int i1 = charAtLen1 + compareValue.length();
                        if (charAtLen1 >= 0 ) {
                            regex.append(anyLiteral).append("{").append(charAtLen1).append("}").append(Pattern.quote(compareValue)).append(anyLiteral).append("*");
                            regexList.add(regex.toString() + "##" + i1);
                        }


                        regex = new StringBuilder();
                        int charAtLen2 = Integer.parseInt(firstParam) - 1;
                        if (charAtLen2 >= 0 ) {
                            regex.append(anyLiteral).append("{").append(charAtLen2).append("}").append(Pattern.quote(compareValue)).append(anyLiteral).append("*");
                            i1 = charAtLen2 + compareValue.length();
                            regexList.add(regex.toString() + "##" + i1);
                        }
                    }

                    break;
                case MATCHES:
                    if (paraList.size() == 1) {
                        regex = new StringBuilder();
                        regex.append(paraList.get(0));
                        regexList.add(regex.toString() + "##" + paraList.get(0).length());
                        regex = new StringBuilder();
                        regex.append(anyLiteral).append("*");
                        regexList.add(regex.toString() + "##0");
                    }
                    break;
                case CODEPOINTCOUNT:
                case OFFSETBYCODEPOINTS:
                    regexList.add("[\\s\\S]*");
                    break;
            }
        } catch (Exception exception){
            return regexList;
        }
        return regexList;
    }

    public static Set<String[]> getRegexFromComplexMethod(String methodName, List<String> paraList, String compareValue, int arrayIndex, String anyLiteral){
        Set<String[]> result = Sets.newHashSet();

        if (anyLiteral.isEmpty()) {
            anyLiteral = "[\\s\\S]";
        }
        try {
            switch (Objects.requireNonNull(ComplexStringAPIEnum.getByValue(methodName))){

                case SUBSTRING:
                case SUBSTRING1:
                case SUBSEQUENCE:
                    int i1 = Integer.parseInt(paraList.get(0)) - 1;
                    if (i1 >= 0) {
                        result.add(new String[]{ anyLiteral + "{" + i1 + "}##" + i1, "false", "", ""});
                    }

                    if (paraList.size() == 1) {
                        // paraList.size() == 1
                        String[] regexArray0 = new String[]{"","true","","[\\s\\S]"};
                        regexArray0[0] = anyLiteral + "{" + paraList.get(0) + "}##" + paraList.get(0);
                        result.add(regexArray0);
                    } else if (paraList.size() == 2) {
                        String[] regexArray1 = new String[]{"","true","","[\\s\\S]"};
                        regexArray1[0] = anyLiteral + "{" + paraList.get(0) + "}##" + paraList.get(0);
                        int i = Integer.parseInt(paraList.get(1)) - Integer.parseInt(paraList.get(0));
                        regexArray1[2] = String.valueOf(i);
                        result.add(regexArray1);
                    }
                    break;
                case SPLIT:
                case SPLIT1:
                    if (arrayIndex == Integer.MAX_VALUE){
                        return result;
                    }
                    String var1 = paraList.get(0);

                    int i = 0;
                    String str1 = "";
                    while (i < arrayIndex) {
                        str1 = str1 + var1;
                        i++;
                    }

                    arrayIndex = arrayIndex - 1;
                    String str3 = "";
                    i = 0;
                    while (i < arrayIndex) {
                        str3 = str3 + var1;
                        i++;
                    }
                    String str4 = str3.isEmpty()?
                            "[^(" + Pattern.quote(var1) + ")]*" + Pattern.quote(var1):
                            Pattern.quote(str3) + "[^(" + Pattern.quote(var1) + ")]+" + Pattern.quote(var1);
                    int l = str3.length() + var1.length() + 1;
                    result.add(new String[]{str4 + "##" + l, "false", "", ""});


                    if (str1.isEmpty()) {
                        result.add(new String[]{"##0", "true", "", "[^(" +Pattern.quote(var1) + ")]" });
                    } else {
                        result.add(new String[]{Pattern.quote(str1) + "##" + str1.length(), "true", "", "[^(" +Pattern.quote(var1) + ")]" });
                    }

                    break;
                case REPLACEFIRST:
                case REPLACEALL:
                case REPLACE:
                case REPLACE1:
                    if (paraList.size() > 0) {
                        String[] regexArray6 = new String[]{"##0","true","",""};
                        String s = BaseUtil.convertCharIntToString(paraList.get(0));
                        if (s == null || s.isEmpty()) {
                            s = paraList.get(0);
                        }
                        regexArray6[3] = "[^(" + Pattern.quote(s) + ")]";
                        result.add(regexArray6);
                    }
                    break;
                case GETBYTES:
                case GETBYTES1:
                case GETBYTES2:
                case TOCHARARRAY:
                    // 处理str.getBytes()[1] == 109 这种类似的形式
                    if (arrayIndex == Integer.MAX_VALUE){
                        return result;
                    }
                    if (Objects.equals(ComplexStringAPIEnum.getByValue(methodName), ComplexStringAPIEnum.TOCHARARRAY)) {
                        if (BaseUtil.isNumeric(compareValue)){
                            compareValue = String.valueOf((char) Integer.parseInt(compareValue));
                        }
                    }


                    String[] regexArray8 = new String[]{"","false","",""};
                    int i2 = arrayIndex + compareValue.length();
                    if (arrayIndex >= 0) {
                        regexArray8[0] = anyLiteral + "{" + arrayIndex + "}" + Pattern.quote(compareValue) + anyLiteral + "*" + "##" + i2;
                        result.add(regexArray8);
                    }

                    String[] regexArray9 = new String[]{"","false","",""};
                    int getBytesLen1 = arrayIndex + 1;
                    i2 = i2 + 1;
                    if (getBytesLen1 >= 0) {
                        regexArray9[0] = anyLiteral + "{" + getBytesLen1 + "}" + compareValue + anyLiteral + "*" + "##" + i2;
                        result.add(regexArray9);
                    }

                    String[] regexArray10 = new String[]{"","false","",""};
                    int getBytesLen2 = arrayIndex - 1;
                    i2 = i2 - 2;
                    if (getBytesLen2 >= 0 ) {
                        regexArray10[0] = anyLiteral + "{" + getBytesLen2 + "}" + compareValue + anyLiteral + "*" + "##" + i2;
                        result.add(regexArray10);
                    }
                    break;
                case TRIM:
                    String[] regexArray1 = new String[]{"##0","","","[^( ?\\t\\n\\v\\f\\r\\x0085\\x00a0\\u2028\\u2029)]"};
                    result.add(regexArray1);
                    break;
                case TOSTRING:
                case TOUPPERCASE:
                case TOUPPERCASE1:
                case TOLOWERCASE:
                case TOLOWERCASE1:
                    String[] regexArray = new String[]{"##0","","",""};
                    result.add(regexArray);
                    break;
            }
        } catch (Exception exception) {
            return result;
        }

        return result;
    }

    public static List<List<SimpleMethodCallDTO>> transferToSimpleMethodCall(List<MethodCallDTO> methodCallCopyList){
        List<List<SimpleMethodCallDTO>> sameMethodCallLists = Lists.newArrayList();
        for (MethodCallDTO methodCallCopy : methodCallCopyList) {
            List<SimpleMethodCallDTO> sameMethodCallList = Lists.newArrayList();

            Map<Integer, Set<String>> paramMap = methodCallCopy.getParamMap();
            String methodSig = methodCallCopy.getMethodSig();
            int arrayIndex = methodCallCopy.getArrayIndex();

            if (paramMap.isEmpty()) {
                SimpleMethodCallDTO simpleMethodCall = new SimpleMethodCallDTO(methodSig, Lists.newArrayList(), arrayIndex);
                sameMethodCallList.add(simpleMethodCall);
            } else {
                List<List<String>> temp = Lists.newArrayList();
                for (int i = 0; i < paramMap.size(); i++) {
                    if (!paramMap.containsKey(i)) {
                        return null;
                    }
                    Set<String> strings = paramMap.get(i);
                    List<String> aList = Lists.newArrayList();
                    aList.addAll(strings);
                    temp.add(aList);
                }

                if (!temp.isEmpty()) {
                    List<List<String>> paramLists = Lists.cartesianProduct(temp);
                    for (List<String> paramList : paramLists) {
                        SimpleMethodCallDTO simpleMethodCall = new SimpleMethodCallDTO(methodSig, paramList, arrayIndex);
                        sameMethodCallList.add(simpleMethodCall);
                    }
                }
            }
            if (!sameMethodCallList.isEmpty()) {
                sameMethodCallLists.add(sameMethodCallList);
            }
        }

        return Lists.cartesianProduct(sameMethodCallLists);
    }

    private static List<Set<String>> upToMergeRegex(String[] upperRegexArray, Set<String> lowerRegexList ){
        List<Set<String>> result = Lists.newArrayList();
        Set<String> finalRegex = Sets.newHashSet();
        Set<String> canMergeAgainRegex = Sets.newHashSet();
        if (upperRegexArray[0].split("##").length != 2) {
            result.add(finalRegex);
            result.add(canMergeAgainRegex);
            return result;
        }
        String[] upperSplit = upperRegexArray[0].split("##");

        if (upperRegexArray[1].equals("false")) {
            // not allow splicing
            finalRegex.add(upperRegexArray[0]);
        } else {
            // allow splicing
            if (lowerRegexList.isEmpty()) {
                canMergeAgainRegex.add(upperSplit[0]);
            } else {
                if (upperRegexArray[2].isEmpty()){
                    // the allowed length to splice is unlimited
                    for (String tempRegex : lowerRegexList) {
                        if (tempRegex.split("##").length != 2) {
                            continue;
                        }
                        try {
                            String replaceRegex = tempRegex.split("##")[0].replaceAll(Pattern.quote("[\\\\s\\\\S]"), upperRegexArray[3]);

                            if (!upperRegexArray[3].isEmpty() && upperRegexArray[3].contains("\\Q") && !upperRegexArray[3].equals("[\\s\\S]*")) {
                                replaceRegex = replaceRegex.replaceAll(Pattern.quote("[\\s\\S]"), upperRegexArray[3].replace("\\Q","\\\\Q").replace("\\E","\\\\E"));
                            }
                            int l = Integer.parseInt(upperSplit[1]) + Integer.parseInt(tempRegex.split("##")[1]);
                            String s1 = upperSplit[0] + replaceRegex + "##" + l;
                            canMergeAgainRegex.add(s1);

                        } catch (Exception e) { }

                    }

                } else {
                    // the allowed length to splice is limited
                    int limitLength = Integer.parseInt(upperRegexArray[2]);
                    for (String tempRegex : lowerRegexList) {
                        if (tempRegex.split("##").length != 2) {
                            continue;
                        }
                        int oldLength = Integer.parseInt(tempRegex.split("##")[1]);
                        if (oldLength <= limitLength) {
                            String replaceRegex = tempRegex.split("##")[0];
                            String replace = replaceRegex.replace("[\\\\s\\\\S]", upperRegexArray[3]).
                                    replace("[\\s\\S]", upperRegexArray[3]).
                                    replace("*", "{" + String.valueOf(limitLength - oldLength) + "}");
                            while (!replaceRegex.equals(replace)) {
                                replaceRegex = replace;
                                replace = replaceRegex.replace("[\\\\s\\\\S]", upperRegexArray[3]).
                                        replace("[\\s\\S]", upperRegexArray[3]).
                                        replace(Pattern.quote("*"), "{" + String.valueOf(limitLength - oldLength) + "}");
                            }

                            int l = Integer.parseInt(upperSplit[1]) + Integer.parseInt(tempRegex.split("##")[1])
                                    + limitLength - oldLength;
                            String s1 = upperSplit[0] + replaceRegex + "##" + l;
                            canMergeAgainRegex.add(s1);
                        }
                    }
                }
            }
        }

        result.add(finalRegex);
        result.add(canMergeAgainRegex);
        return result;
    }
}