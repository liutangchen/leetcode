package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/17 11:18
 */
public class Leet213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        if (n == 1)
            return nums[0];
        return Math.max(maxOfRange(nums, 0, n - 2), maxOfRange(nums, 1, n - 1));
    }

    private int maxOfRange(int[] nums, int start, int end) {
        if (start > end)
            return 0;
        int n = end - start + 1;
        int[] dp = new int[n];
        for (int i = start; i <= end; i++) {
            if (i == start) {
                dp[i - start] = nums[start];
            } else if (i == start + 1) {
                dp[i - start] = Math.max(nums[start], nums[start + 1]);
            } else {
                dp[i - start] = Math.max(dp[i - start - 1], dp[i - start - 2] + nums[i]);
            }
        }
        return dp[n - 1];
    }
}
