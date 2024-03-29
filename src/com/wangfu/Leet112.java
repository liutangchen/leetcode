package com.wangfu;

/**
 * 注意：当root为null时，是不存在路径的，即使sum为0，也不存在路径
 */
public class Leet112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
