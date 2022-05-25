import java.util.*;
// for title: maximum-number-of-non-overlapping-substrings
public class Solution_71 {
    public List<String> maxNumOfSubstrings(String s) {
        Seg[] seg = new Seg[26];
        for (int i = 0; i < 26; ++i) {
            seg[i] = new Seg(-1, -1);
        }
        // 预处理左右端点
        for (int i = 0; i < s.length(); ++i) {
            int char_idx = s.charAt(i) - 'a';
            if (seg[char_idx].left == -1) {
                seg[char_idx].left = seg[char_idx].right = i;
            } else {
                seg[char_idx].right = i;
            }
        }
        for (int i = 0; i < 26; ++i) {
            if (seg[i].left != -1) {
                for (int j = seg[i].left; j <= seg[i].right; ++j) {
                    int char_idx = s.charAt(j) - 'a';
                    if (seg[i].left <= seg[char_idx].left && seg[char_idx].right <= seg[i].right) {
                        continue;
                    }
                    seg[i].left = Math.min(seg[i].left, seg[char_idx].left);
                    seg[i].right = Math.max(seg[i].right, seg[char_idx].right);
                    j = seg[i].left;
                }
            }
        }
        // 贪心选取
        Arrays.sort(seg);
        List<String> ans = new ArrayList<String>();
        int end = -1;
        for (Seg segment : seg) {
            int left = segment.left, right = segment.right;
            if (left == -1) {
                continue;
            }
            if (end == -1 || left > end) {
                end = right;
                ans.add(s.substring(left, right + 1));
            }
        }
        return ans;
    }

    public class Seg implements Comparable<Seg> {
        int left, right;

        public Seg(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int compareTo(Seg rhs) {
            if (right == rhs.right) {
                return rhs.left - left;
            }
            return right - rhs.right;
        }
    }
}