package com.wangfu;

public class Leet147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return head;
        ListNode p = head.next;
        head.next = null;
        ListNode q = null;
        while (p != null) {
            q = p.next;
            p.next = null;
            if (p.val <= head.val) {
                p.next = head;
                head = p;
                p = q;
                continue;
            }
            ListNode l = head;
            while (l.next != null && l.next.val < p.val) {
                l = l.next;
            }
            p.next = l.next;
            l.next = p;
            p = q;
        }
        return head;
    }
}
