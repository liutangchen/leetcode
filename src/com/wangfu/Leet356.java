package com.wangfu;

import java.util.Arrays;
import java.util.Comparator;

public class Leet356 {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[][] tmp = new int[n][2];
        for (int i = 0; i < n; i++) {
            tmp[i][0] = arr[i];
            tmp[i][1] = count(arr[i]);
        }
        Arrays.sort(tmp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] - o2[1] == 0)
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n; i++) {
            arr[i] = tmp[i][0];
        }
        return arr;
    }

    public int count(int x) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & 1) == 1) {
                res++;
            }
            x = x >>> 1;
        }
        return res;
    }
}
