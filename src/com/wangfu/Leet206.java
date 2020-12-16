package com.wangfu;

public class Leet206 {
    /**
     * 头插法实现
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode p = head.next;
        head.next = null;
        ListNode q = null;
        while (p != null) {
            q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }

    /**
     * 递归实现
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ret = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }
}
