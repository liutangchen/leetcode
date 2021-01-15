package com.wangfu;

public class Leet876 {
    public ListNode middleNode(ListNode head) {
        ListNode headNew = new ListNode();
        headNew.next = head;
        ListNode fast = headNew, slow = headNew;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null)
            return slow;
        return slow.next;
    }
}
