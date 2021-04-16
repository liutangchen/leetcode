package com.wangfu;

import java.util.PriorityQueue;

public class Leet215 {
    /**
     * 基于小顶堆
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        if (k < 1 || k > len)
            return -1;
        // 默认的是小顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < len; i++) {
            if (queue.isEmpty() || queue.size() < k) {
                queue.offer(nums[i]);
            } else {
                if (nums[i] > queue.peek()) {
                    queue.offer(nums[i]);
                    queue.poll();
                }
            }
        }
        return queue.poll();
    }

    /**
     * 基于快排思想
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest2(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        if (k < 1 || k > len)
            return -1;
        // 计算出按升序排好后第K大元素对应的下标
        int index = nums.length - k;
        return quickSort(nums, 0, nums.length - 1, index);
    }

    private int quickSort(int[] nums, int low, int high, int index) {
        if (low > high)
            return -1;
        int i = low, j = high;
        int invoke = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= invoke) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= invoke) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = invoke;
        if (i == index)
            return nums[i];
        else if (i < index) {
            return quickSort(nums, i + 1, high, index);
        } else
            return quickSort(nums, low, i - 1, index);
    }
}
