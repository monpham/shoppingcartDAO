package com.nguyenduchoang.shopmini.Service;

import com.nguyenduchoang.shopmini.Entity.ChiTietSanPham;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import com.nguyenduchoang.shopmini.Repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    public List<SanPham> layDanhSachSanPham(){
        return (List<SanPham>) sanPhamRepository.findAll();
    }

    public SanPham laySanPhamTheoMaSanPham(int id){
       SanPham sanPham =  sanPhamRepository.findByMasanpham(id);
        return sanPham;
    }

    public List<SanPham> laySanPhamTheoMaDanhMuc(int id){
        return (List<SanPham>) sanPhamRepository.findByDanhMucSanPham_Madanhmuc(id);
    }
    public void themSanpham(SanPham sanPham){
        sanPhamRepository.save(sanPham);
    }
    public void deleteSanpham(SanPham sanPham){
        sanPhamRepository.delete(sanPham);
    }


    public List<SanPham> editsanpham(){
        return (List<SanPham>) sanPhamRepository.findAll();
    }
    public void  updateSanpham(SanPham sanPham){
        sanPhamRepository.save(sanPham);
    }
}
