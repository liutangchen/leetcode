package com.wangfu;

public class Offer16 {
    // 递归解法
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return (1 / x) * myPow(1 / x, -n - 1);
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    // 非递归解法
    public double myPow2(double x, int n) {
        double result = 1.0;
        for (int i = n; i != 0; i /= 2, x *= x) {
            if (i % 2 != 0) {
                result *= x;
            }
        }
        return n < 0 ? 1 / result : result;
    }
}
