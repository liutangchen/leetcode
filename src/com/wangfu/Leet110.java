package com.wangfu;

public class Leet110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(high(root.left) - high(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int high(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(high(root.left), high(root.right)) + 1;
    }

    /**
     * 方法二：一次计算树的高度就出结果
     */
    boolean result = true;

    public boolean isBalanced2(TreeNode root) {
        high(root);
        return result;
    }

    public int high2(TreeNode root) {
        if (root == null)
            return 0;
        int lhigh = high2(root.left);
        int rhigh = high2(root.right);
        if (Math.abs(lhigh - rhigh) > 1) {
            result = false;
        }
        return Math.max(lhigh, rhigh) + 1;
    }
}
