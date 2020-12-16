package com.wangfu;

public class Leet53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        int res = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
