package com.nguyenduchoang.shopmini.Service;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Entity.HoaDon;
import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import com.nguyenduchoang.shopmini.Repository.DanhMucRepository;
import com.nguyenduchoang.shopmini.Repository.HoaDonRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoaDonService {
    @Autowired
    HoaDonRepisitory hoaDonRepisitory;

    public List<HoaDon> layDanhSachHoaDon(){
        return (List<HoaDon>)hoaDonRepisitory.findAll();
    }
    public void deleteHoadon(HoaDon hoaDon){
        hoaDonRepisitory.delete(hoaDon);
    }

    public Boolean ThemHoaDon(HoaDon hoaDon){
        hoaDonRepisitory.save(hoaDon);
        if (hoaDonRepisitory.save(hoaDon) == null){
            return false;
        }else {
            return true;
        }
    }


}
