package com.wangfu.weekly213;

public class One {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int[] piece : pieces) {
            int k = find(arr, piece[0]);
            if (k == -1)
                return false;
            for (int i = 1; i < piece.length; i++) {
                if (k+1 >= arr.length || piece[i] != arr[++k])
                    return false;
            }
        }
        return true;
    }

    private int find(int[] arr, int x) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x)
                return j;
        }
        return -1;
    }
}
