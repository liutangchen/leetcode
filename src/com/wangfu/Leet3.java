package com.wangfu;

import java.util.HashMap;
import java.util.Map;

public class Leet3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, temp = 0;
        for (int i = 0; i < chars.length; i++) {
            int lastIndex = map.getOrDefault(chars[i], -1);
            map.put(chars[i], i);
            temp = i - lastIndex > temp ? temp + 1 : i - lastIndex;
            res = Math.max(res, temp);
        }
        return res;
    }
}
