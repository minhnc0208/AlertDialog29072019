package com.example.alterdialog29072019;

public class NhanvienBuilder implements Builder {
    private String ten;
    private int diaChi;

    @Override
    public Builder setTen(String ten) {
        this.ten = ten;
        return null;
    }

    @Override
    public Builder setDiaChi(int diaChi) {
        this.diaChi = diaChi;
        return null;
    }

    public Nhanvien builder() {
        return new Nhanvien(ten, diaChi);
    }
}
