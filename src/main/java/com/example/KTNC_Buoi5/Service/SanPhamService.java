package com.example.KTNC_Buoi5.Service;

import com.example.KTNC_Buoi5.Model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sanPhams = new ArrayList<>();
    public void themSP(SanPham sanPham){
        sanPhams.add(sanPham);
    }
    public boolean xoaSP(String ma){
        return sanPhams.removeIf(sanPham -> sanPham.getMa().equals(ma));
    }
    public List<SanPham> getSanPhams(){
        return sanPhams;
    }
}
