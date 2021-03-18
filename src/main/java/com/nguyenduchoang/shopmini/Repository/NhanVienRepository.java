package com.nguyenduchoang.shopmini.Repository;

import com.nguyenduchoang.shopmini.Entity.NguoiDung;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends CrudRepository<NguoiDung, Integer> {
    public NguoiDung findByEmailAndMatkhau(String Email, String matkhau);
    public NguoiDung findByManguoidung(int id);
    public NguoiDung findByMachucvu(int id);
}
