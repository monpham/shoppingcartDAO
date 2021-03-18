package com.nguyenduchoang.shopmini.Service;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import com.nguyenduchoang.shopmini.Repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    DanhMucRepository danhMucRepository;

    public List<DanhMucSanPham> layDanhSachDanhMucSanPham(){
        return (List<DanhMucSanPham>)danhMucRepository.findAll();
    }
    public void deleteDanhMucSanPham(DanhMucSanPham danhMucSanPham){
        danhMucRepository.delete(danhMucSanPham);
    }
}
