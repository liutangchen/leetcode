package com.wangfu;

import java.util.ArrayList;
import java.util.List;

/**
 * 摩尔投票法步骤  1.投票  2.计数
 * @Author: liutangchen
 * @Date: 2021/5/20 11:36
 */
public class Leet229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int candidate1 = nums[0], count1 = 0;
        int candidate2 = nums[0], count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
                continue;
            }
            if (num == candidate2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                candidate1 = num;
                count1++;
                continue;
            }
            if (count2 == 0) {
                candidate2 = num;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        // 计数
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            }
        }
        if (count1 > nums.length / 3)
            res.add(candidate1);
        if (count2 > nums.length / 3)
            res.add(candidate2);
        return res;
    }
}
