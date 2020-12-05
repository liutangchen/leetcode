package com.wangfu;


import java.util.LinkedList;
import java.util.Queue;

public class Leet225 {
    Queue<Integer> queue1; // 每次数据进来前都保持为空
    Queue<Integer> queue2; // 以栈的顺序保存数据
    /** Initialize your data structure here. */
    public Leet225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!queue2.isEmpty()){
            return queue2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if (!queue2.isEmpty()){
            return queue2.peek();
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue2.isEmpty();
    }
}
