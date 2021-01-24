package com.wangfu;

public class Leet572 {
    boolean res = false;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        preOrder(s, t);
        return res;
    }

    private void preOrder(TreeNode s, TreeNode t) {
        if (s != null) {
            if (isEqual(s, t)) {
                res = true;
                return;
            }
            preOrder(s.left, t);
            preOrder(s.right, t);
        }
    }

    public boolean isEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null || s.val != t.val)
            return false;
        return isEqual(s.left, t.left) && isEqual(s.right, t.right);
    }
}
