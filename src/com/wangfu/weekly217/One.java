package com.wangfu.weekly217;

public class One {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] arr : accounts){
            int sum = 0;
            for (int x : arr){
                sum += x;
            }
            if (sum > res)
                res = sum;
        }
        return res;
    }
}
