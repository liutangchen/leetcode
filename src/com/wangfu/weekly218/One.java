package com.wangfu.weekly218;

public class One {
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < chars.length; ) {
            if (chars[i] == 'G') {
                res.append("G");
                i++;
            } else if (chars[i] == '(' && chars[i + 1] == ')') {
                res.append("o");
                i += 2;
            } else {
                res.append("al");
                i += 4;
            }
        }
        return res.toString();
    }
}
