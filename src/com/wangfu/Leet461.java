package com.wangfu;

public class Leet461 {
    public int hammingDistance(int x, int y) {
        int res = 0;
        int z = x ^ y;
        for (int i = 0; i < 32; i++) {
            if ((z & 1) == 1)
                res++;
            z = z >>> 1;
        }
        return res;
    }
}
