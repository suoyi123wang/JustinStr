import java.util.*;
// for title: split-a-string-into-the-max-number-of-unique-substrings
public class Solution_58 {
    int maxSplit = 1;

    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<String>();
        backtrack(0, 0, s, set);
        return maxSplit;
    }

    public void backtrack(int index, int split, String s, Set<String> set) {
        int length = s.length();
        if (index >= length) {
            maxSplit = Math.max(maxSplit, split);
        } else {
            for (int i = index; i < length; i++) {
                String substr = s.substring(index, i + 1);
                if (set.add(substr)) {
                    backtrack(i + 1, split + 1, s, set);
                    set.remove(substr);
                }
            }
        }
    }
}