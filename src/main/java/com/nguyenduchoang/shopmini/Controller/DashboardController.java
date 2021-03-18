package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Service.DanhMucService;
import com.nguyenduchoang.shopmini.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class DashboardController {
    @Autowired
    DanhMucService danhMucService;
    @Autowired
    SanPhamService sanPhamService;



    @RequestMapping("/dashboard")
    public String getDashboard(){
        return "dashboard";
    }
    @RequestMapping("/Dashboardhome")
    public String getDashboardhome(){
        return "dashboard";
    }


// tong san pham
    @RequestMapping("/tongsanpham")
    public String ge(ModelMap model){
        model.addAttribute("listSanPham",sanPhamService.layDanhSachSanPham());
        List<DanhMucSanPham> danhmuc = danhMucService.layDanhSachDanhMucSanPham();
        model.addAttribute("danhmuc", danhmuc);
        return "tongsanpham";
    }


    // them san pham
    @RequestMapping("/addsanpham")
    public String getthemsanpham(ModelMap modelMap){
        List<DanhMucSanPham> danhMucSanPhams = danhMucService.layDanhSachDanhMucSanPham();
        modelMap.addAttribute("danhmuc",danhMucSanPhams);
        return "themsanpham";
    }







    // menu dieu huong ---------------------------
    @RequestMapping("/gallery")
    public String getgallery(){
        return "gallery";
    }
    @RequestMapping("/charts")
    public String getcharts(){
        return "charts";
    }
    @RequestMapping("/errorpage")
    public String geterrorpage(){
        return "errorpage";
    }
    @RequestMapping("/tables")
    public String gettables(){
        return "tabels";
    }
    @RequestMapping("/maps")
    public String getmaps(){
        return "maps";
    }

    @RequestMapping("/calendar")
    public String getcalendar(){
        return "calendar";
    }
    @RequestMapping("/inbox")
    public String getinbox(){
        return "inbox";
    }
    @RequestMapping("/blog")
    public String getblog(){
        return "blog";
    }

}

