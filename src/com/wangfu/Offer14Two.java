package com.wangfu;

public class Offer14Two {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int shang = n / 3;
        int remain = n % 3;
        long res = 1;
        if (remain == 1) {
            shang -= 1;
            for (int i = 0; i < shang; i++) {
                res = res * 3 % 1000000007;
            }
            return (int) (res * 4 % 1000000007);
        } else if (remain == 2) {
            for (int i = 0; i < shang; i++) {
                res = res * 3 % 1000000007;
            }
            return (int) (res * 2 % 1000000007);
        } else {
            for (int i = 0; i < shang; i++) {
                res = res * 3 % 1000000007;
            }
            return (int) res;
        }
    }
}
