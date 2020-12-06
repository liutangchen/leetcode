package com.wangfu.weekly218;

import java.util.Arrays;

public class Two {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int res = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                res++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
