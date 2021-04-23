package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/20 21:09
 */
public class Leet69 {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            // 强转为long型，避免出现int型溢出
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
