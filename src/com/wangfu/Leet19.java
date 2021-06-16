package com.wangfu;

public class Leet19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headNew = new ListNode(-1); // 加头节点便于统一处理
        headNew.next = head;
        ListNode pre = headNew, tail = headNew;
        for (int i = 0; i < n + 1; i++) {  // 注意这里是先走n+1步
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            tail = tail.next;
        }
        tail.next = tail.next.next;
        return headNew.next;
    }
}
