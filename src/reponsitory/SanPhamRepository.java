/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsitory;

import Helper.DBContext;
import ViewModel.SanPhamViewModel;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class SanPhamRepository {
 private DBContext connection;

    public ArrayList<SanPhamViewModel> getList() {
        ArrayList<SanPhamViewModel> lstSamPhamViewModel = new ArrayList<>();
        String sql = "select SANPHAM.IdSp,TenSp,MauSac,KichCo,SoLuong,NgayNhap,Idtt,IdNhanHieu,GiaBan,NgaySanXuat from SANPHAM";
        try (java.sql.Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sp = new SanPhamViewModel();
                sp.setIdSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setMauSac(rs.getString(3));
                sp.setKichCo(rs.getString(4));
                sp.setSoLuong(rs.getInt(5));
                sp.setNgayNhap(rs.getString(6));
                sp.setTrangThai(rs.getString(7));
                sp.setNhanHieu(rs.getString(8));
                sp.setGiaBan(rs.getInt(9));
                sp.setNgaySanXuat(rs.getString(10));

                lstSamPhamViewModel.add(sp);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return lstSamPhamViewModel;
    }
    public static void main(String[] args) {
        ArrayList<SanPhamViewModel> lst = new SanPhamRepository().getList();
        System.out.println(lst.toString());
    }
}
