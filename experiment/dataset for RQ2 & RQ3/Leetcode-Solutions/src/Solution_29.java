import java.util.*;
// for title: re-space-lcci
public class Solution_29 {
    public int respace(String[] dictionary, String sentence) {
        int n = sentence.length();

        Trie1 root = new Trie1();
        for (String word: dictionary) {
            root.insert(word);
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            dp[i] = dp[i - 1] + 1;

            Trie1 curPos = root;
            for (int j = i; j >= 1; --j) {
                int t = sentence.charAt(j - 1) - 'a';
                if (curPos.next[t] == null) {
                    break;
                } else if (curPos.next[t].isEnd) {
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
                if (dp[i] == 0) {
                    break;
                }
                curPos = curPos.next[t];
            }
        }
        return dp[n];
    }
}

 class Trie1 {
    public Trie1[] next;
    public boolean isEnd;

    public Trie1() {
        next = new Trie1[26];
        isEnd = false;
    }

    public void insert(String s) {
        Trie1 curPos = this;

        for (int i = s.length() - 1; i >= 0; --i) {
            int t = s.charAt(i) - 'a';
            if (curPos.next[t] == null) {
                curPos.next[t] = new Trie1();
            }
            curPos = curPos.next[t];
        }
        curPos.isEnd = true;
    }
}