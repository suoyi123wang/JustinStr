public class Single {
    // <java.lang.String: boolean contains(java.lang.CharSequence)>#
    public static boolean test1(String str){
        if (str.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test2(String str){
        if (str.contains(":")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test3(String str){
        if (str.contains("..")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test4(String str){
        if (str.contains("Debug")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test5(String str){
        if (str.contains("forbidden")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean endsWith(java.lang.String)>#
    public static boolean test6(String str){
        if (str.endsWith(";")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test7(String str){
        if (str.endsWith("\\")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test8(String str){
        if (str.endsWith("+")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test9(String str){
        if (str.endsWith(".")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test10(String str){
        if (str.endsWith(".ok")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean equals(java.lang.Object)>#
    public static boolean test11(String str){
        if (str.equals("<init>")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test12(String str){
        if (str.equals("$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test13(String str){
        if (str.equals("ANT")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test14(String str){
        if (str.equals("DER")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test15(String str){
        if (str.equals("DL")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean equalsIgnoreCase(java.lang.String)>#
    public static boolean test16 (String str){
        if (str.equalsIgnoreCase("ant-type")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test17(String str){
        if (str.equalsIgnoreCase("PEM")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test18(String str){
        if (str.equalsIgnoreCase("PKCS7")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test19(String str){
        if (str.equalsIgnoreCase("PkiPath")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test20(String str){
        if (str.equalsIgnoreCase("none")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean isEmpty()>#
    public static boolean test21(String str){
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test22(String str){
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test23(String str){
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test24(String str){
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test25(String str){
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean matches(java.lang.String)>#
    public static boolean test26(String str){
        if (str.matches("^[0-7]+$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test27(String str){
        if (str.matches(":[^,\\[\\]{}\\n\\t ]+")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test28(String str){
        if (str.matches("\\p{Alpha}+[-//.\\w]*")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test29(String str){
        if (str.matches("\\d+")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test30(String str){
        if (str.matches("[0-9a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean regionMatches(boolean,int,java.lang.String,int,int)>#
    public static boolean test31(String str){
        if (str.regionMatches(true,0,"local:",0,6)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test32(String str){
        if (str.regionMatches(true,0,"file:",0,5)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test33(String str){
        if (str.regionMatches(true,0,"scm:svn:",0,8)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test34(String str){
        if (str.regionMatches(true,0,"local:",0,6)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test35(String str){
        if (str.regionMatches(true,0,"file:",0,5)) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean regionMatches(int,java.lang.String,int,int)>#
    public static boolean test36(String str){
        if (str.regionMatches(0,"Infinity",0,8)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test37(String str){
        if (str.regionMatches(1,"svn:",0,2)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test38(String str){
        if (str.regionMatches(0,"Infinity",0,8)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test39(String str){
        if (str.regionMatches(1,"svn",0,2)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test40(String str){
        if (str.regionMatches(0,"Infinity",0,8)) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean startsWith(java.lang.String)>#
    public static boolean test41(String str){
        if (str.startsWith("module$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test42(String str){
        if (str.startsWith("\"")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test43(String str){
        if (str.startsWith("$1$")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test44(String str){
        if (str.startsWith("&#")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test45(String str){
        if (str.startsWith("!")) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: boolean startsWith(java.lang.String,int)>#
    public static boolean test46(String str){
        if (str.startsWith("0X",1)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test47(String str){
        if (str.startsWith("data:",1)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test48(String str){
        if (str.startsWith("data:",0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test49(String str){
        if (str.startsWith("*",0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test50(String str){
        if (str.startsWith("*",2)) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: char charAt(int)>#
    public static boolean test51(String str){
        if (str.charAt(0) == 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test52(String str){
        if (str.charAt(1) == 35) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test53(String str){
        if (str.charAt(1) == 58) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test54(String str){
        if (str.charAt(0) == 122) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test55(String str){
        if (str.charAt(0) == 127) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: char[] toCharArray()>#
    public static boolean test56(String str){
        if (str.toCharArray()[0] == '+') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean test57(String str){
        if (str.toCharArray()[1] == 45) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test58(String str){
        if (str.toCharArray()[0] == 58) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test59(String str){
        if (str.toCharArray()[0] == 56) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test60(String str){
        if (str.toCharArray()[1] == 39) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int codePointAt(int)>#
    public static boolean test61 (String str){
        if (str.codePointAt(0) == 31) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test62 (String str){
        if (str.codePointAt(0) == 127) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test63 (String str){
        if (str.codePointAt(0) == 35) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test64 (String str){
        if (str.codePointAt(0) == 31) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test65 (String str){
        if (str.codePointAt(0) == 127) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int indexOf(int)>#
    public static boolean test66(String str){
        if (str.indexOf(36) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test67(String str){
        if (str.indexOf(125) == -1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test68(String str){
        if (str.indexOf(46) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test69(String str){
        if (str.indexOf(58) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test70(String str){
        if (str.indexOf(34) == -1) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int indexOf(int,int)>#
    public static boolean test71(String str){
        if (str.indexOf(123,0) == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test72(String str){
        if (str.indexOf(42,2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test73(String str){
        if (str.indexOf(47,2) == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test74(String str){
        if (str.indexOf(58,5) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test75(String str){
        if (str.indexOf(92,2) == 2) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int indexOf(java.lang.String)>#
    public static boolean test76(String str){
        if (str.indexOf("]]>") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test77(String str){
        if (str.indexOf("${") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test78(String str){
        if (str.indexOf("-") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test79(String str){
        if (str.indexOf("//") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test80(String str){
        if (str.indexOf(":") == -1) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int indexOf(java.lang.String,int)>#
    public static boolean test81(String str){
        if (str.indexOf("interpretLoop", 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test82(String str){
        if (str.indexOf("Interpreter", 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test83(String str){
        if (str.indexOf(":", 1) == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test84(String str){
        if (str.indexOf("org.", 2) == -1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test85(String str){
        if (str.indexOf("Interpreter", 0) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int lastIndexOf(int)>#
    public static boolean test86(String str){
        if (str.lastIndexOf(36) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test87(String str){
        if (str.lastIndexOf(46) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test88(String str){
        if (str.lastIndexOf(46) == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test89(String str){
        if (str.lastIndexOf(46) == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test90(String str){
        if (str.lastIndexOf(95) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int lastIndexOf(java.lang.String)>#
    public static boolean test91(String str){
        if (str.lastIndexOf("/") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test92(String str){
        if (str.lastIndexOf(".") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test93(String str){
        if (str.lastIndexOf("@+id/") == -1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test94(String str){
        if (str.lastIndexOf("#") == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test95(String str){
        if (str.lastIndexOf("/") == 0) {
            return true;
        } else {
            return false;
        }
    }

    // <java.lang.String: int length()>#
    public static boolean test96(String str){
        if (str.length() == 3) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test97(String str){
        if (str.length() == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test98(String str){
        if (str.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test99(String str){
        if (str.length() < 7) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean test100(String str){
        if (str.length() == 4) {
            return true;
        } else {
            return false;
        }
    }

}
