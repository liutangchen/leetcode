package com.wangfu;


import java.util.Deque;
import java.util.LinkedList;

public class Leet402 {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        char[] chars = num.toCharArray();
        int count = 0; // 记录移掉的位数
        for (char ch : chars) {
            if (count == k) {
                deque.offerLast(ch);
                continue;
            }
            if (deque.isEmpty()) {
                deque.offerLast(ch);
                continue;
            }
            if (!deque.isEmpty() && ch > deque.getLast()) {
                deque.offerLast(ch);
                continue;
            }
            while (count < k && !deque.isEmpty() && deque.getLast() > ch) {
                deque.pollLast();
                count++;
            }
            deque.offerLast(ch);
        }
        while (count < k && !deque.isEmpty()) {
            deque.pollLast();
            count++;
        }
        while (!deque.isEmpty() && deque.getFirst() == '0')
            deque.pollFirst();
        if (deque.isEmpty())
            return "0";
        StringBuffer buffer = new StringBuffer();
        while (!deque.isEmpty()) {
            buffer.append(deque.pollFirst());
        }
        return buffer.toString();
    }
}
