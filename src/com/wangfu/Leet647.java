package com.wangfu;

public class Leet647 {
    public int countSubstrings(String s) {
        int n = s.length(), count = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (j - i == 1 && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    count++;
                } else if (j - i > 1 && dp[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    count++;
                } else
                    dp[i][j] = false;
            }
        }
        return count;
    }
}
