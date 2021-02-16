package com.wangfu;

public class Offer53One {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0, j = nums.length - 1, middle = 0, count = 0;
        while (i <= j) {
            middle = (i + j) / 2;
            if (nums[middle] == target) {
                count++;
                break;
            } else if (nums[middle] < target) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        int middle2 = middle - 1, middle3 = middle + 1;
        while (middle2 >= 0 && nums[middle2] == target) {
            count++;
            middle2--;
        }
        while (middle3 < nums.length && nums[middle3] == target) {
            count++;
            middle3++;
        }
        return count;
    }
}
