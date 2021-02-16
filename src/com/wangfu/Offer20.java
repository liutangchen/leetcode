package com.wangfu;

public class Offer20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        char[] sChar = s.trim().toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] >= '0' && sChar[i] <= '9') {
                numSeen = true;
            } else if (sChar[i] == '.') {
                if (eSeen || dotSeen) {
                    return false;
                }
                dotSeen = true;
            } else if (sChar[i] == 'e' || sChar[i] == 'E') {
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numSeen = false;
            } else if (sChar[i] == '-' || sChar[i] == '+') {
                if (i != 0 && sChar[i - 1] != 'e' && sChar[i - 1] != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return numSeen;
    }
}
