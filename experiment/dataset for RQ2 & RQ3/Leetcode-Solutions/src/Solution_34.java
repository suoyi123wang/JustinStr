import java.util.*;
// for title: zuo-xuan-zhuan-zi-fu-chuan-lcof
public class Solution_34 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
