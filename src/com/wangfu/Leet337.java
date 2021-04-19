package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/19 21:17
 */
public class Leet337 {
    public int rob(TreeNode root) {
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robInternal(TreeNode root) {
        int[] result = new int[2];
        if (root == null) {
            return result;
        }
        int[] l = robInternal(root.left);
        int[] r = robInternal(root.right);
        // 0代表不偷
        result[0] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        // 1代表偷
        result[1] = l[0] + r[0] + root.val;
        return result;
    }
}
