package com.wangfu;

public class Leet912 {
    public int[] sortArray(int[] nums) {
        if (nums == null)
            return null;
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high)   // 递归出口别忘了写
            return;
        int invoke = nums[low];
        int i = low, j = high;
        while (i < j) {
            while (i < j && nums[j] >= invoke) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= invoke) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = invoke;
        quickSort(nums, low, i - 1);
        quickSort(nums, i + 1, high);
    }
}
