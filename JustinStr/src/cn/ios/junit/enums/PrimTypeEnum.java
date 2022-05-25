package cn.ios.junit.enums;

public enum PrimTypeEnum {
    INT("int"),
    SHORT("short"),
    LONG("long"),
    BYTE("byte"),
    BOOLEAN("boolean"),
    CHAR("char"),
    FLOAT("float"),
    DOUBLE("double"),
    INTEGER("java.lang.Integer");

    private String primTypeName;

    PrimTypeEnum(String primTypeName) {
        this.primTypeName = primTypeName;
    }

    public String getPrimTypeName() {
        return primTypeName;
    }

    public void setPrimTypeName(String primTypeName) {
        this.primTypeName = primTypeName;
    }

    public static PrimTypeEnum getByValue(String primTypeName){
        for (PrimTypeEnum primType : values()) {
            if (primType.getPrimTypeName().equals(primTypeName)) {
                return primType;
            }
        }
        return null;
    }
}
