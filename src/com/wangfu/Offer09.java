package com.wangfu;

import java.util.Stack;

public class Offer09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Offer09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            if (stack1.isEmpty())
                return -1;
            else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
