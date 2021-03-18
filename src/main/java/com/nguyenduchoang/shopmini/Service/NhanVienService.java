package com.nguyenduchoang.shopmini.Service;

import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;

   public NguoiDung KiemTraDangNhap(String email, String matkhau){
       NguoiDung nguoiDung = nhanVienRepository.findByEmailAndMatkhau(email,matkhau);
       return nguoiDung;
   }
   public void ThemNhanVien(NguoiDung nguoiDung){
        nhanVienRepository.save(nguoiDung);
   }
    public List<NguoiDung> getListNguoiDung(){
        return (List<NguoiDung>) nhanVienRepository.findAll();
    }
    public void deleteNguoiDung(NguoiDung nguoiDung){
        nhanVienRepository.delete(nguoiDung);
    }
    public void newNguoiDung(NguoiDung nguoiDung){
        nhanVienRepository.save(nguoiDung);
    }
    public NguoiDung editNguoiDung(int id){
        return nhanVienRepository.findByManguoidung(id);
    }
    public NguoiDung getNguoidung(int  id){
        return nhanVienRepository.findByMachucvu(id);
    }
}
