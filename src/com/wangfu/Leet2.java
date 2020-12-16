package com.wangfu;

public class Leet2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0, sum = 0, num = 0; // c用来表示进位,num表示当前数字
        ListNode res = new ListNode(-1);
        ListNode p = res;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + c;
            c = sum / 10;
            num = sum % 10;
            p.next = new ListNode(num);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + c;
            c = sum / 10;
            num = sum % 10;
            p.next = new ListNode(num);
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + c;
            c = sum / 10;
            num = sum % 10;
            p.next = new ListNode(num);
            p = p.next;
            l2 = l2.next;
        }
        if (c == 1)
            p.next = new ListNode(1);
        return res.next;
    }
}
