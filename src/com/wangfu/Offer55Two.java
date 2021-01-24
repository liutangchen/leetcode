package com.wangfu;

public class Offer55Two {
    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        high(root);
        return res;
    }

    private int high(TreeNode root) {
        if (root == null)
            return 0;
        int lHigh = high(root.left);
        int rHigh = high(root.right);
        if (Math.abs(lHigh - rHigh) > 1)
            res = false;
        return Math.max(lHigh, rHigh) + 1;
    }
}
