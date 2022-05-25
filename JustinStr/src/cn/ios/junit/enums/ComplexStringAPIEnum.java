package cn.ios.junit.enums;

public enum ComplexStringAPIEnum {
    GETBYTES("<java.lang.String: byte[] getBytes()>"),
    GETBYTES1("<java.lang.String: byte[] getBytes(java.nio.charset.Charset)>"),
    GETBYTES2("<java.lang.String: byte[] getBytes(java.lang.String)>"),
    SUBSTRING("<java.lang.String: java.lang.String substring(int)>"),
    SUBSTRING1("<java.lang.String: java.lang.String substring(int,int)>"),
    SUBSEQUENCE("<java.lang.String: java.lang.CharSequence subSequence(int,int)>"),
    REPLACE("<java.lang.String: java.lang.String replace(char,char)>"),
    REPLACE1("<java.lang.String: java.lang.String replace(java.lang.CharSequence,java.lang.CharSequence)>"),
    REPLACEFIRST("<java.lang.String: java.lang.String replaceFirst(java.lang.String,java.lang.String)>"),
    REPLACEALL("<java.lang.String: java.lang.String replaceAll(java.lang.String,java.lang.String)>"),
    SPLIT("<java.lang.String: java.lang.String[] split(java.lang.String,int)>"),
    SPLIT1("<java.lang.String: java.lang.String[] split(java.lang.String)>"),
    TOLOWERCASE("<java.lang.String: java.lang.String toLowerCase(java.util.Locale)>"),
    TOLOWERCASE1("<java.lang.String: java.lang.String toLowerCase()>"),
    TOUPPERCASE("<java.lang.String: java.lang.String toUpperCase(java.util.Locale)>"),
    TOUPPERCASE1("<java.lang.String: java.lang.String toUpperCase()>"),
    TRIM("<java.lang.String: java.lang.String trim()>"),
    TOSTRING("<java.lang.String: java.lang.String toString()>"),
    TOCHARARRAY("<java.lang.String: char[] toCharArray()>");

    private String methodName;

    ComplexStringAPIEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public static boolean isComplexAPI(String methodSig){
        for (ComplexStringAPIEnum complexAPI : values()) {
            if (complexAPI.getMethodName().equals(methodSig)) {
                return true;
            }
        }
        return false;
    }

    public static ComplexStringAPIEnum getByValue(String methodName){
        for(ComplexStringAPIEnum complexAPIs : values()){
            if (complexAPIs.getMethodName().equals(methodName)) {
                return complexAPIs;
            }
        }
        return null;
    }

}
