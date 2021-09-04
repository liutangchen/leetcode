package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/7/26 08:45
 */
public class Leet153 {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;    // 注意这里是 +1
            }
        }
        return nums[low];
    }
}
