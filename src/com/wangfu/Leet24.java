package com.wangfu;

public class Leet24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode headNew = new ListNode(-1);
        ListNode pre = headNew, tail = headNew, temp = null;
        int count = 0;
        while (head != null) {
            count++;
            temp = head;
            head = head.next;
            temp.next = null;
            if ((count & 1) == 1) { // 如果是第奇数个节点，直接插在末尾
                pre.next = temp;
                pre = pre.next;
            } else {                // 如果是第偶数个节点，插入到倒数第二的位置
                temp.next = pre;
                tail.next = temp;
                tail = pre;
            }
        }
        return headNew.next;
    }
}
