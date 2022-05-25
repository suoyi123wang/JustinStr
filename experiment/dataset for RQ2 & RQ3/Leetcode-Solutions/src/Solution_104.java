import java.util.*;
// for title: break-a-palindrome
public class Solution_104 {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) {
            return "";
        }
        char[] array = palindrome.toCharArray();
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            char c = array[i];
            if (c != 'a') {
                array[i] = 'a';
                return new String(array);
            }
        }
        array[n - 1] = 'b';
        return new String(array);
    }
}
