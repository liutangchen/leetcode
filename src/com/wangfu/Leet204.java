package com.wangfu;

import java.util.Arrays;

public class Leet204 {
    public int countPrimes(int n) {
        int res = 0;
        boolean[] temp = new boolean[n];
        Arrays.fill(temp, true);
        for (int i = 2; i * i < n; i++) {
            if (temp[i]) {
                for (int j = i * i; j < n; j += i) {
                    temp[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (temp[i])
                res++;
        }
        return res;
    }
}
