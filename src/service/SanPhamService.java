
package service;

import donaimModel.SanPham;
import ViewModel.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface SanPhamService {

    public ArrayList<SanPhamViewModel> getList();

    public Boolean them(SanPham sp);

    public Boolean sua(String idSP, SanPham sp);

    public Boolean xoa(String idSP);

    public ArrayList<SanPhamViewModel> timkiem(String tenSP);

}
