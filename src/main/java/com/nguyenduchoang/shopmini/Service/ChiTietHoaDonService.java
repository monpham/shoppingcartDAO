package com.nguyenduchoang.shopmini.Service;


import com.nguyenduchoang.shopmini.Entity.ChiTietHoaDon;
import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Repository.ChiTietHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietHoaDonService {
    @Autowired
    ChiTietHoaDonRepository chiTietHoaDonRepository;

    public List<ChiTietHoaDon> LaydanhSachHoaDon(){
        return (List<ChiTietHoaDon>)chiTietHoaDonRepository.findAll();
    }
    public boolean ThemChiTietHoaDon (ChiTietHoaDon chiTietHoaDon){
        chiTietHoaDonRepository.save(chiTietHoaDon);
        if (chiTietHoaDonRepository.save(chiTietHoaDon)!= null){
            return true;
        }else {
            return false;
        }
    }

}
