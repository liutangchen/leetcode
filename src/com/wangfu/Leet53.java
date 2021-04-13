package com.wangfu;

public class Leet53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = Integer.MIN_VALUE, subSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (subSum < 0)
                subSum = nums[i];
            else {
                subSum += nums[i];
            }
            res = Math.max(res, subSum);
        }
        return res;
    }
}
