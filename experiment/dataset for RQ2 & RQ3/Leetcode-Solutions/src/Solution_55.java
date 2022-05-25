import java.util.*;
// for title: reformat-phone-number
public class Solution_55 {
    public String reformatNumber(String number) {
        final int BLOCK_SIZE = 3, SMALL_BLOCK_SIZE = 2;
        int digits = 0;
        int length = number.length();
        for (int i = 0; i < length; i++) {
            char c = number.charAt(i);
            if (Character.isDigit(c)) {
                digits++;
            }
        }
        StringBuffer sb = new StringBuffer();
        int index = 0;
        while (digits > 4) {
            int curBlockSize = BLOCK_SIZE;
            while (curBlockSize > 0) {
                char c = number.charAt(index);
                if (Character.isDigit(c)) {
                    sb.append(c);
                    curBlockSize--;
                }
                index++;
            }
            digits -= BLOCK_SIZE;
            sb.append('-');
        }
        if (digits == 4) {
            int curBlockSize = SMALL_BLOCK_SIZE;
            while (curBlockSize > 0) {
                char c = number.charAt(index);
                if (Character.isDigit(c)) {
                    sb.append(c);
                    curBlockSize--;
                }
                index++;
            }
            digits -= SMALL_BLOCK_SIZE;
            sb.append('-');
        }
        while (index < length) {
            char c = number.charAt(index);
            if (Character.isDigit(c)) {
                sb.append(c);
            }
            index++;
        }
        return sb.toString();
    }
}