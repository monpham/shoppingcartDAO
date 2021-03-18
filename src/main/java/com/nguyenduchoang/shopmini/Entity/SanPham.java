package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masanpham")
    private int masanpham;
    @Column(name = "tensanpham")
    private String tensanpham;
    @Column(name = "giatien")
    private String giatien;
    @Column(name = "mota")
    private String mota;
    @Column(name = "hinhsanpham")
    private String hinhsanpham;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "madanhmuc")
    DanhMucSanPham danhMucSanPham;




    @OneToMany(fetch =FetchType.EAGER, cascade = CascadeType.ALL)
            @JoinColumn(name = "masanpham")
    Set<ChiTietSanPham> chitietsanpham;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chitietkhuyenmai",
            joinColumns = {@JoinColumn(name = "masanpham",referencedColumnName = "masanpham") },
            inverseJoinColumns = {@JoinColumn(name = "makhuyenmai",referencedColumnName = "makhuyenmai")}
    )
    Set<KhuyenMai> danhsachkhuyenmai;

    public Set<KhuyenMai> getDanhsachkhuyenmai() {
        return danhsachkhuyenmai;
    }

    public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
        this.danhsachkhuyenmai = danhsachkhuyenmai;
    }

    public Set<ChiTietSanPham> getChitietsanpham() {
        return chitietsanpham;
    }

    public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
        this.chitietsanpham = chitietsanpham;
    }

    public SanPham() {
    }

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhsanpham() {
        return hinhsanpham;
    }

    public void setHinhsanpham(String hinhsanpham) {
        this.hinhsanpham = hinhsanpham;
    }

    public DanhMucSanPham getDanhMucSanPham() {
        return danhMucSanPham;
    }

    public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
        this.danhMucSanPham = danhMucSanPham;
    }
}
