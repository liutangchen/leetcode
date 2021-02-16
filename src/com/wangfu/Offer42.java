package com.wangfu;

public class Offer42 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = Integer.MIN_VALUE, sum = 0;
        for (int x : nums) {
            if (sum > 0)
                sum += x;
            else
                sum = x;
            res = Math.max(res, sum);
        }
        return res;
    }
}
