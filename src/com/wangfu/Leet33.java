package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/13 09:57
 */
public class Leet33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            // 如果左边有序
            if (nums[mid] >= nums[low]) {
                // 如果目标元素在有序的范围之间
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            // 右边有序
            } else {
                // 如果目标元素在有序的范围之间
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
