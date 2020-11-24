package com.wangfu;

public class Leet222 {
    int count = 0;
    public int countNodes(TreeNode root) {
        if (root != null){
            count++;
            countNodes(root.left);
            countNodes(root.right);
        }
        return count;
    }
}
