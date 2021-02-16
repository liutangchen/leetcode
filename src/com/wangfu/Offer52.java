package com.wangfu;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        int lenA = 0, lenB = 0;
        while (p != null) {
            lenA++;
            p = p.next;
        }
        p = headA;
        while (q != null) {
            lenB++;
            q = q.next;
        }
        q = headB;
        int differ = 0;
        if (lenA > lenB) {
            differ = lenA - lenB;
            for (int i = 0; i < differ; i++) {
                p = p.next;
            }
        } else {
            differ = lenB - lenA;
            for (int i = 0; i < differ; i++) {
                q = q.next;
            }
        }
        while (p != null && q != null && p != q) {
            p = p.next;
            q = q.next;
        }
        if (p == null || q == null)
            return null;
        return p;
    }
}
