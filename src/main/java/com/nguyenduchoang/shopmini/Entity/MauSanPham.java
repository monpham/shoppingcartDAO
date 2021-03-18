package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;

@Entity
@Table(name = "mausanpham")
public class MauSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mamau")
    private int mamau;
    @Column(name = "tenmau")
    private String tenmau;

    public MauSanPham(int mamau, String tenmau) {
        this.mamau = mamau;
        this.tenmau = tenmau;
    }

    public MauSanPham() {
    }

    public int getMamau() {
        return mamau;
    }

    public void setMamau(int mamau) {
        this.mamau = mamau;
    }

    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
    }
}
