package com.nguyenduchoang.shopmini.Controller;
import com.nguyenduchoang.shopmini.Entity.ChucVu;
import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class NhanvienController {
    @Autowired
    NhanVienService nhanVienService;




    // list nhan vien
    @RequestMapping(value = "/account")
    public String listNhanvien(Model model) {
        List<NguoiDung> nguoiDung = nhanVienService.getListNguoiDung();
        model.addAttribute("nguoiDung", nguoiDung);
        return "account";
    }


    // xoa nhan vien
    @RequestMapping("/deleteNhanvien")
    public String deleteBook(NguoiDung nguoiDung) {
        nhanVienService.deleteNguoiDung(nguoiDung);
        return "redirect:/account";
    }


    // them nguoi dung
    @RequestMapping(value = "/addNhanvien")
    public String addNhanvien(Model model) {
        model.addAttribute("Nguoidung", new NguoiDung());
        return "addNguoiDung";
    }



    /// them nguoi dung
    @RequestMapping(value = "/newBook")
    public String newBook(NguoiDung nguoiDung) {
        nhanVienService.newNguoiDung(nguoiDung);
        return "redirect:/account";
    }


    // edit nhan vien
    @RequestMapping(value = "/editNhanvien")
    public String editBook(@RequestParam("manguoidung") int id, Model model) {
        NguoiDung nguoiDung = nhanVienService.editNguoiDung(id);
        model.addAttribute("Nguoidung", nguoiDung);
        model.addAttribute("type", "update");
        return "addNguoiDung";
    }


    // tim kiem nhan vien
    @RequestMapping(value = "/searchNhanvien")
    public String searchNhanvien(@RequestParam("machucvu") int id, Model model) {
        NguoiDung nguoiDung = nhanVienService.getNguoidung(id);
        
        model.addAttribute("Nguoidung", nguoiDung);
        return "redirect:/account";
    }
}
