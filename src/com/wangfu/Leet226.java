package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/6/17 11:30
 */
public class Leet226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
