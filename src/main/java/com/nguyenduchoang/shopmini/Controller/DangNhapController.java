package com.nguyenduchoang.shopmini.Controller;

import com.nguyenduchoang.shopmini.Entity.ChucVu;
import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@SessionAttributes("email")
public class DangNhapController {
    @Autowired
    NhanVienService nhanVienService;

    @RequestMapping("/dangnhap")
    public String Default() {
        return "dangnhap";
    }



    // su ly dang ky dang nhap
    @PostMapping("trangchu")
    public String KiemTraDangNhap(@RequestParam("email") String email,
                                  @RequestParam("matkhau") String matkhau,
                                  ModelMap modelMap) {
        NguoiDung nguoiDung = nhanVienService.KiemTraDangNhap(email, matkhau);
        if (nguoiDung.getEmail().equals(email) && nguoiDung.getMatkhau().equals(matkhau) && nguoiDung.getChucVu().getTenchucvu().equals("user")) {
            modelMap.addAttribute("email", email);
            return "trangchu";
        } else if (nguoiDung.getEmail().equals(email) && nguoiDung.getMatkhau().equals(matkhau) && nguoiDung.getChucVu().getTenchucvu().equals("admin")) {
            modelMap.addAttribute("email", email);
            return "dashboard";
        }
        return "/dangnhap";
    }

    @RequestMapping("kiemtradangky")
    public String KiemTraDangKy(@RequestParam("email") String email,
                                @RequestParam("matkhau") String matkhau,
                                @RequestParam("nhaplaimatkhau") String nhaplaimatkhau,
                                ModelMap modelMap) {
        Boolean ktEmail = validate(email);
        if (ktEmail) {
            if (matkhau.equals(nhaplaimatkhau)) {
                NguoiDung nguoiDung = new NguoiDung();
                nguoiDung.setEmail(email);
                nguoiDung.setMachucvu(2);
                nguoiDung.setTendangnhap(email);
                nguoiDung.setMatkhau(matkhau);
                nhanVienService.ThemNhanVien(nguoiDung);
            } else {
                modelMap.addAttribute("kiemtradangky", "Vui lòng nhập đúng mật khẩu");
            }
        } else {
            modelMap.addAttribute("kiemtradangky", "Vui lòng nhập đúng định dạng");
        }
        return "dangnhap";
    }

    //code này dùng để kiểm tra email
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
