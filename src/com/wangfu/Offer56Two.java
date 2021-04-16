package com.wangfu;

public class Offer56Two {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int res = 0;
        int[] bitNum = new int[32];
        for (int num : nums) {
            int bitMask = 1;
            for (int i = 31; i >= 0; i--) {
                if ((num & bitMask) != 0) {
                    bitNum[i]++;
                }
                bitMask <<= 1;
            }
        }
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += bitNum[i] % 3;
        }
        return res;
    }
}
