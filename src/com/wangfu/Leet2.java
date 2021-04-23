package com.wangfu;

public class Leet2 {
    /**
     * 击败100%
     *
     * @param l1
     * @param l2
     * @return
     */
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

    /**
     * 代码简单些，但太慢了
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = res;
        int a = 0, b = 0, c = 0; // c用来表示进位
        while (l1 != null || l2 != null || c != 0) {
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            } else {
                a = 0;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            } else {
                b = 0;
            }
            int sum = a + b + c;
            ListNode cur = new ListNode(sum % 10);
            c = sum / 10;
            p.next = cur;
            p = p.next;
        }
        return res.next;
    }
}
