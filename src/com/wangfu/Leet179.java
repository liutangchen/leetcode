package com.wangfu;

import java.util.Arrays;

/**
 * @Author: liutangchen
 * @Date: 2021/4/12 11:22
 */
public class Leet179 {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";
        int n = nums.length;
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = nums[i] + "";
        }
        Arrays.sort(strings, (x, y) -> (y + x).compareTo(x + y));
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }
        String res = sb.toString();
        if (res.startsWith("0"))
            return "0";
        return res;
    }
}
