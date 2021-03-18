package com.nguyenduchoang.shopmini.Repository;

import com.nguyenduchoang.shopmini.Entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface SanPhamRepository extends CrudRepository<SanPham,Integer>  {


    public SanPham findByMasanpham(int id);
    public List<SanPham> findByDanhMucSanPham_Madanhmuc(int id) ;
}
