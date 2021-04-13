package com.wangfu;

public class Leet236 {
    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isContainsPOrQ(root, p, q);
        return res;
    }

    private boolean isContainsPOrQ(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean left = isContainsPOrQ(root.left, p, q);
        boolean right = isContainsPOrQ(root.right, p, q);
        if (left && right || (root == p || root == q) && (left || right))
            res = root;
        return left || right || root == p || root == q;
    }
}
