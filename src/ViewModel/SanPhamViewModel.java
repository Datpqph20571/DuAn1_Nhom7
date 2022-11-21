/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author DELL
 */
public class SanPhamViewModel {

    private String idSP;
    private String tenSP;
    private String ngayNhap;
    private int trangThai;
    private String nhanHieu;
    private String mauSac;
    private String kichCo;
    private int giaBan;
    private int soLuong;
    private String ngaySanXuat;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String idSP, String tenSP, String ngayNhap, int trangThai, String nhanHieu, String mauSac, String kichCo, int giaBan, int soLuong, String ngaySanXuat) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.nhanHieu = nhanHieu;
        this.mauSac = mauSac;
        this.kichCo = kichCo;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String trangThait() {
        if (soLuong <= 0) {
            return "hếthàng";
        } else {
            return "cònhàng";
        }
    }

    public String nhanhieu() {
        if (nhanHieu == "NH1") {
            return "Adidas";
        } else {
            return "Dior";
        }
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "idSP=" + idSP + ", tenSP=" + tenSP + ", ngayNhap=" + ngayNhap + ", trangThai=" + trangThai + ", nhanHieu=" + nhanHieu + ", mauSac=" + mauSac + ", kichCo=" + kichCo + ", giaBan=" + giaBan + ", soLuong=" + soLuong + ", ngaySanXuat=" + ngaySanXuat + '}';
    }

}
