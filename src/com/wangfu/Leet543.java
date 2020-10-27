package com.wangfu;


public class Leet543 {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        high(root);
        return res;
    }

    /**
     * 求二叉树的高度,在此过程就可以求出最终结果
     *
     * @param root
     * @return
     */
    public int high(TreeNode root) {
        if (root == null)
            return 0;
        int L = high(root.left);
        int R = high(root.right);
        res = Math.max(res, L + R);
        return Math.max(L, R) + 1;
    }
}
