package com.wangfu;

import java.util.LinkedList;

public class Leet394 {
    public String decodeString(String s) {
        LinkedList<Integer> stack_num = new LinkedList<>();
        LinkedList<String> stack_str = new LinkedList<>();
        int num = 0;
        StringBuffer res = new StringBuffer();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack_num.addLast(num);
                stack_str.addLast(res.toString());
                num = 0;
                res = new StringBuffer();
            } else if (ch == ']') {
                int temp_num = stack_num.removeLast();
                StringBuffer temp_str = new StringBuffer();
                for (int i = 0; i < temp_num; i++) {
                    temp_str.append(res);
                }
                res = new StringBuffer(stack_str.removeLast() + temp_str);
            } else if (ch >= '0' && ch <= '9') {
                num = num * 10 + Integer.valueOf("" + ch);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
