package com.wangfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet145 {
    /**
     * 二叉树后序遍历非递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null; // 指向刚被访问过的节点
        while (!stack.isEmpty() || root != null) {
            while (root != null) {  // 先走到最左边为null的节点
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) { // 如果root的右子树为空或者右节点刚被访问过则访问root节点
                res.add(root.val);
                prev = root;  // 记录下刚被访问过的节点
                root = null;
            } else {    // 否则先访问右子树
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }

    /**
     * 二叉树后序遍历递归实现
     *
     * @param root
     * @return
     */
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal2(TreeNode root) {
        if (root != null) {
            postorderTraversal2(root.left);
            postorderTraversal2(root.right);
            res.add(root.val);
        }
        return res;
    }
}
