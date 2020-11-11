package com.wangfu;

public class Leet122 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1)
            return 0;
        int res = 0;
        for (int i = 1; i < len; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0)
                res += tmp;
        }
        return res;
    }
}
