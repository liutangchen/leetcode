package com.wangfu;

import java.util.Arrays;

public class Offer61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                continue;
            }
            if (nums[i] == nums[i + 1])
                return false;
        }
        if (nums[4] - nums[zeroCount] < 4)
            return true;
        else
            return false;
    }
}
