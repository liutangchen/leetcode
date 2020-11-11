package com.wangfu;


import java.util.Arrays;

public class Leet31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length, i = 0;
        for (i = len - 2; i >= 0; i--) {
            int index = -1;
            for (int j = i + 1; j < len; j++) {
                // boolean flag = false;
                if (nums[j] > nums[i] && index == -1) {
                    index = j;
                } else if (nums[j] > nums[i] && index != -1 && nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (index == -1)
                continue;
            else {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        Arrays.sort(nums, i + 1, len);
    }
}
