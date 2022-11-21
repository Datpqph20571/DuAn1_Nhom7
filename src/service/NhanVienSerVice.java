/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import ViewModel.NhanVienViewModel;
import donaimModel.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Khanh
 */
public interface NhanVienSerVice {
    public ArrayList<NhanVienViewModel> getList();

    public Boolean them(NhanVien nv);

    public Boolean sua(String idNV, NhanVien nv);

    public Boolean xoa(String idNV);

    public ArrayList<NhanVienViewModel> timkiem(String idNV);
}
