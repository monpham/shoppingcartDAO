package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.GioHang;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("giohang")
public class ApiController {

// nhan cac gia tri tu from
    @GetMapping("ThemGioHang")
    public String ThemGioHang(@RequestParam int masp, @RequestParam int masize,
                              @RequestParam int mamau, @RequestParam String tensp,
                              @RequestParam String giatien, @RequestParam String tenmau,
                              @RequestParam String tensize, @RequestParam int soluong,
                              @RequestParam int machitiet, HttpSession session) {
        if (null == session.getAttribute("giohang")) {
            List<GioHang> gioHangs = new ArrayList<>();
            GioHang gioHang = new GioHang();
            gioHang.setMasp(masp);
            gioHang.setMasize(masize);
            gioHang.setMamau(mamau);
            gioHang.setTensp(tensp);
            gioHang.setGiatien(giatien);
            gioHang.setTenmau(tenmau);
            gioHang.setTensize(tensize);
            gioHang.setSoluong(1);
            gioHang.setMachitiet(machitiet);
            gioHangs.add(gioHang);
            session.setAttribute("giohang", gioHangs);
            return gioHangs.size() + "";
        } else {
            List<GioHang> listGioHangs = (List<GioHang>) session.getAttribute("giohang");
            int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs, session, masp, masize, mamau);
            if (vitri == -1) {
                GioHang gioHang = new GioHang();
                gioHang.setMasp(masp);
                gioHang.setMasize(masize);
                gioHang.setMamau(mamau);
                gioHang.setTensp(tensp);
                gioHang.setGiatien(giatien);
                gioHang.setTenmau(tenmau);
                gioHang.setTensize(tensize);
                gioHang.setSoluong(1);
                gioHang.setMachitiet(machitiet);
                listGioHangs.add(gioHang);
            } else {
                int soluongmoi = listGioHangs.get(vitri).getSoluong() + 1;
                listGioHangs.get(vitri).setSoluong(soluongmoi);
            }
            return listGioHangs.size() + "";
        }

    }

    // hàm kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay không.
    // Tại đây nhận vào 3 giá trị và so sánh
    private int KiemTraSanPhamDaTonTaiGioHang(List<GioHang> listGioHangs, HttpSession httpSession, int masp, int masize, int mamau) {
        for (int i = 0; i < listGioHangs.size(); i++) {
            if (listGioHangs.get(i).getMasp() == masp && listGioHangs.get(i).getMasize() == masize && listGioHangs.get(i).getMamau() == mamau) {
                return i;
            }
        }
        return -1;
    }



    @GetMapping("CapNhatGioHang")
    @ResponseBody
    public void CatNhatGioHang(HttpSession httpSession,@RequestParam int soluong ,@RequestParam int masp, @RequestParam int mamau,@RequestParam int masize){
        if(null != httpSession.getAttribute("giohang") ){
            List<GioHang> listGioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
            int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs, httpSession, masp, masize, mamau);
            listGioHangs.get(vitri).setSoluong(soluong);
        }
    }

    @GetMapping("XoaGioHang")
    @ResponseBody
    public void XoaGioHang(HttpSession httpSession,@RequestParam int masp, @RequestParam int mamau,@RequestParam int masize){
        if(null != httpSession.getAttribute("giohang") ){
            List<GioHang> listGioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
            int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs, httpSession, masp, masize, mamau);
            listGioHangs.remove(vitri);
        }
    }
}
