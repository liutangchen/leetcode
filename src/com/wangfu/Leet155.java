package com.wangfu;

import java.util.Stack;

public class Leet155 {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null; // 用来保存最小元素

    public Leet155() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek() >= x) {
            stack2.push(x);
        }
    }

    public void pop() {
        int temp = stack1.pop();
        if (temp == stack2.peek()){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
