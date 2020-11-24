package com.wangfu;

import java.util.Arrays;
import java.util.Comparator;

public class Leet452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int res = 0, left = Integer.MIN_VALUE, right = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > left)
                left = points[i][0];
            if (points[i][1] < right)
                right = points[i][1];
            if (left > right) {
                res++;
                left = points[i][0];
                right = points[i][1];
            }
        }
        return res + 1;
    }
}
