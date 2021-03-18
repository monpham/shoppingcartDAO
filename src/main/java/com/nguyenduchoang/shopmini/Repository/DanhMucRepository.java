package com.nguyenduchoang.shopmini.Repository;

import com.nguyenduchoang.shopmini.Entity.DanhMucSanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhMucRepository extends CrudRepository<DanhMucSanPham, Integer> {

}
