/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import ViewModel.SanPhamViewModel;
import donaimModel.SanPham;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface SanPhamService {
    public ArrayList<SanPhamViewModel> getList();

    public Boolean them(SanPham nv);

    public Boolean sua(String idNV, SanPham nv);

    public Boolean xoa(String idSP);

    public ArrayList<SanPhamViewModel> timkiem(String idSP);
}
