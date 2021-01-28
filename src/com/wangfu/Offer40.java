package com.wangfu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40 {
    // 基于快排思想
    public int[] getLeastNumbers2(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 最后一个参数表示我们要找的是下标为k-1的数
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // 每快排切分1次，找到排序后下标为j的元素，如果j恰好等于k就返回j以及j左边所有的数；
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
        return j > k ? quickSearch(nums, lo, j - 1, k) : quickSearch(nums, j + 1, hi, k);
    }

    // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边。
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        while (lo < hi) {
            while (lo < hi && nums[hi] >= v)
                hi--;
            nums[lo] = nums[hi];
            while (lo < hi && nums[lo] <= v)
                lo++;
            nums[hi] = nums[lo];
        }
        nums[lo] = v;
        return lo;
    }

    // 基于大顶堆
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || k == 0)
            return new int[0];
        if (arr.length == 0)
            return new int[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int x : arr) {
            if (queue.size() < k) {
                queue.offer(x);
            } else {
                if (x < queue.peek()) {
                    queue.poll();
                    queue.offer(x);
                }
            }
        }
        int[] res = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            res[i++] = queue.poll();
        }
        return res;
    }
}
