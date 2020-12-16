package com.wangfu;


public class Leet35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        if (target < nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int middle = (i + j) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target > nums[middle]) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        // 在i和j中大于target的下标处插入
        if (nums[i] > target)
            return i;
        return j;
    }
}
