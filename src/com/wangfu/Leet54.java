package com.wangfu;

import java.util.ArrayList;

public class Leet54 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return res;
        int m = matrix.length, n = matrix[0].length;
        int count = m * n;
        int up = 0, down = m - 1, left = 0, right = n - 1;
        while (count > 0) {
            for (int i = left; count > 0 && i <= right; i++) {  // 每一次都要判断count>0
                res.add(matrix[up][i]);
                count--;
            }
            up++;
            for (int i = up; count > 0 && i <= down; i++) {
                res.add(matrix[i][right]);
                count--;
            }
            right--;
            for (int i = right; count > 0 && i >= left; i--) {
                res.add(matrix[down][i]);
                count--;
            }
            down--;
            for (int i = down; count > 0 && i >= up; i--) {
                res.add(matrix[i][left]);
                count--;
            }
            left++;
        }
        return res;
    }
}
