package com.wangfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                list.add(temp.val);
                root = temp.right;
            }
        }
        return list;
    }
}
