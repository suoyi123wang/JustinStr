import java.util.*;
// for title: longest-uncommon-subsequence-i
public class Solution_195 {
    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}