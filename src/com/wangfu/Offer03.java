package com.wangfu;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] == 1)
                return nums[i];
            else
                temp[nums[i]] = 1;
        }
        return -1;
    }
}
