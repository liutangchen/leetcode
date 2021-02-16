package com.wangfu;


public class Offer36 {
    Node pre = null, head = null;

    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;
        inOrder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void inOrder(Node cur) {
        if (cur != null){
            inOrder(cur.left);
            if (pre != null){
                pre.right = cur;
            }else{
                head = cur;
            }
            cur.left = pre;
            pre = cur;
            inOrder(cur.right);
        }
    }
}

