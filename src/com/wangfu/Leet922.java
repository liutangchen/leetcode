package com.wangfu;

public class Leet922 {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1; // i指向未填充的最小偶数下标，j指向未填充的最小奇数下标
        int[] res = new int[A.length];
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) {
                res[i] = A[k];
                i += 2;
            } else {
                res[j] = A[k];
                j += 2;
            }
        }
        return res;
    }
}
