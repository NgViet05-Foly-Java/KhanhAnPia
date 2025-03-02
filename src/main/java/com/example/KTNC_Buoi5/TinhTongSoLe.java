package com.example.KTNC_Buoi5;

public class TinhTongSoLe {
    public static int tinhTongLe(int n) {
        if (n < 1) {
            return 0; // Trả về 0 nếu n không hợp lệ
        }
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }
}

