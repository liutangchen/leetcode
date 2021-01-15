package com.wangfu;


public class Leet108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return recursive(nums, 0, nums.length - 1);
    }

    private TreeNode recursive(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int middle = (low + high) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = recursive(nums, low, middle - 1);
        root.right = recursive(nums, middle + 1, high);
        return root;
    }
}
