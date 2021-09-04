package com.wangfu;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liutangchen
 * @Date: 2021/9/3 17:48
 */
public class Leet22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        dfs("", n, n, res);
        return res;
    }

    /**
     * @param s
     * @param left  左括号剩余个数
     * @param right 右括号剩余个数
     * @param res
     */
    private void dfs(String s, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(s + "(", left - 1, right, res);
        }
        if (right > 0) {
            dfs(s + ")", left, right - 1, res);
        }
    }
}
