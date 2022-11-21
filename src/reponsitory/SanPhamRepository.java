package reponsitory;

import donaimModel.SanPham;
import Helper.DBContext;
import ViewModel.SanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SanPhamRepository {

    private DBContext connection;

    public ArrayList<SanPhamViewModel> getList() {
        ArrayList<SanPhamViewModel> lstSanPhamViewModel = new ArrayList<>();
        String sql = "select SANPHAM.IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong from SANPHAM";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sp = new SanPhamViewModel();
                sp.setIdSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setNgayNhap(rs.getString(3));
                sp.setTrangThai(rs.getInt(4));
                sp.setNhanHieu(rs.getString(5));
                sp.setMauSac(rs.getString(6));
                sp.setKichCo(rs.getString(7));
                sp.setGiaBan(rs.getInt(8));
                sp.setNgaySanXuat(rs.getString(9));
                sp.setSoLuong(rs.getInt(10));
                lstSanPhamViewModel.add(sp);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return lstSanPhamViewModel;
    }

    public Boolean them(SanPham sp) {
        String sql = "insert into SANPHAM(IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong) values(?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sp.getIdSP());
            ps.setObject(2, sp.getTenSP());
            ps.setObject(3, sp.getNgayNhap());
            ps.setObject(4, sp.getTrangThai());
            ps.setObject(5, sp.getNhanHieu());
            ps.setObject(6, sp.getMauSac());
            ps.setObject(7, sp.getKichCo());
            ps.setObject(8, sp.getGiaBan());
            ps.setObject(9, sp.getNgaySanXuat());
            ps.setObject(10, sp.getSoLuong());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public ArrayList<String> loadCb() {
        ArrayList<String> listload = new ArrayList<>();
        String query = "select DISTINCT SAMPHAM.MauSac from SANPHAM";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s = rs.getString(1);
                listload.add(s);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listload;
    }

    public Boolean xoa(String idSP) {
        String sql = "delete SanPham where idSP = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, idSP);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public Boolean sua(String idSP, SanPham sp) {
        String sql = "update SanPham set tenSP = ?,MauSac = ?,KichCo = ?, SoLuong = ?,ngayNhap =?,Idtt = ?,IdNhanHieu = ?,giaBan = ?,ngaySanXuat= ? where idSP = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, sp.getTenSP());
            ps.setObject(2, sp.getNgayNhap());
            ps.setObject(3, sp.getMauSac());
            ps.setObject(4, sp.getKichCo());
            ps.setObject(5, sp.getSoLuong());
            ps.setObject(6, sp.getTrangThai());
            ps.setObject(7, sp.getNhanHieu());
            ps.setObject(8, sp.getGiaBan());
            ps.setObject(9, sp.getNgaySanXuat());
            ps.setObject(10, idSP);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public ArrayList<SanPhamViewModel> timkiem(String tenSP) {
        ArrayList<SanPhamViewModel> getList = new ArrayList<>();
        String sql = "select SanPham.tenSP,ngayNhap,TenTrangThai,idNhanHieu,giaNhap,giaBan,ngaySanXuat from SanPham where SANPHAM.IdSp like '%" + tenSP + "%'";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sp = new SanPhamViewModel();
                sp.setTenSP(rs.getString(1));
                sp.setNgayNhap(rs.getString(2));
//                sp.setTenTrangThai(rs.getString(3));
//                sp.setNhanHieu(rs.getString(4));
//                sp.setGiaNhap(rs.getString(5));
//                sp.setGiaBan(rs.getString(6));
//                sp.setNgaySanXuat(rs.getString(7));                
//                getList.add(sp);
            }
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return getList;
    }

    public static void main(String[] args) {
        ArrayList<SamPhamViewModel> lst = new SanPhamRepository().getList();
        System.out.println(lst.toString());
    }
}
