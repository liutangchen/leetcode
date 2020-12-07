package com.wangfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet144 {
    /**
     * 二叉树前序遍历非递归算法
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                list.add(root.val);
                stack.add(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                root = temp.right;
            }
        }
        return list;
    }
}
