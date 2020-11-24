package com.wangfu;

import java.util.Arrays;

public class Leet242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        for (int i = 0;i < charsS.length;i++){
            if (charsS[i] != charsT[i])
                return false;
        }
        return true;
    }
}
