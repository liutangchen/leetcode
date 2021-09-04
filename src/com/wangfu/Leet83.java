package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/6/18 15:44
 */
public class Leet83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head, q = head.next;
        while (q != null) {
            if (p.val != q.val) {
                q = q.next;
                p = p.next;
            } else {     // 相等
                p.next = q.next;
                q = p.next;
            }
        }
        return head;
    }
}
