package com.wangfu;

public class Leet283 {
    public void moveZeroes(int[] nums) {
        int index = 0; // 指向下一个非零元素该放的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}
