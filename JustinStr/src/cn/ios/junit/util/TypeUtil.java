package cn.ios.junit.util;

import cn.ios.junit.enums.ComplexStringAPIEnum;
import cn.ios.junit.enums.GenerationEnum;
import cn.ios.junit.enums.SimpleStringAPIEnum;
import soot.*;

public class TypeUtil {
    public static boolean isPrimType(Type type){
        return type instanceof PrimType;
    }

    public static boolean isStringType(Type type){
        return type.toString().equals("java.lang.String");
    }

    public static boolean isIntType(Type type){
        return type instanceof IntType;
    }

    public static boolean isShortType(Type type){
        return type instanceof ShortType;
    }

    public static boolean isLongType(Type type){
        return type instanceof LongType;
    }

    public static boolean isFloatType(Type type){
        return type instanceof FloatType;
    }

    public static boolean isDoubleType(Type type){
        return type instanceof DoubleType;
    }

    public static boolean isByteType(Type type){
        return type instanceof ByteType;
    }

    public static boolean isCharType(Type type){
        return type instanceof CharType;
    }

    public static boolean isBooleanType(Type type){
        return type instanceof BooleanType;
    }

    public static boolean isArrayType(Type type){
        return type instanceof ArrayType;
    }

    public static boolean isCollectionType(Type type){
        SootClass sootClass = Scene.v().getSootClass(type.toString());
        return ClassUtil.isInheritedFromGivenClass(sootClass, GenerationEnum.JAVA_UTIL_COLLECTION.getValue());
    }

    public static boolean isCanDealMethod(String methodSig) {
        return SimpleStringAPIEnum.isSimpleAPI(methodSig) ||
                ComplexStringAPIEnum.isComplexAPI(methodSig) ||
                methodSig.contains("get");
    }
}
