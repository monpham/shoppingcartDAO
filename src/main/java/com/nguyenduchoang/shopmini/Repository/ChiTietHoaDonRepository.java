package com.nguyenduchoang.shopmini.Repository;

import com.nguyenduchoang.shopmini.Entity.ChiTietHoaDon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietHoaDonRepository extends CrudRepository<ChiTietHoaDon,Integer> {
}
