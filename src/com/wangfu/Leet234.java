package com.wangfu;

/**
 * 解题思路：先找到链表的中间节点，然后将链表后半部分反转，然后再依次比较是否相等，不相等就返回false
 */
public class Leet234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        // 找到链表的中间节点
        ListNode fast = head, slow = head;  // fast代表快指针，slow代表慢指针
        while (fast.next != null && fast.next.next != null) {  // 找到链表的中间节点
            slow = slow.next;
            fast = fast.next.next;
        }
        // 反转链表的后半部分
        ListNode p = slow.next, head2 = null, q = null;
        slow.next = null;
        while (p != null) {
            q = p.next;
            p.next = head2;
            head2 = p;
            p = q;
        }
        // 依次比较，判断是否是回文
        while (head2 != null) {
            if (head.val != head2.val)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}
