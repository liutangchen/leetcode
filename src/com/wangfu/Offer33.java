package com.wangfu;

public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0)
            return true;
        return recursive(postorder, 0, postorder.length - 1);
    }

    private boolean recursive(int[] postorder, int i, int j) {
        if (i >= j)
            return true;
        int k = i;
        while (k < j && postorder[k] < postorder[j]) {
            k++;
        }
        int depart = k;
        while (k < j) {
            if (postorder[k] < postorder[j])
                return false;
            k++;
        }
        return recursive(postorder, i, depart - 1) && recursive(postorder, depart, j - 1);
    }
}
