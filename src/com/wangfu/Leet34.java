package com.wangfu;

public class Leet34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0)
            return new int[]{-1, -1};
        int i = 0, j = len - 1, index = -1, start = -1, end = -1;
        while (i <= j) {
            int middle = (i + j) / 2;
            if (nums[middle] == target) {
                index = middle;
                break;
            } else if (nums[middle] < target) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        start = index;
        end = index;
        while (start - 1 >= 0 && nums[start - 1] == target) {
            start--;
        }
        while (end + 1 < len && nums[end + 1] == target) {
            end++;
        }
        return new int[]{start, end};
    }
}
