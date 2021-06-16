package com.wangfu;

/**
 * @Author: liutangchen
 * @Date: 2021/4/28 21:33
 */
public class Leet8 {
    public int myAtoi(String s) {
        // 去前后空格
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int i = 0;
        // 是否为负数
        boolean isNegative = false;
        // 不是以'+'，'-'或者数字开头直接返回0
        if (s.charAt(i) != '-' && s.charAt(i) != '+' && s.charAt(i) < '0' && s.charAt(i) > '9') {
            return 0;
        }
        // 负数
        if (s.charAt(i) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        // 略过前缀0
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        long result = 0;
        // 如果从i开始往后11位还没有到字符串末尾那么只需要算11位即可，因为11位的数字肯定超过了整数的范围
        int maxLength = i + 11 > s.length() ? s.length() : i + 11;
        for (; i < maxLength; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                break;
            result = result * 10 + (s.charAt(i) - '0');
        }
        if (isNegative) {
            result = Math.negateExact(result);
            return result < -2147483648 ? -2147483648 : (int) result;
        }
        return result > 2147483647 ? 2147483647 : (int) result;
    }
}
