package com.example.KTNC_Buoi5.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private double gia;
    private int soLuong;
    private String danhMuc;
}
