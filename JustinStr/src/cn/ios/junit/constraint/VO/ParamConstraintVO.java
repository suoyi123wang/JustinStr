package cn.ios.junit.constraint.VO;

import cn.ios.junit.util.TypeUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import soot.Type;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParamConstraintVO {
    private int paramIndex = -1;
    private Type paramType = null;

    private Set<String> possibleValuesForSimpleType = Sets.newHashSet();

    private List<String> arithmeticList = Lists.newArrayList();

    private Map<String, Set<String>> possibleValuesForObject = Maps.newHashMap();

    private int numsOfPossibleValues;

    public ParamConstraintVO(int paramIndex, Type paramType) {
        this.paramIndex = paramIndex;
        this.paramType = paramType;
    }

    public int getParamIndex() {
        return paramIndex;
    }

    public void setParamIndex(int paramIndex) {
        this.paramIndex = paramIndex;
    }

    public Type getParamType() {
        return paramType;
    }

    public void setParamType(Type paramType) {
        this.paramType = paramType;
    }

    public Set<String> getPossibleValuesForSimpleType() {
        return possibleValuesForSimpleType == null? Sets.newHashSet() : possibleValuesForSimpleType;
    }

    public void setPossibleValuesForSimpleType(Set<String> possibleValuesForSimpleType) {
        this.possibleValuesForSimpleType = possibleValuesForSimpleType;
    }

    public void setArithmeticList(List<String> arithmeticList) {
        this.arithmeticList = arithmeticList;
    }

    public int getNumsOfPossibleValues() {
        return numsOfPossibleValues;
    }

    public void setNumsOfPossibleValues(){
        if ((TypeUtil.isPrimType(paramType) || TypeUtil.isStringType(paramType) )
                && !possibleValuesForSimpleType.isEmpty()) {
            numsOfPossibleValues = possibleValuesForSimpleType.size();
        }
    }
}
