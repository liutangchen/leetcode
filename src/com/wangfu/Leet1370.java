package com.wangfu;

public class Leet1370 {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        for (char ch : chars) {
            int temp = ch - 'a';
            arr[temp]++;
            if (arr[temp] > max)
                max = arr[temp];
        }
        StringBuffer res = new StringBuffer();
        boolean flag = true;
        while (max > 0) {
            if (flag) {
                for (int i = 0; i < 26; i++) {
                    if (arr[i] > 0) {
                        res.append((char) (i + 'a'));
                        arr[i]--;
                    }
                }
                flag = false;
            } else {
                for (int i = 25; i >= 0; i--) {
                    if (arr[i] > 0) {
                        res.append((char) (i + 'a'));
                        arr[i]--;
                    }
                }
                flag = true;
            }
            max--;
        }
        return res.toString();
    }
}
