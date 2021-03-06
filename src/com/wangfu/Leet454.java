package com.wangfu;

import java.util.HashMap;
import java.util.Map;

public class Leet454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int temp = A[i] + B[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int remain = 0 - C[i] - D[j];
                res += map.getOrDefault(remain, 0);
            }
        }
        return res;
    }
}
