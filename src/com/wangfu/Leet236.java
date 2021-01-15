package com.wangfu;

public class Leet236 {
    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isContainsPOrQ(root, p, q);
        return res;
    }

    private boolean isContainsPOrQ(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;
        boolean lson = isContainsPOrQ(root.left, p, q);
        boolean rson = isContainsPOrQ(root.right, p, q);
        if (lson && rson || (root == p || root == q) && (lson || rson)) {
            res = root;
        }
        return lson || rson || root == p || root == q;
    }
}
