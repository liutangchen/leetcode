package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/13 10:50
 */
public class Leet92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        ListNode tempHead = new ListNode();
        tempHead.next = head;
        ListNode p = tempHead, q = tempHead;
        ListNode tail = null, needReverseListNode = null;
        for (int i = 0; i < right; i++) {
            p = p.next;
        }
        tail = p.next;
        p.next = null;
        for (int i = 0; i < left - 1; i++) {
            q = q.next;
        }
        needReverseListNode = q.next;
        q.next = null;
        ListNode reverseHead = reverseListNode(needReverseListNode);
        q.next = reverseHead;
        while (reverseHead.next != null) {
            reverseHead = reverseHead.next;
        }
        reverseHead.next = tail;
        return tempHead.next;
    }

    private ListNode reverseListNode(ListNode needReverseListNode) {
        ListNode tempHead = new ListNode();
        tempHead.next = null;
        ListNode next = null;
        while (needReverseListNode != null) {
            next = needReverseListNode.next;
            needReverseListNode.next = tempHead.next;
            tempHead.next = needReverseListNode;
            needReverseListNode = next;
        }
        return tempHead.next;
    }
}
