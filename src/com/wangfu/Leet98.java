package com.wangfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet98 {
    /**
     * 中序遍历(递归)
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i))
                return false;
        }
        return true;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }
    }

    /**
     * 中序遍历(非递归)
     *
     * @param root
     * @return
     */
    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Integer pre = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                if (pre != null && temp.val <= pre)
                    return false;
                else
                    pre = temp.val;
                root = temp.right;
            }
        }
        return true;
    }

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public boolean isValidBST3(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer minValue, Integer maxValue) {
        if (root == null)
            return true;
        int val = root.val;
        if (maxValue != null && val >= maxValue)
            return false;
        if (minValue != null && val <= minValue)
            return false;
        if (!helper(root.left, minValue, val))
            return false;
        if (!helper(root.right, val, maxValue))
            return false;
        return true;
    }
}
