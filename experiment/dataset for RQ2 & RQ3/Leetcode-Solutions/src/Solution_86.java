import java.util.*;
// for title: restore-the-array
public class Solution_86 {
    public int numberOfArrays(String s, int k) {
        final int MOD = 1000000007;
        int n = s.length();
        // 为了便于代码编写，我们使用 64 位整数类型
        long kLong = k;
        int[] f = new int[n + 1];
        // 递推的边界条件
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            long num = 0, base = 1;
            // 倒序枚举 j，最多只需要枚举 10 个
            for (int j = i - 1; j >= 0 && i - j <= 10; --j) {
                // 在高位添加当前的数字，得到第 j+1 到 i 个数字组成的数
                // 注意 s 的下标是从 0 开始的
                num += (s.charAt(j) - '0') * base;
                if (num > kLong) {
                    break;
                }
                // 判断是否有前导 0
                if (s.charAt(j) != '0') {
                    f[i] += f[j];
                    f[i] %= MOD;
                }
                base *= 10;
            }
        }
        return f[n];
    }
}