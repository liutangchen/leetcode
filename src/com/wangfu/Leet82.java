package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/6/19 10:23
 */
public class Leet82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode p = tempHead, q = p.next;
        while (q != null && q.next != null) {
            if (q.next.val != q.val) {
                p = p.next;
                q = q.next;
            } else {
                while (q.next != null && q.next.val == q.val) {
                    q = q.next;
                }
                p.next = q.next;
                q = p.next;
            }
        }
        return tempHead.next;
    }
}
