package com.wangfu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Leet494 {
    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return count;
    }

    private void calculate(int[] nums, int i, int sum, int s) {
        if (i == nums.length) {
            if (sum == s) {
                count++;
            }
        } else {
            calculate(nums, i + 1, sum + nums[i], s);
            calculate(nums, i + 1, sum - nums[i], s);
        }
    }
}


