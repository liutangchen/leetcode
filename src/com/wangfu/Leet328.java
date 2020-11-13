package com.wangfu;

public class Leet328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode head1 = head; // 奇数节点的头
        ListNode head2 = head.next; // 偶数节点的头
        if (head2 == null)
            return head;
        else {
            ListNode p = head2.next;
            if (p == null)
                return head;
            else {
                head.next = null;
                head2.next = null;
                ListNode head3 = head2;
                ListNode q = null; // 用来记录p的下一个
                boolean flag = true; // 当前是否为奇数位
                while (p != null) {
                    q = p.next;
                    if (flag) {
                        head1.next = p;
                        head1 = head1.next;
                        head1.next = null;
                        p = q;
                        flag = false;
                    } else {
                        head2.next = p;
                        head2 = head2.next;
                        head2.next = null;
                        p = q;
                        flag = true;
                    }
                }
                head1.next = head3;
            }
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
