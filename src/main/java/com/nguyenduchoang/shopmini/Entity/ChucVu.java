package com.nguyenduchoang.shopmini.Entity;

import javax.persistence.*;

@Entity
@Table(name = "chucvu")
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tenchucvu")
    private String tenchucvu;

    public ChucVu() {
    }

    public int getMachucvu() {
        return id;
    }

    public void setMachucvu(int id) {
        this.id = id;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
}
