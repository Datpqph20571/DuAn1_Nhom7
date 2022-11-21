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
    private String mauSac;
    private String kichCo;
    private int soLuong;
    private String ngayNhap;
    private String trangThai;
    private String nhanHieu;
    private int giaBan;
    private String ngaySanXuat;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String idSP, String tenSP, String mauSac, String kichCo, int soLuong, String ngayNhap, String trangThai, String nhanHieu, int giaBan, String ngaySanXuat) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.kichCo = kichCo;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.nhanHieu = nhanHieu;
        this.giaBan = giaBan;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "idSP=" + idSP + ", tenSP=" + tenSP + ", mauSac=" + mauSac + ", kichCo=" + kichCo + ", soLuong=" + soLuong + ", ngayNhap=" + ngayNhap + ", trangThai=" + trangThai + ", nhanHieu=" + nhanHieu + ", giaBan=" + giaBan + ", ngaySanXuat=" + ngaySanXuat + '}';
    }
}
