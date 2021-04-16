package com.wangfu;

public class Offer35 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        copy(head);
        randomDirect(head);
        return reList(head);
    }

    public void copy(Node head) {
        while (head != null) {
            Node cloneNode = new Node(head.val);
            cloneNode.next = head.next;
            head.next = cloneNode;
            head = cloneNode.next;
        }
    }

    public void randomDirect(Node head) {
        while (head != null) {
            Node cloneNode = head.next;
            if (head.random != null) {
                cloneNode.random = head.random.next;
            } else {
                cloneNode.random = null;
            }
            head = cloneNode.next;
        }
    }

    public Node reList(Node head) {
        Node cloneNode = head.next;
        Node cloneHead = cloneNode;
        while (head != null && head.next != null) {
            Node next = head.next;
            head.next = head.next.next;
            head = next;
        }
        return cloneHead;
    }
}
