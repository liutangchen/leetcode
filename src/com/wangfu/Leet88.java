package com.wangfu;

public class Leet88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, last = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[last--] = nums2[j--];
            } else {
                nums1[last--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[last--] = nums2[j--];
        }
    }
}
