import java.util.*;
// for title: can-convert-string-in-k-moves
public class Solution_70 {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int difference = t.charAt(i) - s.charAt(i);
            if (difference < 0) {
                difference += 26;
            }
            counts[difference]++;
        }
        for (int i = 1; i < 26; i++) {
            int maxConvert = i + 26 * (counts[i] - 1);
            if (maxConvert > k) {
                return false;
            }
        }
        return true;
    }
}