package com.wangfu;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liutangchen
 * @Date: 2021/6/21 16:10
 */
public class Leet78 {
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            temp.clear();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    temp.add(nums[j]);
                }
            }
            result.add(new ArrayList<>(temp));
        }
        return result;
    }
}
