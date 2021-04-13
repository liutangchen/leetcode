package com.wangfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet94 {
    /**
     * 二叉树中序遍历非递归算法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                temp = stack.pop();
                res.add(temp.val);
                root = temp.right;
            }
        }
        return res;
    }

    /**
     * 二叉树中序遍历递归算法
     *
     * @param root
     * @return
     */
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root != null) {
            inorderTraversal2(root.left);
            res.add(root.val);
            inorderTraversal2(root.right);
        }
        return res;
    }
}
