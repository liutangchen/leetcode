package com.wangfu;

public class Offer10Two {
    public int numWays(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}
