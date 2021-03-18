package com.nguyenduchoang.shopmini.Repository;

import com.nguyenduchoang.shopmini.Entity.HoaDon;
import com.nguyenduchoang.shopmini.Entity.SanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonRepisitory extends CrudRepository<HoaDon,Integer> {

}
