package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/5/20 11:04
 */
public class Leet169 {
    /**
     * 摩尔投票法
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }
}
