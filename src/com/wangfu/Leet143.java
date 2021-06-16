package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/5/25 10:21
 */
public class Leet143 {
    /**
     * 寻找链表中点 + 链表逆序 + 合并链表
     *
     * @param head
     */
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode l1 = head;
        ListNode mid = findMid(head);
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseList(l2);
        merge(l1, l2);
    }

    /**
     * 合并
     * @param l1
     * @param l2
     */
    private void merge(ListNode l1, ListNode l2) {
        while (l2 != null) {
            ListNode l3 = l1.next, l4 = l2.next;
            l2.next = l1.next;
            l1.next = l2;
            l1 = l3;
            l2 = l4;
        }
    }

    /**
     * 反转链表
     *
     * @param l2
     * @return
     */
    private ListNode reverseList(ListNode l2) {
        if (l2 == null)
            return null;
        ListNode head = null;
        while (l2 != null) {
            ListNode next = l2.next;
            l2.next = head;
            head = l2;
            l2 = next;
        }
        return head;
    }

    /**
     * 寻找链表的中间节点
     *
     * @param head
     * @return
     */
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
