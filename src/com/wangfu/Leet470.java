package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/6/16 15:59
 */
public class Leet470 {
    public int rand10() {
        int row, col, idx;
        do {
            row = rand7();
            col = rand7();
            idx = row + (col - 1) * 7;
        } while (idx > 40);
        return 1 + (idx - 1) % 10;
    }
}
