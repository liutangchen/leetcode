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
}
