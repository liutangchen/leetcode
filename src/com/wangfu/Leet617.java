package com.wangfu;

public class Leet617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null)
            return t1 == null ? t2 : t1;
        return dfs(t1, t2);
    }

    private TreeNode dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null)
            return t1 == null ? t2 : t1;
        t1.val += t2.val;
        t1.left = dfs(t1.left, t2.left);
        t1.right = dfs(t1.right, t2.right);
        return t1;
    }

    /**
     * 解法2
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {
            t1.val += t2.val;
            t1.left = mergeTrees2(t1.left, t2.left);   // 一定注意接收返回值
            t1.right = mergeTrees2(t1.right, t2.right);
        }
        if (t1 == null && t2 != null) {
            t1 = t2;
            t2 = null;
        }
        return t1;
    }
}
