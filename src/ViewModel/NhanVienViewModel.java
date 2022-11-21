/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Khanh
 */
public class NhanVienViewModel {
    private String idNv,maNV,tenNV,ngaySinh,email,sdt,diaChi,idTrangthai,chucVu,gioiTinh,tk,mk;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String idNv, String maNV, String tenNV, String ngaySinh, String email, String sdt, String diaChi, String idTrangthai, String chucVu, String gioiTinh, String tk, String mk) {
        this.idNv = idNv;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.idTrangthai = idTrangthai;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.tk = tk;
        this.mk = mk;
    }

    public String getIdNv() {
        return idNv;
    }

    public void setIdNv(String idNv) {
        this.idNv = idNv;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getIdTrangthai() {
        return idTrangthai;
    }

    public void setIdTrangthai(String idTrangthai) {
        this.idTrangthai = idTrangthai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    
    
}
