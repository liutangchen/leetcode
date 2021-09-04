package com.wangfu;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liutangchen
 * @Date: 2021/7/17 10:16
 */
public class Leet93 {
    static final int SEG_COUNT = 4;
    List<String> ans = new ArrayList<>();
    int[] segments = new int[SEG_COUNT];

    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 0);
        return ans;
    }

    void dfs(String s, int segId, int startIndex) {
        // 如果找到了 4 段 IP 地址并且遍历完了字符串，那么就是一种答案
        if (segId == SEG_COUNT) {
            if (startIndex == s.length()) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < SEG_COUNT; i++) {
                    sb.append(segments[i]);
                    if (i != SEG_COUNT - 1) {
                        sb.append('.');
                    }
                }
                ans.add(sb.toString());
            }
            return;
        }
        // 如果还没有找到 4 段 IP 地址就已经遍历完了字符串，那么提前回溯
        if (startIndex == s.length()) {
            return;
        }

        // 由于不能有前导零，如果当前数字为 0，那么这一段 IP 地址只能为 0
        if (s.charAt(startIndex) == '0') {
            segments[segId] = 0;
            dfs(s, segId + 1, startIndex + 1);
        }

        // 一般情况，枚举每一种可能性并递归
        int temp = 0;
        for (int endIndex = startIndex; endIndex < s.length(); endIndex++) {
            temp = temp * 10 + s.charAt(endIndex) - '0';
            if (temp > 0 && temp <= 0xFF) {
                segments[segId] = temp;
                dfs(s, segId + 1, endIndex + 1);
            } else {
                break;
            }
        }
    }
}