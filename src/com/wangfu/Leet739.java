package com.wangfu;


import java.util.Stack;

public class Leet739 {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            if (stack.isEmpty() || T[stack.peek()] >= T[i]) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int j = stack.pop();
                res[j] = i - j;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }
        return res;
    }
}
