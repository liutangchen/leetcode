package com.wangfu;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null)
            return null;
        // p先走，然后p起、q再一起走
        ListNode p = head, q = head;
        for (int i = 0; i < k; i++) {
            if (p != null)
                p = p.next;
            else {
                return null;
            }
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }
}
