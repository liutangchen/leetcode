package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Offer57Two {
    // 滑动窗口
    public int[][] findContinuousSequence(int target) {
        List<int[]> tempRes = new ArrayList<>();
        int low = 1, high = 2;
        int sum = 3;
        while (low < high && low <= target / 2) {
            if (sum == target) {
                int[] arr = new int[high - low + 1];
                for (int i = low; i <= high; i++) {
                    arr[i - low] = i;
                }
                tempRes.add(arr);
                low++;
                high++;
                sum += high - low + 1;
            } else if (sum > target) {
                sum -= low;
                low++;
            } else {
                high++;
                sum += high;
            }
        }
        return tempRes.toArray(new int[tempRes.size()][]);
    }
}
