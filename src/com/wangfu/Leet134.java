package com.wangfu;

public class Leet134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int indexMin = 0, min = Integer.MAX_VALUE, remain = 0;
        for (int i = 0; i < gas.length; i++) {
            remain += gas[i] - cost[i];
            if (remain < min){
                min = remain;
                indexMin = i;
            }
        }
        if (remain < 0)
            return -1;
        else
            return (indexMin+1)%gas.length;
    }
}
