package com.wangfu;

import java.util.Stack;

public class Leet20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                else {
                    if (stack.peek() == '(' && ch == ')' || stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']'){
                        stack.pop();
                    }else
                        return false;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
