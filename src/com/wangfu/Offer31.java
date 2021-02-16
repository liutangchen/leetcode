package com.wangfu;

import java.util.Stack;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || popped == null || pushed.length == 0 || popped.length == 0)
            return true;
        if (pushed.length != popped.length)
            return false;
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();
        while (!stack.isEmpty() || i < pushed.length) {
            while (i < pushed.length && pushed[i] != popped[j]) {
                stack.push(pushed[i++]);
            }
            if (i >= pushed.length)
                return false;
            else {
                i++;
                j++;
            }
            while (!stack.isEmpty() && j < pushed.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return true;
    }
}
