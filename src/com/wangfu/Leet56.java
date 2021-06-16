package com.wangfu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: liutangchen
 * @Date: 2021/5/10 10:37
 */
public class Leet56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        // 临时保存结果，因为不知道最终结果长度，所以先用list
        List<int[]> list = new ArrayList<>();
        int low = intervals[0][0], high = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (high < intervals[i][0]) {
                list.add(new int[]{low, high});
                low = intervals[i][0];
                high = intervals[i][1];
            } else {
                low = Math.min(low, intervals[i][0]);
                high = Math.max(high, intervals[i][1]);
            }
        }
        list.add(new int[]{low, high});
        // 最终的结果
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }
}
