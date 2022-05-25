import java.util.*;
// for title: string-compression-ii
public class Solution_72 {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int[][] f = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE >> 1);
        }
        f[0][0] = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= k && j <= i; ++j) {
                if (j > 0) {
                    f[i][j] = f[i - 1][j - 1];
                }
                int same = 0, diff = 0;
                for (int i0 = i; i0 >= 1 && diff <= j; --i0) {
                    if (s.charAt(i0 - 1) == s.charAt(i - 1)) {
                        ++same;
                        f[i][j] = Math.min(f[i][j], f[i0 - 1][j - diff] + calc(same));
                    } else {
                        ++diff;
                    }
                }
            }
        }
        
        return f[n][k];
    }

    public int calc(int x) {
        if (x == 1) {
            return 1;
        }
        if (x < 10) {
            return 2;
        }
        if (x < 100) {
            return 3;
        }
        return 4;
    }
}