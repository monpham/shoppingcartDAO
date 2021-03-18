package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;

@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon {
   @EmbeddedId
   ChiTietHoaDonId chiTietHoaDonId;


    public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
        this.chiTietHoaDonId = chiTietHoaDonId;
    }

    private String giatien;
    private int soluong;


    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public ChiTietHoaDonId getChiTietHoaDonId() {
        return chiTietHoaDonId;
    }

}
