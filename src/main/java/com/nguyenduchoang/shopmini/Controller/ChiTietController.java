package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Entity.GioHang;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Service.DanhMucService;
import com.nguyenduchoang.shopmini.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

@SessionAttributes("email")
public class ChiTietController {
    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    DanhMucService danhMucService;

    @RequestMapping(value = {"/chitiet/{masanpham}"})
    public String chiTietSanPham(@PathVariable int masanpham, ModelMap modelMap, HttpSession session){
        SanPham sanpham = sanPhamService.laySanPhamTheoMaSanPham(masanpham);
        List<DanhMucSanPham> danhmuc = danhMucService.layDanhSachDanhMucSanPham();
        if( session.getAttribute("giohang" ) != null){
            List<GioHang> gioHangs = (List<GioHang>) session.getAttribute("giohang");
            modelMap.addAttribute("soluongsanphamgiohang",gioHangs.size());
        }
        modelMap.addAttribute("sanpham", sanpham);
        modelMap.addAttribute("danhmuc", danhmuc);
        return "chitiet";
    }

}
