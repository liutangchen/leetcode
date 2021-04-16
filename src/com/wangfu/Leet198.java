package com.wangfu;

/**
 * 打家劫舍I
 *
 * @Author: liutangchen
 * @Date: 2021/4/15 16:45
 */
public class Leet198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = nums[i];
            } else if (i == 1) {
                dp[i] = Math.max(nums[0], nums[1]);
            } else {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
        }
        return dp[n - 1];
    }
}
