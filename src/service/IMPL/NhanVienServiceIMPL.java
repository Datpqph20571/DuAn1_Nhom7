/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.IMPL;

import ViewModel.NhanVienViewModel;
import donaimModel.NhanVien;
import java.util.ArrayList;
import reponsitory.NhanVienRepository;
import service.NhanVienSerVice;

/**
 *
 * @author Khanh
 */
public class NhanVienServiceIMPL implements NhanVienSerVice{
     private NhanVienRepository nvr = new NhanVienRepository();
    @Override
    public ArrayList<NhanVienViewModel> getList() {
       return nvr.getList();
    }

    @Override
    public Boolean them(NhanVien nv) {
        return nvr.them(nv);
    }

    @Override
    public Boolean sua(String idNV, NhanVien nv) {
       return nvr.sua(idNV, nv);
    }

    @Override
    public Boolean xoa(String idNV) {
        return nvr.xoa(idNV);
    }

    @Override
    public ArrayList<NhanVienViewModel> timkiem(String idNV) {
        return timkiem(idNV);
    }
    
}
