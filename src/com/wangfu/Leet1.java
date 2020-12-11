package com.wangfu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Leet1 {
    /**
     * 方法一
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[][] temp = new int[nums.length][2];
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int i = 0, j = temp.length - 1;
        while (i < j) {
            if (temp[i][0] + temp[j][0] == target) {
                res[0] = temp[i][1];
                res[1] = temp[j][1];
                return res;
            } else if (temp[i][0] + temp[j][0] < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

    /**
     * 方法二 此题更推荐
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (map.containsKey(element) && map.get(element) != i) {
                return new int[]{i, map.get(element)};
            }
        }
        return new int[0];
    }
}
