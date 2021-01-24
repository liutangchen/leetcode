package com.wangfu;

public class Leet235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestors = root;
        while (true) {
            if (p.val > ancestors.val && q.val > ancestors.val) {
                ancestors = ancestors.right;
            } else if (p.val < ancestors.val && q.val < ancestors.val) {
                ancestors = ancestors.left;
            } else {
                break;
            }
        }
        return ancestors;
    }
}
