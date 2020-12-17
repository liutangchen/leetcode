package com.wangfu;

public class Leet234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode headNew = new ListNode();
        headNew.next = head;
        ListNode pre = headNew, tail = headNew;  // pre代表快指针，tail代表慢指针
        while (pre != null && pre.next != null) {  // 找到链表的中间节点
            tail = tail.next;
            pre = pre.next.next;
        }
        // 反转链表的后半部分
        ListNode p = tail.next, q = null;
        tail.next = null;
        while (p != null) {
            q = p;
            p = p.next;
            q.next = tail.next;
            tail.next = q;
        }
        // 依次比较，判断是否是回文
        ListNode head2 = tail.next;
        while (head2 != null) {
            if (head.val != head2.val)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}
