package com.wangfu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        backTrace(list, res, 0);
        return res;
    }

    private void backTrace(List<Integer> list, List<List<Integer>> res, int first) {
        if (first == list.size() - 1) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = first; i < list.size(); i++) {
            Collections.swap(list, i, first);
            backTrace(list, res, first + 1);
            Collections.swap(list, i, first);
        }
    }
}
