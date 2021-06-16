package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/5/7 09:56
 */
public class Leet718 {
    public int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        // 二维dp，跟两个字符串求最长公共字串一样的解法
        int[][] dp = new int[len1][len2];
        int result = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                    if (dp[i][j] > result)
                        result = dp[i][j];
                }
            }
        }
        return result;
    }
}
