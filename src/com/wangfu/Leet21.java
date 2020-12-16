package com.wangfu;

public class Leet21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = new ListNode(-1);
        ListNode tail = head, temp = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }
            temp.next = null;
            tail.next = temp;
            tail = tail.next;
        }
        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }
        return head.next;
    }
}
