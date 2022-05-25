package cn.ios.junit.constraint.DTO;

import com.google.common.collect.Lists;
import soot.Type;

import java.util.List;

public class ParamConstraintDTO {
    private int paramIndex = -1;
    private Type paramType = null;

    private List<MethodCallDTO> methodCallList = Lists.newArrayList();

    private List<String> arithmeticList = Lists.newArrayList();

    private String compareValue = "";
    private String operator = "";

    private boolean hasMemberField = false;
    private String fieldName = "";
    private Type fieldType = null;


    private boolean isDealingMethodArg = false;
    private boolean isDealingMethodCaller = false;
    private boolean paramAsMethodCaller = true;


    public int getParamIndex() {
        return paramIndex;
    }

    public void setParamIndex(int paramIndex) {
        this.paramIndex = paramIndex;
    }

    public List<MethodCallDTO> getMethodCallList() {
        return methodCallList == null ? Lists.newArrayList() : methodCallList;
    }

    public void setMethodCallList(List<MethodCallDTO> methodCallList) {
        this.methodCallList = methodCallList;
    }

    public List<String> getArithmeticList() {
        return arithmeticList == null? Lists.newArrayList() : arithmeticList;
    }

    public void setArithmeticList(List<String> arithmeticList) {
        this.arithmeticList = arithmeticList;
    }

    public Type getParamType() {
        return paramType;
    }

    public void setParamType(Type paramType) {
        this.paramType = paramType;
    }

    public String getCompareValue() {
        return compareValue;
    }

    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isParamAsMethodCaller() {
        return paramAsMethodCaller;
    }

    public void setParamAsMethodCaller(boolean paramAsMethodCaller) {
        this.paramAsMethodCaller = paramAsMethodCaller;
    }

    public boolean isDealingMethodCaller() {
        return isDealingMethodCaller;
    }

    public void setDealingMethodCaller(boolean dealingMethodCaller) {
        isDealingMethodCaller = dealingMethodCaller;
    }

    public boolean isDealingMethodArg() {
        return isDealingMethodArg;
    }

    public void setDealingMethodArg(boolean dealingMethodArg) {
        isDealingMethodArg = dealingMethodArg;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public boolean isHasMemberField() {
        return hasMemberField;
    }

    public void setHasMemberField(boolean hasMemberField) {
        this.hasMemberField = hasMemberField;
    }

    public Type getFieldType() {
        return fieldType;
    }

    public void setFieldType(Type fieldType) {
        this.fieldType = fieldType;
    }
}
