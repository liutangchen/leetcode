package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/21 17:04
 */
public class Leet91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0' <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    /**
     * 空间优化
     *
     * @param s
     * @return
     */
    public int numDecodings2(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length(), a = 1, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            c = 0;
            if (s.charAt(i - 1) != '0') {
                c = b;
            }
            if (i > 1 && s.charAt(i - 2) != '0' && (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0' <= 26) {
                c += a;
            }
            a = b;
            b = c;
        }
        return c;
    }
}
