package com.wangfu;


public class Leet1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        int lastIndex = m + n - 1;
        int aIndex = m - 1;
        for (int i = n - 1; i >= 0; ) {
            if (aIndex >= 0 && B[i] >= A[aIndex]) {
                A[lastIndex--] = B[i--];
            } else if (aIndex >= 0 && B[i] < A[aIndex]) {
                A[lastIndex--] = A[aIndex--];
            } else {
                // public static native void arraycopy(Object src, int srcPos, Object dest, int desPos, int length)
                // 其参数含义为：（原数组， 原数组的开始位置， 目标数组， 目标数组的开始位置， 拷贝个数）
                System.arraycopy(B, 0, A, 0, lastIndex + 1);
                break;
            }
        }
    }
}
