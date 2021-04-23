package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/23 09:48
 */
public class Leet70 {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
