package com.wangfu;


public class Leet415 {
    public String addStrings(String num1, String num2) {
        if (num1 == null && num2 == null)
            return null;
        if (num1 == null)
            return num2;
        if (num2 == null)
            return num1;
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer sb = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
