package ss5_access_modifier.bai_tap.thuc_pham;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class ThucPham {
    public int maHang = 123;
    public String tenHang = "Sữa";
    public int donGia;
    public Date ngaySanXuat;
    public Date ngayHetHang;

    public ThucPham(int maHang, String tenHang, int donGia, Date ngaySanXuat, Date ngayHetHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHang = ngayHetHang;
    }

    public ThucPham(int maHang) {
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHang() {
        return ngayHetHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setNgayHetHang(Date ngayHetHang) {
        this.ngayHetHang = ngayHetHang;
    }

}

