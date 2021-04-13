package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Leet199 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null)
            return;
        if (res.size() == depth)
            res.add(root.val);
        depth++;
        dfs(root.right, depth);
        dfs(root.left, depth);
    }
}
