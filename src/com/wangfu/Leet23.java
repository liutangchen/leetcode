package com.wangfu;

public class Leet23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        ListNode res = new ListNode(0);
        res.next = null;
        ListNode p = res;
        ListNode minNode = null;
        int n = lists.length, minIndex = -1;
        while (n > 0) {
            minNode = new ListNode(10001);
            n = lists.length;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    n--;
                    continue;
                }
                if (lists[i].val < minNode.val) {
                    minNode = lists[i];
                    minIndex = i;
                }
            }
            if (minIndex != -1) {
                if (minNode.next == null)
                    n--;
                lists[minIndex] = minNode.next;
                minNode.next = null;
                p.next = minNode;
                p = p.next;
            }
        }
        return res.next;
    }
}
