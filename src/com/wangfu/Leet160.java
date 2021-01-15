package com.wangfu;

public class Leet160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode p = headA, q = headB;
        int lenA = 0, lenB = 0;
        while (p != null) {
            lenA++;
            p = p.next;
        }
        while (q != null) {
            lenB++;
            q = q.next;
        }
        int temp = 0;
        if (lenA > lenB) {
            temp = lenA - lenB;
            for (int i = 0; i < temp; i++) {
                headA = headA.next;
            }
        } else {
            temp = lenB - lenA;
            for (int i = 0; i < temp; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
