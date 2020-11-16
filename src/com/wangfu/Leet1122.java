package com.wangfu;

import java.util.Arrays;

public class Leet1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0; // 下一个待排序的位置
        for (int i = 0;i < arr2.length;i++){
            for (int j = index;j < arr1.length;j++){
                if (arr1[j] == arr2[i]){
                    int temp = arr1[j];
                    arr1[j] = arr1[index];
                    arr1[index] = temp;
                    index++;
                }
            }
        }
        Arrays.sort(arr1,index,arr1.length);
        return arr1;
    }
}
