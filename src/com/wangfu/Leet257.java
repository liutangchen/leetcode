package com.wangfu;

import java.util.ArrayList;
import java.util.List;

public class Leet257 {
    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        preOrder(root, new StringBuffer(""));
        return res;
    }

    private void preOrder(TreeNode root, StringBuffer buffer) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                buffer.append(root.val);
                res.add(buffer.toString());
            } else {
                buffer.append(root.val).append("->");
            }
            preOrder(root.left, new StringBuffer(buffer)); // 注意是新new一个StringBuffer,避免相互产生影响
            preOrder(root.right, new StringBuffer(buffer));
        }
    }

}
