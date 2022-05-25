package cn.ios.junit.constraint.DTO;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;
public class MethodCallDTO {
    private String methodSig = "";
    private Map<Integer, Set<String>> paramMap = Maps.newHashMap();
    private int currentMethodArgIndex = -1;
    private int arrayIndex = Integer.MAX_VALUE;

    public String getMethodSig() {
        return methodSig;
    }

    public void setMethodSig(String methodSig) {
        this.methodSig = methodSig;
    }

    public Map<Integer, Set<String>> getParamMap() {
        return paramMap == null? Maps.newHashMap() : paramMap;
    }

    public void setParamMap(Map<Integer, Set<String>> paramMap) {
        this.paramMap = paramMap;
    }

    public int getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    public int getCurrentMethodArgIndex() {
        return currentMethodArgIndex;
    }

    public void setCurrentMethodArgIndex(int currentMethodArgIndex) {
        this.currentMethodArgIndex = currentMethodArgIndex;
    }
}
