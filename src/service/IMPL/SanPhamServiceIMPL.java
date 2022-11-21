/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.IMPL;

import donaimModel.SanPham;
import reponsitory.SanPhamRepository;
import service.SanPhamService;
import ViewModel.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SanPhamServiceIMPL implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public ArrayList<SanPhamViewModel> getList() {
        return sanPhamRepository.getList();
    }

    @Override
    public Boolean them(SanPham sp) {
        return sanPhamRepository.them(sp);
    }

    @Override
    public Boolean sua(String idSP, SanPham sp) {
        return sanPhamRepository.sua(idSP, sp);
    }

    @Override
    public Boolean xoa(String idSP) {
        return sanPhamRepository.xoa(idSP);
    }

    @Override
    public ArrayList<SanPhamViewModel> timkiem(String tenSP) {
        return sanPhamRepository.timkiem(tenSP);
    }

   
}
