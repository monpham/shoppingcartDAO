package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.GioHang;
import com.nguyenduchoang.shopmini.Entity.HoaDon;
import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Service.HoaDonService;
import com.nguyenduchoang.shopmini.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes("email")
public class HoaDonController {
    @Autowired
    HoaDonService hoaDonService;

// hien thi hoa don
    @RequestMapping(value = "/chitiethoadon")
    public String listHoadon(Model model) {
        List<HoaDon> hoaDon = hoaDonService.layDanhSachHoaDon();
        model.addAttribute("HoaDon", hoaDon);
        return "chitiethoadon";

    }


    // xoa hoa don
    @RequestMapping("/deleteHoaDon")
    public String deleteBook(HoaDon hoaDon) {
        hoaDonService.deleteHoadon(hoaDon);
        return "redirect:/chitiethoadon";
    }


    @RequestMapping("/xacnhanmuahang")
    public String updateHoadon(
                                @RequestParam("tenkhachhang") String tenkhachhang,
                                @RequestParam("sodt") String sodt,
                                @RequestParam("ngaylaphoadon") String ngaylaphoadon,
                                @RequestParam("hinhthucgiaohang") String hinhthucgiaohang,
                                @RequestParam("diachigiaohang") String diachigiaohang,
                                @RequestParam("ghichu") String ghichu,
                                ModelMap modelMap) {
        HoaDon hoaDon = new HoaDon();
        hoaDon.setTenkhachhang(tenkhachhang);
        hoaDon.setSodt(sodt);
        hoaDon.setNgaylaphoadon(ngaylaphoadon);
        hoaDon.setHinhthucgiaohang(hinhthucgiaohang);
        hoaDon.setDiachigiaohang(diachigiaohang);
        hoaDon.setTinhtrang(true);
        hoaDon.setGhichu(ghichu);

        return "xacnhanmuahang";

    }



    // xem gio hang
    @RequestMapping("/xemgiohang")
    public String Default(HttpSession httpSession, ModelMap modelMap) {
        if (null != httpSession.getAttribute("giohang")) {
            List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
            modelMap.addAttribute("soluongsanphamgiohang", gioHangs.size());
            modelMap.addAttribute("giohangs", gioHangs);
        }
        return "xemgiohang";
    }
}
