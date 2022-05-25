package cn.ios.junit.constraint.DTO;

import com.google.common.collect.Lists;

import java.util.List;

public class SimpleMethodCallDTO {
    private String methodSig;
    private List<String> paramList = Lists.newArrayList();
    private int arrayIndex = Integer.MAX_VALUE;


    public SimpleMethodCallDTO(String methodName, List<String> paramList, int arrayIndex) {
        this.methodSig = methodName;
        this.paramList = paramList;
        this.arrayIndex = arrayIndex;
    }

    public String getMethodSig() {
        return methodSig;
    }

    public void setMethodSig(String methodSig) {
        this.methodSig = methodSig;
    }

    public List<String> getParamList() {
        return paramList == null ? Lists.newArrayList() : paramList;
    }

    public void setParamList(List<String> paramList) {
        this.paramList = paramList;
    }

    public int getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }
}
