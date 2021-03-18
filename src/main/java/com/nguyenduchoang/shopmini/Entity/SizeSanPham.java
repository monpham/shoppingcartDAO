package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sizesanpham")
public class SizeSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masize")
    private int masize;
    @Column(name = "size")
    private String size;

    public SizeSanPham(int masize, String size) {
        this.masize = masize;
        this.size = size;
    }

    public SizeSanPham() {
    }

    public int getMasize() {
        return masize;
    }

    public void setMasize(int masize) {
        this.masize = masize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
