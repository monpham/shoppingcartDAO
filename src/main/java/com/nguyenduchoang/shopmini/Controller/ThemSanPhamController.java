package com.nguyenduchoang.shopmini.Controller;
import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Service.DanhMucService;
import com.nguyenduchoang.shopmini.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes("email")

public class ThemSanPhamController {
    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    DanhMucService danhMucService;
    @GetMapping




    // them san pham o day va xu ly san pham o san pham controller

    @RequestMapping("themSanpham")
    public String themSanpham(@RequestParam("masanpham") int masanpham,
                              @RequestParam("tensanpham") String tensanpham,
                              @RequestParam("giatien") String giatien,
                              @RequestParam("mota") String mota,
                              @RequestParam("hinhsanpham") String hinhsanpham,
                              ModelMap modelMap) {
        SanPham sanPham = new SanPham();
        sanPham.setMasanpham(masanpham);
        sanPham.setTensanpham(tensanpham);
        sanPham.setGiatien(giatien);
        sanPham.setMota(mota);
        sanPham.setHinhsanpham(hinhsanpham);
        sanPhamService.themSanpham(sanPham);

        return "redirect:/tongsanpham";

    }

}
