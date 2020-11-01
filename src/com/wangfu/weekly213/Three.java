package com.wangfu.weekly213;

public class Three {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        if (n == 1)
            return 0;
        int i = 1;
        for (; i < n; i++) {
            int needsBracks = heights[i] - heights[i - 1];
            if (needsBracks <= 0)
                continue;
            if (bricks >= needsBracks) {
                bricks -= needsBracks;
            } else {
                if (ladders > 0) {
                    ladders--;
                } else {
                    break;
                }
            }
        }
        return i - 1;
    }
}
