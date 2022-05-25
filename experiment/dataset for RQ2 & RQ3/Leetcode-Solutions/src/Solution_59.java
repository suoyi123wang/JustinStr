import java.util.*;
// for title: check-if-string-is-transformable-with-substring-sort-operations
public class Solution_59 {
    public boolean isTransformable(String s, String t) {
        int n = s.length();
        Queue<Integer>[] pos = new Queue[10];
        for (int i = 0; i < 10; ++i) {
            pos[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < n; ++i) {
            pos[s.charAt(i) - '0'].offer(i);
        }
        for (int i = 0; i < n; ++i) {
            int digit = t.charAt(i) - '0';
            if (pos[digit].isEmpty()) {
                return false;
            }
            for (int j = 0; j < digit; ++j) {
                if (!pos[j].isEmpty() && pos[j].peek() < pos[digit].peek()) {
                    return false;
                }
            }
            pos[digit].poll();
        }
        return true;
    }
}