package com.wangfu.weekly214;

import java.util.HashMap;
import java.util.Map;

public class Two {
    public int minDeletions(String s) {
        int len = s.length();
        int[] tmp = new int[len + 1];
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            tmp[map.get(ch)]++;
        }
        for (int i = len; i > 0; i--) {
            if (tmp[i] > 1){
                res += tmp[i]-1;
                tmp[i-1] += tmp[i]-1;
            }
        }
        return res;
    }
}
