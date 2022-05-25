package cn.ios.junit.enums;

public enum SimpleStringAPIEnum {
    ISEMPTY("<java.lang.String: boolean isEmpty()>"),
    EQUALS("<java.lang.String: boolean equals(java.lang.Object)>"),
    COTENTEQUALS("<java.lang.String: boolean contentEquals(java.lang.CharSequence)>"),
    EQUALSIGNORECASE("<java.lang.String: boolean equalsIgnoreCase(java.lang.String)>"),
    COMPARETO("<java.lang.String: int compareTo(java.lang.String)>"),
    COMPARETO1("<java.lang.String: int compareTo(java.lang.Object)>"),
    COMPARETOIGNORECASE("<java.lang.String: int compareToIgnoreCase(java.lang.String)>"),
    STARTSWITH("<java.lang.String: boolean startsWith(java.lang.String,int)>"),
    STARTSWITH1("<java.lang.String: boolean startsWith(java.lang.String)>"),
    ENDSWITH("<java.lang.String: boolean endsWith(java.lang.String)>"),
    CONTAINS("<java.lang.String: boolean contains(java.lang.CharSequence)>"),
    INDEXOF("<java.lang.String: int indexOf(int)>"),
    INDEXOF1("<java.lang.String: int indexOf(java.lang.String,int)>"),
    INDEXOF2("<java.lang.String: int indexOf(java.lang.String)>"),
    INDEXOF3("<java.lang.String: int indexOf(int,int)>"),
    LASTINDEXOF("<java.lang.String: int lastIndexOf(int)>"),
    LASTINDEXOF1("<java.lang.String: int lastIndexOf(int,int)>"),
    LASTINDEXOF2("<java.lang.String: int lastIndexOf(java.lang.String)>"),
    LASTINDEXOF3("<java.lang.String: int lastIndexOf(java.lang.String,int)>"),
    CHARAT("<java.lang.String: char charAt(int)>"),
    CODEPOINTAT("<java.lang.String: int codePointAt(int)>"),
    CODEPOINTCOUNT("<java.lang.String: int codePointCount(int,int)>"),
    LENGTH("<java.lang.String: int length()>"),
    CODEPOINTBEFORE("<java.lang.String: int codePointBefore(int)>"),
    OFFSETBYCODEPOINTS("<java.lang.String: int offsetByCodePoints(int,int)>"),
    REGIONMATCHES("<java.lang.String: boolean regionMatches(int,java.lang.String,int,int)>"),
    REGIONMATCHES1("<java.lang.String: boolean regionMatches(boolean,int,java.lang.String,int,int)>"),
    MATCHES("<java.lang.String: boolean matches(java.lang.String)>");

    private String methodName;

    SimpleStringAPIEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public static boolean isSimpleAPI(String methodName){
        for (SimpleStringAPIEnum simpleAPI : SimpleStringAPIEnum.values()) {
            if (simpleAPI.getMethodName().equals(methodName)) {
                return true;
            }
        }
        return false;
    }

    public static SimpleStringAPIEnum getByValue(String methodName){
        for(SimpleStringAPIEnum simpleAPIs : values()){
            if (simpleAPIs.getMethodName().equals(methodName)) {
                return simpleAPIs;
            }
        }
        return null;
    }
}
