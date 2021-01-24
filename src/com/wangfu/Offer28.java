package com.wangfu;

public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return recursive(root.left, root.right);
    }

    private boolean recursive(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null || q == null) || p.val != q.val)
            return false;
        return recursive(p.left, q.right) && recursive(p.right, q.left);
    }
}
