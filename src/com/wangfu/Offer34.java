package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Offer34 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        recursive(root, sum, list);
        return res;
    }

    private void recursive(TreeNode root, int sum, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new ArrayList<>(list));
            return;
        }
        recursive(root.left, sum - root.val, list);
        if (root.left != null) {
            list.remove(list.size() - 1);
        }
        recursive(root.right, sum - root.val, list);
        if (root.right != null) {
            list.remove(list.size() - 1);
        }
    }
}
