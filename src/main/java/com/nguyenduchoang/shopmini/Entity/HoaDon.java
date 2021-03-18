package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hoadon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahoadon")
    private int mahoadon;
    @Column(name = "tenkhachhang")
    private String tenkhachhang;
    @Column(name = "sodt")
    private String sodt;
    @Column(name = "diachigiaohang")
    private String diachigiaohang;
    @Column(name = "tinhtrang")
    private boolean tinhtrang;
    @Column(name = "ngaylaphoadon")
    private String ngaylaphoadon;
    @Column(name = "hinhthucgiaohang")
    private String hinhthucgiaohang;
    @Column(name = "ghichu")
    private String ghichu;


    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name = "mahoadon")
    Set<ChiTietHoaDon> danhsachchitiethoadon;

    public String getHinhthucgiaohang() {
        return hinhthucgiaohang;
    }

    public void setHinhthucgiaohang(String hinhthucgiaohang) {
        this.hinhthucgiaohang = hinhthucgiaohang;
    }
    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getNgaylaphoadon() {
        return ngaylaphoadon;
    }

    public void setNgaylaphoadon(String ngaylaphoadon) {
        this.ngaylaphoadon = ngaylaphoadon;
    }

    public Set<ChiTietHoaDon> getDanhsachchitiethoadon() {
        return danhsachchitiethoadon;
    }

    public void setDanhsachchitiethoadon(Set<ChiTietHoaDon> danhsachchitiethoadon) {
        this.danhsachchitiethoadon = danhsachchitiethoadon;
    }

}
