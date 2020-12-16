package com.wangfu;

public class Leet11 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = Math.min(height[i], height[j]) * (j - i);
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            int area = Math.min(height[i], height[j]) * (j - i);
            if (area > res)
                res = area;
        }
        return res;
    }
}
