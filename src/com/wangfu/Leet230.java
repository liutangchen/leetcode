package com.wangfu;

public class Leet230 {
    int k = 0, count = 0;
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            if (count >= k)
                return;
            inOrder(root.left);
            if (++count == k) {
                res = root.val;
                return;
            }
            inOrder(root.right);
        }
    }
}
