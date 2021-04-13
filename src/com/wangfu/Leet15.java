package com.wangfu;

import java.util.*;

public class Leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 0)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length && nums[i] <= 0) {
            // 重复的跳过
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // 重复的跳过
                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    while (l < r && nums[r] == nums[r - 1])
                        r--;
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
            i++;
        }
        return result;
    }
}
