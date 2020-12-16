package com.wangfu;

public class Leet88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1, index1 = m - 1, index2 = n - 1;
        while (index2 >= 0 && index1 >= 0) {
            if (nums2[index2] > nums1[index1]) {
                nums1[lastIndex--] = nums2[index2--];
            } else {
                nums1[lastIndex--] = nums1[index1--];
            }
        }
        if (index2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, index2 + 1);
        }
    }
}
