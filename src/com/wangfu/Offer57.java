package com.wangfu;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return null;
        int[] res = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                res[0] = nums[i];
                res[1] = nums[j];
                return res;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
