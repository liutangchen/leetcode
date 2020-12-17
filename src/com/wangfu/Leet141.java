package com.wangfu;

public class Leet141 {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode target = new ListNode();
        ListNode p = null;
        while (head != null) {
            p = head;
            head = head.next;
            if (head == target)
                return true;
            p.next = target;
        }
        return false;
    }
}
