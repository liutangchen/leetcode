package com.wangfu;

public class Leet404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    private int dfs(TreeNode root) {
        int ans = 0;
        if (root.left != null) {
            ans += isLeafNode(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null && !isLeafNode(root.right)) {
            ans += dfs(root.right);
        }
        return ans;
    }

    private boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
