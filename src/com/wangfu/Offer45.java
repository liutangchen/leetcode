package com.wangfu;

import java.util.Arrays;

public class Offer45 {
    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        String[] numsString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsString[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsString, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : numsString) {
            sb.append(s);
        }
        return sb.toString();
    }
}
