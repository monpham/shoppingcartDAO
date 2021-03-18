package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.ChiTietHoaDon;
import com.nguyenduchoang.shopmini.Entity.ChiTietHoaDonId;
import com.nguyenduchoang.shopmini.Entity.GioHang;
import com.nguyenduchoang.shopmini.Entity.HoaDon;
import com.nguyenduchoang.shopmini.Service.ChiTietHoaDonService;
import com.nguyenduchoang.shopmini.Service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.persistence.Column;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@SessionAttributes("email")
public class GioHangController {
    @Autowired
    HoaDonService hoaDonService;
    @Autowired
    ChiTietHoaDonService chiTietHoaDonService;



    // xem gio hang
    @RequestMapping("/giohang")
    public String Default(HttpSession httpSession, ModelMap modelMap) {
        if (null != httpSession.getAttribute("giohang")) {
            List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
            modelMap.addAttribute("soluongsanphamgiohang", gioHangs.size());
            modelMap.addAttribute("giohangs", gioHangs);
        }
        return "giohang";
    }

// Thong tin mua hang vao hoa don
    @PostMapping("/giohang")
    public String ThemHoaDon(HttpSession httpSession, ModelMap modelMap, @RequestParam String tenkhachhang, @RequestParam String sodt,
                             @RequestParam String diachigiaohang, @RequestParam String hinhthucgiaohang,@RequestParam String ngaylaphoadon,
                             @RequestParam String ghichu) {
        System.out.println(hinhthucgiaohang + "123");
        if (null != httpSession.getAttribute("giohang")) {
            List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
            HoaDon hoaDon = new HoaDon();
            hoaDon.setTenkhachhang(tenkhachhang);
            hoaDon.setSodt(sodt);
            hoaDon.setNgaylaphoadon(ngaylaphoadon);
            hoaDon.setDiachigiaohang(diachigiaohang);
            hoaDon.setHinhthucgiaohang(hinhthucgiaohang);
            hoaDon.setTinhtrang(true);
            hoaDon.setGhichu(ghichu);
            if (hoaDonService.ThemHoaDon(hoaDon) != null) {

                Set<ChiTietHoaDon> chiTietHoaDons = new HashSet<>();
                for (GioHang gioHang : gioHangs) {
                    ChiTietHoaDonId chiTietHoaDonId = new ChiTietHoaDonId();
                    chiTietHoaDonId.setMachitietsanpham(gioHang.getMachitiet());
                    ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                    chiTietHoaDon.setChiTietHoaDonId(chiTietHoaDonId);
                    chiTietHoaDon.setGiatien(gioHang.getGiatien().toString());
                    chiTietHoaDon.setSoluong(gioHang.getSoluong());
                }
            } else {
                System.out.println("that bai");
            }
        }
        return "xacnhanmuahang";
    }


}
