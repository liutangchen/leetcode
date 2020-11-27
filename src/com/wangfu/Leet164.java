package com.wangfu;

import java.util.Arrays;

public class Leet164 {
    /**
     * 基于基数排序算法，时间复杂度为O（n）
     *
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        int maxVal = Arrays.stream(nums).max().getAsInt(); // 获得数组的最大值
        int[][] bucket = new int[10][n + 1]; // 分配时用的数组，bucket[i][0]保存第i行元素的个数
        int loopTimes = getLoopTimes(maxVal); // 获得需要循环的次数，即最大数的位数
        for (int i = 1; i <= loopTimes; i++) {  // 对每一位进行分配
            for (int j = 0; j < n; j++) { // 分配过程
                int curNum = getNumInPos(nums[j], i);
                int index = ++bucket[curNum][0];
                bucket[curNum][index] = nums[j];
            }
            for (int j = 0,m = 0;j < 10;j++){ // 收集过程
                for (int k = 1;k <= bucket[j][0];k++){
                    nums[m++] = bucket[j][k];
                }
                bucket[j][0] = 0; // 一定记得收集完后将个数复位为0
            }
        }
        int ret = 0;
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }
        return ret;
    }

    /**
     * 获得循环的次数
     *
     * @param num
     * @return 返回num的位数
     */
    public int getLoopTimes(int num) {
        int count = 1;
        while (num / 10 != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    /**
     * 获取num从低位到高位的第pos位的数
     *
     * @param num
     * @param pos 从低位到高位的第几位
     * @return
     */
    public int getNumInPos(int num, int pos) {
        int temp = 1;
        for (int i = 1; i < pos; i++) {
            temp *= 10;
        }
        return (num / temp) % 10;
    }
}
