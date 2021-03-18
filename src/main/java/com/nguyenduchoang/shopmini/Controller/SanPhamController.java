package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Service.DanhMucService;
import com.nguyenduchoang.shopmini.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SanPhamController {
    @Autowired
    DanhMucService danhMucService;
    @Autowired
    SanPhamService sanPhamService;



    // tim kiem san pham theo id va load san pham

    @RequestMapping(value = {"/sanpham/{id}/{tendanhmuc}"})
    public String defaul(ModelMap model, @PathVariable int id, @PathVariable String tendanhmuc) {
        List<SanPham> listSanPham = sanPhamService.laySanPhamTheoMaDanhMuc(id);
        List<DanhMucSanPham> danhmuc = danhMucService.layDanhSachDanhMucSanPham();
        model.addAttribute("danhmuc", danhmuc);
        model.addAttribute("tendanhmuc", tendanhmuc);
        model.addAttribute("listSanPham", listSanPham);
        return "/sanpham";
    }



    // xoa san pham
    @RequestMapping("/deleteSanpham")
    public String deleteBook(SanPham sanPham, DanhMucSanPham danhMucSanPham) {
        sanPhamService.deleteSanpham(sanPham);
        danhMucService.deleteDanhMucSanPham(danhMucSanPham);
        return "redirect:/tongsanpham";
    }



    // edit day san pham vao muc edit de giu lai id
    @RequestMapping(value = "/editSanpham")
    public String editSanpham(SanPham sanPham, Model model) {
        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(sanPham);
        model.addAttribute("sanpham", sanPham);
        model.addAttribute("sanPhams", sanPhams);
        return "editsanpham";
    }


    // edit san pham va update
    @RequestMapping("/LeveupSanpham")
    public String UpdateSanpham(SanPham sanPham, Model model){
        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(sanPham);
        sanPhamService.updateSanpham(sanPham);
        model.addAttribute("sanPhams",sanPhams);
        return "redirect:tongsanpham";
    }










// khong dung phan nay
    @RequestMapping("updateSanpham")
    public String updateSanpham(@RequestParam("masanpham") int masanpham,
                              @RequestParam("tensanpham") String tensanpham,
                              @RequestParam("giatien") String giatien,
                              @RequestParam("mota") String mota,
                              @RequestParam("hinhsanpham") String hinhsanpham,
                              ModelMap modelMap) {
        SanPham sanPham = new SanPham();
        sanPham.setTensanpham(tensanpham);
        sanPham.setGiatien(giatien);
        sanPham.setMota(mota);
        sanPham.getDanhMucSanPham().setMadanhmuc(2);
        sanPham.setHinhsanpham(hinhsanpham);
        sanPham.setMasanpham(masanpham);
        return "tongsanpham";

    }
}
