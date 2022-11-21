/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsitory;

import Helper.DBContext;
import ViewModel.NhanVienViewModel;
import donaimModel.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Khanh
 */
public class NhanVienRepository {
    private DBContext connection;

    public ArrayList<NhanVienViewModel> getList() {
        ArrayList<NhanVienViewModel> nvvms = new ArrayList<>();
        String sql = "select NHANVIEN.IdNhanVien,MaNV,TenNV,NgaySinh,Email,SDT,DiaChi,IdTrangThai,ChucVu,GioiTinh,TK,MK  from NHANVIEN";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel();
                nv.setIdNv(rs.getString(1));
                nv.setMaNV(rs.getString(2));
                nv.setTenNV(rs.getString(3));
                nv.setNgaySinh(rs.getString(4));
                nv.setEmail(rs.getString(5));
                nv.setSdt(rs.getString(6));
                nv.setDiaChi(rs.getString(7));
                nv.setIdTrangthai(rs.getString(8));
                nv.setChucVu(rs.getString(9));
                nv.setGioiTinh(rs.getString(10));
                nv.setTk(rs.getString(11));
                nv.setMk(rs.getString(12));

                nvvms.add(nv);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return nvvms;
    }

    public Boolean them(NhanVien nv) {
        String sql = "insert into NHANVIEN(IdNhanVien,MaNV,TenNV,NgaySinh,Email,SDT,DiaChi,IdTrangThai,ChucVu,GioiTinh,TK,MK) \n" +
"values (?,?,?,?,?,\n" +
"?,?,?,?,?,?,?)";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getIdNv());
            ps.setObject(2, nv.getMaNV());
            ps.setObject(3, nv.getTenNV());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getSdt());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getIdTrangthai());
            ps.setObject(9, nv.getChucVu());
            ps.setObject(10, nv.getGioiTinh());
            ps.setObject(11, nv.getTk());
            ps.setObject(12, nv.getMk());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public Boolean xoa(String idNV) {
        String sql = "delete NhanVien where idNhanVien = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, idNV);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public Boolean sua(String idNV, NhanVien nv) {
        String sql = "update NHANVIEN set IdNhanVien=?,MaNV=?,TenNV=?,NgaySinh=?,Email=?,SDT=?,\n" +
"DiaChi=?,IdTrangThai=?,ChucVu=?,GioiTinh=?,TK=?,MK=? where IdNhanVien=?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, nv.getIdNv());
            ps.setObject(2, nv.getMaNV());
            ps.setObject(3, nv.getTenNV());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getSdt());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getIdTrangthai());
            ps.setObject(9, nv.getChucVu());
            ps.setObject(10,nv.getGioiTinh());
            ps.setObject(11,nv.getTk());
            ps.setObject(12,nv.getMk());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public ArrayList<NhanVienViewModel> timkiem(String idNV) {
        ArrayList<NhanVienViewModel> getList = new ArrayList<>();
        String sql = "select NHANVIEN.IdNhanVien,MaNV,TenNV,NgaySinh,Email,SDT,DiaChi,IdTrangThai,ChucVu,GioiTinh,TK,MK  from NHANVIEN where NHANVIEN.IdNhanVien like '%\"+IdNhanVien+\"%'";
        try (Connection con = connection.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel();             
                nv.setIdNv(rs.getString(1));
                nv.setTenNV(rs.getString(2));
//                nv.setTenTrangThai(rs.getString(3));
//                nv.setNhanHieu(rs.getString(4));
//                nv.setGiaNhap(rs.getString(5));
//                nv.setGiaBan(rs.getString(6));
//                nv.setNgaySanXuat(rs.getString(7));                
//                getList.add(nv);
            }
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return getList;
    }

    public static void main(String[] args) {
        ArrayList<NhanVienViewModel> lst = new NhanVienRepository().getList();
        System.out.println(lst.toString());
    }
}
