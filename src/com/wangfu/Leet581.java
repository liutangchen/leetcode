package com.wangfu;


import java.util.Arrays;

public class Leet581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums_sorted = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(nums_sorted);
        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums_sorted[i]) {
                start = i;
                break;
            }
        }
        if (start == -1)
            return 0;
        int end = -1;
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] != nums_sorted[j]) {
                end = j;
                break;
            }
        }
        return end - start + 1;
    }
}
