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


/**
 *
 * @author DELL
 */
public class SanPhamRepository {
    private Connection DbcCon;
    public ArrayList<SanPhamViewModel> getList(){
    ArrayList<SanPhamViewModel> listSP = new ArrayList<>();
    String sql = "Select * from SANPHAM";
        try ( java.sql.Connection con = DBContext.getConnection();
                 PreparedStatement pr = con.prepareStatement(sql)){
            ResultSet rs = pr.getResultSet();
            while (rs.next()) {                
                String idSP = rs.getString(1);
                String tenSP = rs.getString(2);
                String NgayNhap = rs.getString(3);
                String Idtt = rs.getString(4);
                String IdNhanHieu = rs.getString(5);
                String MauSac = rs.getString(6);
                String KichCo = rs.getString(7);
                String GiaBan = rs.getString(8);
                String NgaySX = rs.getString(9);
                String SoLuong = rs.getString(10);
            }
        } catch (Exception e) {
        }
    }

}
