package com.wangfu;

public class Offer13 {
    int[][] direction = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean[][] visited = null;
    int k = 0, m = 0, n = 0;
    int res = 0;

    public int movingCount(int m, int n, int k) {
        this.visited = new boolean[m][n];
        this.m = m;
        this.n = n;
        this.k = k;
        dfs(0, 0);
        return res;
    }

    private void dfs(int x, int y) {
        visited[x][y] = true;
        int sum = calculate(x) + calculate(y);
        if (sum <= k) {
            res++;
            for (int i = 0; i < 4; i++) {
                int x1 = x + direction[i][0];
                int y1 = y + direction[i][1];
                if (x1 >= 0 && x1 < m && y1 >= 0 && y1 < n && !visited[x1][y1])
                    dfs(x1, y1);
            }
        }
    }

    private int calculate(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
