package com.wangfu;

import java.util.LinkedList;
import java.util.Queue;

public class Leet225 {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public Leet225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (!queue1.isEmpty())
            return queue1.poll();
        return 0;
    }

    /** Get the top element. */
    public int top() {
        if (!queue1.isEmpty())
            return queue1.peek();
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
