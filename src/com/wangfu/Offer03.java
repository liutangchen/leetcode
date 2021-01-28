package com.wangfu;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int x : nums) {
            if (!set.add(x)) {
                res = x;
                break;
            }
        }
        return res;
    }

    // 这种方法更快
    public int findRepeatNumber2(int[] nums) {
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
