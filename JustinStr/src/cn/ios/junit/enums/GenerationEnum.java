package cn.ios.junit.enums;

public enum GenerationEnum {

    JAVA_UTIL_COLLECTION("java.util.Collection"),
    OUTPUT_FOLDER("JustinStr_tests")
    ;
    
    private String value;

    GenerationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
