package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Leet113 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)
            return res;
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(list));    // 注意这里是新new一个ArrayList
        }
        pathSum(root.left, sum - root.val);
        if (root.left != null)
            list.remove(list.size() - 1);
        pathSum(root.right, sum - root.val);
        if (root.right != null)
            list.remove(list.size() - 1);
        return res;
    }
}
