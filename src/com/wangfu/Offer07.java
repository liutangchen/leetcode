package com.wangfu;

import java.util.Arrays;

public class Offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)
            return null;
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        if (preorder.length != inorder.length)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        for (; i < inorder.length; i++) {
            if (inorder[i] == preorder[0])
                break;
        }
        int[] lPreorder = Arrays.copyOfRange(preorder, 1, 1 + i);
        int[] rPreorder = Arrays.copyOfRange(preorder, i + 1, preorder.length);
        int[] lInorder = Arrays.copyOfRange(inorder, 0, i);
        int[] rInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        root.left = buildTree(lPreorder, lInorder);
        root.right = buildTree(rPreorder, rInorder);
        return root;
    }
}
