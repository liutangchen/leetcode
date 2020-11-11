package com.wangfu;

import java.util.Arrays;
import java.util.Comparator;

public class Leet973 {
    public int[][] kClosest(int[][] points, int K) {
        int row = points.length;
        if (K == row)
            return points;
        int[][] temp = new int[row][2];
        for (int i = 0; i < row; i++) {
            temp[i][0] = i;
            temp[i][1] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[2];
            }
        });
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = points[temp[i][0]];
        }
        return res;
    }
}
