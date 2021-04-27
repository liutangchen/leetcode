package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/27 22:05
 */
public class Leet151 {
    public String reverseWords(String s) {
        // 去首尾空格
        s = s.trim();
        StringBuffer sb = new StringBuffer();
        // 去掉中间多余的空格
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (s.charAt(i - 1) != ' ') {
                    sb.append(s.charAt(i));
                }
            }
        }
        char[] chars = sb.toString().toCharArray();
        // 整个反转
        reverse(chars, 0, chars.length - 1);
        int i = 0, j = 0;
        // 单个单词反转
        while (i < chars.length) {
            while (j < chars.length && chars[j] != ' ') {
                j++;
            }
            reverse(chars, i, j - 1);
            i = j + 1;
            j = i;
        }
        sb = new StringBuffer();
        for (char ch : chars)
            sb.append(ch);
        return sb.toString();
    }

    public void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
