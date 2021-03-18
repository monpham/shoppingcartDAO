package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Service.DanhMucService;
import com.nguyenduchoang.shopmini.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("email")
public class TrangChuController {
    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    DanhMucService danhMucService;
    @RequestMapping("/trangchu")
    public String getdangnhap(ModelMap model){
      model.addAttribute("listSanPham",sanPhamService.layDanhSachSanPham());
        List<DanhMucSanPham> danhmuc = danhMucService.layDanhSachDanhMucSanPham();
        model.addAttribute("danhmuc", danhmuc);
      return "trangchu";
    }
}
