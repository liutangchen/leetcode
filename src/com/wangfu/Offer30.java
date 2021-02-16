package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Offer30 {
    private List<Integer> stackA;
    private List<Integer> stackB;

    public Offer30() {
        stackA = new ArrayList<>();
        stackB = new ArrayList<>();
    }

    public void push(int x) {
        stackA.add(x);
        if (stackB.size() == 0) {
            stackB.add(x);
        } else {
            if (x <= stackB.get(stackB.size() - 1)) {
                stackB.add(x);
            }
        }
    }

    public void pop() {
        int lastEle = 0;
        if (stackA.size() > 0) {
            lastEle = stackA.get(stackA.size() - 1);
            stackA.remove(stackA.size() - 1);
        }
        if (stackB.size() > 0 && lastEle == stackB.get(stackB.size() - 1))
            stackB.remove(stackB.size() - 1);
    }

    public int top() {
        if (stackA.size() > 0) {
            return stackA.get(stackA.size() - 1);
        }
        return 0;
    }

    public int min() {
        if (stackB.size() > 0)
            return stackB.get(stackB.size() - 1);
        return 0;
    }
}
