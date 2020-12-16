package com.wangfu;


public class Leet121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;
            if (profit > res)
                res = profit;
            if (prices[i] < min)
                min = prices[i];
        }
        return res;
    }
}
