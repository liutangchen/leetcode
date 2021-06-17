package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/6/17 11:52
 * 解题思路：1. 先左右对换，然后再按副对角线对换,此思路不推荐，因为根据副对角线翻转不好操作，没啥规律
 * 2. 先上下对换，然后再按主对角线对换，这样就很容易操作了
 */
public class Leet48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 上下翻转
        for (int i = 0; i < n; i++) {
            int up = 0, down = n - 1;
            while (up < down) {
                int temp = matrix[up][i];
                matrix[up][i] = matrix[down][i];
                matrix[down][i] = temp;
                up++;
                down--;
            }
        }
        // 按主对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
