/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.IMPL;

import ViewModel.SanPhamViewModel;
import donaimModel.SanPham;
import java.util.ArrayList;
import reponsitory.SanPhamRepository;
import service.SanPhamService;

/**
 *
 * @author DELL
 */
public class SanPhamServiceImpl implements SanPhamService{
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();
    @Override
    public ArrayList<SanPhamViewModel> getList() {
        return sanPhamRepository.getList();
    }

    @Override
    public Boolean them(SanPham nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean sua(String idNV, SanPham nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean xoa(String idSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SanPhamViewModel> timkiem(String idSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
