package com.wangfu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode treeNode = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null)
                    queue.offer(treeNode.left);
                if (treeNode.right != null)
                    queue.offer(treeNode.right);
            }
            res.add(0, list);
        }
        return res;
    }
}
