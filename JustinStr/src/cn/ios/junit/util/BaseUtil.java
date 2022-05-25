package cn.ios.junit.util;

public class BaseUtil {
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String convertCharIntToString(String charInt) {
        if (isNumeric(charInt)) {
            return String.valueOf((char) Integer.parseInt(charInt));
        }
        return null;
    }

}
