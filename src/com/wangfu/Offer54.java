package com.wangfu;

public class Offer54 {
    int k = 0;
    int count = 0;
    int res = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        traversal(root);
        return res;
    }

    void traversal(TreeNode root) {
        if (root != null) {
            traversal(root.right);
            if (count > k)
                return;
            count++;
            if (count == k)
                res = root.val;
            traversal(root.left);
        }
    }
}
