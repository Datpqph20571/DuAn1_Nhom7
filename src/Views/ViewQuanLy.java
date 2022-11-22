/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;


import ViewModel.NhanVienViewModel;
import ViewModel.SanPhamViewModel;
import Views.NewSignin;
import donaimModel.NhanVien;
import donaimModel.SanPham;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import reponsitory.NhanVienRepository;
import reponsitory.SanPhamRepository;
import service.IMPL.NhanVienServiceIMPL;
import service.IMPL.SanPhamServiceImpl;
import service.NhanVienSerVice;
import service.SanPhamService;

/**
 *
 * @author natsu
 */
public class ViewQuanLy extends javax.swing.JFrame {
  private NhanVienSerVice nvs = new NhanVienServiceIMPL();
    private DefaultTableModel dtm = new DefaultTableModel();
    private NhanVienRepository nhanVienRepository = new NhanVienRepository();
    
    private SanPhamService sanPhamService = new SanPhamServiceImpl();
    private DefaultTableModel model;
    private DefaultComboBoxModel cbmodel;
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();
    private ArrayList<SanPhamViewModel> samPhamViewMod = sanPhamService.getList();
    
    public ViewQuanLy() {
        initComponents();
        setLocationRelativeTo(null);
        LoadDAta(nvs.getList());
    }

   private void LoadDAta(ArrayList<NhanVienViewModel> nvvms) {
        dtm = (DefaultTableModel) tblBang.getModel();
        dtm.setRowCount(0);
        dtm.setColumnIdentifiers(new String[]{"idNV", "maNV", "tenNV", "ngaySinh", "email", "sdt", "diaChi", "idTrangthai", "chucVu", "gioiTinh","tk","mk"});
        for (NhanVienViewModel nv : nvvms) {
            dtm.addRow(new Object[]{nv.getIdNv(),nv.getMaNV(), nv.getTenNV(),  nv.getNgaySinh(), nv.getEmail(),
                nv.getSdt(), nv.getDiaChi(), nv.getIdTrangthai(), nv.getChucVu(), nv.getGioiTinh(),nv.getTk(),nv.getMk()});
        }
    }

  
private void LoadForm(){
    txtIdnv.setText("");
    txtManv.setText("");
    txtTenNV.setText("");
    txtNgaysinh.setText("");
    txtEmail.setText("");
    txtSDT.setText("");
    txtDiachi.setText("");
    txtIdtt.setText("");
    txtChucvu.setText("");
    txtGioitinh.setText("");
    txtTk.setText("");
    txtMk.setText("");
}



    public boolean validatee() {
        if (txtIdnv.getText().isBlank() || txtManv.getText().isBlank() || txtTenNV.getText().isBlank() || txtNgaysinh.getText().isBlank()
                || txtEmail.getText().isBlank() || txtSDT.getText().isBlank() || txtDiachi.getText().isBlank() || txtIdtt.getText().isBlank()
                ||txtChucvu.getText().isBlank()||txtGioitinh.getText().isBlank()||txtTk.getText().isBlank()||txtMk.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");
            return false;
        }


        return true;

    }

    private void hienthi(int i) {
        txtIDSP.setText(TblTable.getValueAt(i, 0).toString());
        txtTenSP.setText(TblTable.getValueAt(i, 1).toString());
        txtMauSac.setText(TblTable.getValueAt(i, 2).toString());
        txtKichCo.setText(TblTable.getValueAt(i, 3).toString());
        txtSL.setText(TblTable.getValueAt(i, 4).toString());
        txtNgayNhap.setText(TblTable.getValueAt(i, 5).toString());
        txtTrangThai.setText(TblTable.getValueAt(i, 6).toString());
        txtIDNhanHieu.setText(TblTable.getValueAt(i, 7).toString());
        txtGiaBan.setText(TblTable.getValueAt(i, 8).toString());
        txtNgaySanXuat.setText(TblTable.getValueAt(i, 9).toString());
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bttSP = new javax.swing.JButton();
        bttNV = new javax.swing.JButton();
        bttHoaDon = new javax.swing.JButton();
        bttLichSu = new javax.swing.JButton();
        bttTaiKhoan = new javax.swing.JButton();
        bttDangXuat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlSP = new javax.swing.JPanel();
        pnlSP1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNgaySanXuat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDSP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtIDNhanHieu = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTable = new javax.swing.JTable();
        txtNgayNhap = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        txtMauSac = new javax.swing.JTextField();
        txtKichCo = new javax.swing.JTextField();
        pnlNV = new javax.swing.JPanel();
        pnlSanPham = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnThem1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        txtIdnv = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtIdtt = new javax.swing.JTextField();
        txtChucvu = new javax.swing.JTextField();
        txtGioitinh = new javax.swing.JTextField();
        txtTk = new javax.swing.JTextField();
        txtMk = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        btnLoadForm = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        pnlHoaDon = new javax.swing.JPanel();
        pnlLichSu = new javax.swing.JPanel();
        pnlTaiKhoan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttSP.setText("San pham");
        bttSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSPActionPerformed(evt);
            }
        });
        jPanel1.add(bttSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        bttNV.setText("Nhan vien");
        bttNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNVActionPerformed(evt);
            }
        });
        jPanel1.add(bttNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        bttHoaDon.setText("Hoa don");
        bttHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(bttHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        bttLichSu.setText("Lich su");
        bttLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLichSuActionPerformed(evt);
            }
        });
        jPanel1.add(bttLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, -1));

        bttTaiKhoan.setText("Tai khoan");
        bttTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTaiKhoanActionPerformed(evt);
            }
        });
        jPanel1.add(bttTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        bttDangXuat.setText("Dang xuat");
        bttDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(bttDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 90, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        pnlSP.setBackground(new java.awt.Color(204, 255, 255));

        pnlSP1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin:");

        txtNgaySanXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySanXuatActionPerformed(evt);
            }
        });

        jLabel5.setText(" Nhãn Hiệu:");

        jLabel6.setText("Trạng Thái:");

        txtIDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDSPActionPerformed(evt);
            }
        });

        jLabel7.setText("Giá Bán:");

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel8.setText("Ngày Sản Xuất:");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel3.setText("Id sản Phẩm:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SẢN PHẨM");

        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên Sản Phẩm:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtIDNhanHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNhanHieuActionPerformed(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        TblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblTable);

        txtNgayNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayNhapActionPerformed(evt);
            }
        });

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        txtTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrangThaiActionPerformed(evt);
            }
        });

        jLabel11.setText("Ngày Nhập:");

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        jLabel12.setText("Số Lượng");

        jLabel13.setText("Màu Sắc");

        jLabel14.setText("Kích Cỡ");

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });

        txtMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauSacActionPerformed(evt);
            }
        });

        txtKichCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKichCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSP1Layout = new javax.swing.GroupLayout(pnlSP1);
        pnlSP1.setLayout(pnlSP1Layout);
        pnlSP1Layout.setHorizontalGroup(
            pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSP1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(201, 201, 201)
                .addComponent(btnSua)
                .addGap(63, 63, 63))
            .addGroup(pnlSP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlSP1Layout.createSequentialGroup()
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnTim)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSP1Layout.createSequentialGroup()
                        .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSP1Layout.createSequentialGroup()
                                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlSP1Layout.createSequentialGroup()
                        .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSP1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSP1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSP1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSP1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDNhanHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSP1Layout.createSequentialGroup()
                    .addContainerGap(426, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNgaySanXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(txtGiaBan))
                    .addGap(33, 33, 33)))
        );
        pnlSP1Layout.setVerticalGroup(
            pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSP1Layout.createSequentialGroup()
                        .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel6)
                                .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTenSP)))
                    .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDNhanHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(34, 34, 34)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addGap(24, 24, 24)
                .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSP1Layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addGroup(pnlSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtNgaySanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(257, 257, 257)))
        );

        javax.swing.GroupLayout pnlSPLayout = new javax.swing.GroupLayout(pnlSP);
        pnlSP.setLayout(pnlSPLayout);
        pnlSPLayout.setHorizontalGroup(
            pnlSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSPLayout.createSequentialGroup()
                .addGap(0, 174, Short.MAX_VALUE)
                .addComponent(pnlSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSPLayout.setVerticalGroup(
            pnlSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlSP, "card2");

        pnlNV.setBackground(new java.awt.Color(204, 204, 255));

        pnlSanPham.setBackground(new java.awt.Color(204, 255, 255));

        jLabel9.setText("NhanVien");

        jLabel15.setText("MaNV");

        jLabel16.setText("TenNV");

        jLabel17.setText("Ngay Sinh");

        jLabel18.setText("Email");

        jLabel19.setText("SDT");

        jLabel20.setText("IDNV");

        jLabel21.setText("IDTrang Thai");

        jLabel22.setText("Dia Chi");

        jLabel23.setText("Gioi Tinh");

        jLabel24.setText("TK");

        jLabel25.setText("MK");

        jLabel26.setText("Chuc Vu");

        btnThem1.setText("Them");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnXoa1.setText("Xoa");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        btnSua1.setText("Sua");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblBang);

        btnTimkiem.setText("Tim kiem");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnLoadForm.setText("LoadForm");
        btnLoadForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFormActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("A - Z");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Z- A");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2))
        );

        jLabel1.setText("Ten NV");

        jLabel27.setText("Chuc Vu");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Nhan Vien");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Quan Li");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(jRadioButton4))
        );

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSanPhamLayout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdnv, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addComponent(btnThem1)
                        .addGap(68, 68, 68)
                        .addComponent(btnSua1))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addComponent(btnXoa1)
                                .addGap(68, 68, 68)
                                .addComponent(btnTimkiem))
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdtt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMk, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadForm)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdnv)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiachi))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManv)
                            .addComponent(txtIdtt)))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChucvu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaysinh)
                            .addComponent(txtGioitinh)))
                    .addGroup(pnlSanPhamLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)
                    .addComponent(txtTk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT)
                    .addComponent(txtMk))
                .addGap(18, 18, 18)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem1)
                    .addComponent(btnXoa1)
                    .addComponent(btnSua1)
                    .addComponent(btnTimkiem)
                    .addComponent(btnLoadForm))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout pnlNVLayout = new javax.swing.GroupLayout(pnlNV);
        pnlNV.setLayout(pnlNVLayout);
        pnlNVLayout.setHorizontalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNVLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnlNVLayout.setVerticalGroup(
            pnlNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNVLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel2.add(pnlNV, "card3");

        pnlHoaDon.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jPanel2.add(pnlHoaDon, "card4");

        pnlLichSu.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlLichSuLayout = new javax.swing.GroupLayout(pnlLichSu);
        pnlLichSu.setLayout(pnlLichSuLayout);
        pnlLichSuLayout.setHorizontalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        pnlLichSuLayout.setVerticalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jPanel2.add(pnlLichSu, "card5");

        pnlTaiKhoan.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlTaiKhoanLayout = new javax.swing.GroupLayout(pnlTaiKhoan);
        pnlTaiKhoan.setLayout(pnlTaiKhoanLayout);
        pnlTaiKhoanLayout.setHorizontalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        pnlTaiKhoanLayout.setVerticalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jPanel2.add(pnlTaiKhoan, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSPActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(true);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttSPActionPerformed

    private void bttNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNVActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(true);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttNVActionPerformed

    private void bttHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttHoaDonActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(true);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttHoaDonActionPerformed

    private void bttLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLichSuActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(true);
        pnlTaiKhoan.setVisible(false);
    }//GEN-LAST:event_bttLichSuActionPerformed

    private void bttTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTaiKhoanActionPerformed
        // TODO add your handling code here:
        pnlSP.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlNV.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhoan.setVisible(true);
    }//GEN-LAST:event_bttTaiKhoanActionPerformed

    private void bttDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDangXuatActionPerformed
this.dispose();
        new NewSignin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bttDangXuatActionPerformed

    private void txtNgaySanXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySanXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySanXuatActionPerformed

    private void txtIDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDSPActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        if (validatee()) {
//
//            SanPham sp = new SanPham();
//            int row = TblTable.getSelectedRow();
//            if (row == -1) {
//                JOptionPane.showMessageDialog(this, "Chọn dòng cần xoá!");
//                return;
//            }
//            String idSP = txtIDSP.getText();
//
//            int confim = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xoá không ?", "confim", JOptionPane.YES_NO_OPTION);
//            if (confim == JOptionPane.YES_OPTION) {
//                JOptionPane.showMessageDialog(this, sanPhamService.xoa(idSP));
//                LoadDAta(sanPhamService.getList());
//            }
//        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
//        if (validatee()) {
//            int row = TblTable.getSelectedRow();
//            if (row == -1) {
//                JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa");
//                return;
//            }
//            SanPham sp = new SanPham();
//            sp.setTenSP(txtTenSP.getText());
//            sp.setMauSac(cbMauSac.getSelectedItem().toString());
//            sp.setKichCo(cbKichCo.getSelectedItem().toString());
//            int sl = Integer.parseInt(txtSL.getText());
//            sp.setSoLuong(sl);
//            sp.setNgayNhap(txtNgayNhap.getText());
//            int tt = Integer.parseInt(txtTrangThai.getText());
//            sp.setTrangThai(tt);
//            sp.setNhanHieu(txtIDNhanHieu.getText());
//            int giaban = Integer.parseInt(txtGiaBan.getText());
//            sp.setGiaBan(giaban);
//            sp.setNgaySanXuat(txtNgaySanXuat.getText());
//            String idSP = txtIDSP.getText();
//
//            int confim = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn sửa không ?", "confim", JOptionPane.YES_NO_OPTION);
//            if (confim == JOptionPane.YES_OPTION) {
//                sanPhamService.sua(idSP, sp);
//                LoadDAta(sanPhamService.getList());
//                JOptionPane.showMessageDialog(this, "Sửa thành công!");
//
//            }
//        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        if (validatee()) {
//            SanPham sp = new SanPham();
//            sp.setTenSP(txtTenSP.getText());
//            sp.setMauSac(txtMauSac.getText());
//            sp.setKichCo(txtKichCo.getText());
//            int sl = Integer.parseInt(txtSL.getText());
//            sp.setSoLuong(sl);
//            sp.setNgayNhap(txtNgayNhap.getText());
//            sp.setTrangThai(txtTrangThai.getText());
//            sp.setNhanHieu(txtIDNhanHieu.getText());
//            int giaban = Integer.parseInt(txtGiaBan.getText());
//            sp.setGiaBan(giaban);
//            sp.setNgaySanXuat(txtNgaySanXuat.getText());
//            String idSP = txtIDSP.getText();
//
//            int confim = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm không ?", "confim", JOptionPane.YES_NO_OPTION);
//            if (confim == JOptionPane.YES_OPTION) {
//                JOptionPane.showMessageDialog(this, sanPhamService.them(sp));
//                LoadDAta(sanPhamService.getList());
//            }
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtIDNhanHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNhanHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNhanHieuActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
//        SamPhamViewModel sp = new SamPhamViewModel();
//        String idSP = txtIDSP.getText();
//
//        int confim = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn tìm không ? ", "confim", JOptionPane.YES_NO_OPTION);
//        if (confim == JOptionPane.YES_OPTION) {
//            sanPhamService.timkiem(idSP);
//            LoadDAta(sanPhamService.timkiem(idSP));
//            JOptionPane.showMessageDialog(this, "thanh cong");
//
//        }
        //        String idSp = txtTim.getText();
        //        ArrayList<SamPhamViewModel> lstSPVM = sanPhamService.timkiem(idSp);
        //        LoadDAta(lstSPVM);
    }//GEN-LAST:event_btnTimActionPerformed

    private void TblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblTableMouseClicked
        int i = TblTable.getSelectedRow();
        hienthi(i);
    }//GEN-LAST:event_TblTableMouseClicked

    private void txtNgayNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayNhapActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void txtTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrangThaiActionPerformed

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        String ten = txtTim.getText();
//        LoadDAta(sanPhamService.timkiem(ten));
    }//GEN-LAST:event_txtTimActionPerformed

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLActionPerformed

    private void txtMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauSacActionPerformed

    private void txtKichCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKichCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKichCoActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        if (validatee()) {

            NhanVien nv = new NhanVien();
            String idNV = txtIdnv.getText();
            String maNV = txtManv.getText();
            String tenNV = txtTenNV.getText();
            String ngaySinh = txtNgaysinh.getText();
            String email = txtEmail.getText();
            String sdt = txtSDT.getText();
            String diaChi = txtDiachi.getText();
            String idTrangthai = txtIdtt.getText();
            String chucVu = txtChucvu.getText();
            String gioiTinh = txtGioitinh.getText();
            String tk = txtTk.getText();
            String mk = txtMk.getText();

            nv.setIdNv(idNV);
            nv.setMaNV(maNV);
            nv.setTenNV(tenNV);
            nv.setNgaySinh(ngaySinh);
            nv.setEmail(email);
            nv.setSdt(sdt);
            nv.setDiaChi(diaChi);
            nv.setIdTrangthai(idTrangthai);
            nv.setChucVu(chucVu);
            nv.setGioiTinh(gioiTinh);
            nv.setTk(tk);
            nv.setMk(mk);

            int confirm = JOptionPane.showConfirmDialog(this, "ban co cac muon them?","confirm",JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                nvs.them(nv);
                JOptionPane.showMessageDialog(this, "them tc");
                LoadDAta(nvs.getList());

            }
        }
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        NhanVien nv = new NhanVien();
        int index = tblBang.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "chon dong ban muon xoa");
            return;
        }
        String id = txtIdnv.getText();

        nv.setIdNv(id);
        int confirm = JOptionPane.showConfirmDialog(this, "ban co chac muon xoa?", "confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            nvs.xoa(id);
            JOptionPane.showMessageDialog(this, "xoa tc");
            LoadDAta(nvs.getList());
        }
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
        NhanVien nv = new NhanVien();
        int index = tblBang.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "chon dong can sua");
            return;
        }
        String idNV = txtIdnv.getText();
        String maNV = txtManv.getText();
        String tenNV = txtTenNV.getText();
        String ngaySinh = txtNgaysinh.getText();
        String email = txtEmail.getText();
        String sdt = txtSDT.getText();
        String diaChi = txtDiachi.getText();
        String idTrangthai = txtIdtt.getText();
        String chucVu = txtChucvu.getText();
        String gioiTinh = txtGioitinh.getText();
        String tk = txtTk.getText();
        String mk = txtMk.getText();

        nv.setIdNv(idNV);
        nv.setMaNV(maNV);
        nv.setTenNV(tenNV);
        nv.setNgaySinh(ngaySinh);
        nv.setEmail(email);
        nv.setSdt(sdt);
        nv.setDiaChi(diaChi);
        nv.setIdTrangthai(idTrangthai);
        nv.setChucVu(chucVu);
        nv.setGioiTinh(gioiTinh);
        nv.setTk(tk);
        nv.setMk(mk);

        int confirm = JOptionPane.showConfirmDialog(this, "ban co chac muon sua k?", "confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            nvs.sua(idNV, nv);
            JOptionPane.showMessageDialog(this, "sua tc");
            LoadDAta(nvs.getList());
        }
    }//GEN-LAST:event_btnSua1ActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        int i = tblBang.getSelectedRow();
        txtIdnv.setText(tblBang.getValueAt(i, 0).toString());
        txtManv.setText(tblBang.getValueAt(i, 1).toString());
        txtTenNV.setText(tblBang.getValueAt(i, 2).toString());
        txtNgaysinh.setText(tblBang.getValueAt(i, 3).toString());
        txtEmail.setText(tblBang.getValueAt(i, 4).toString());
        txtSDT.setText(tblBang.getValueAt(i, 5).toString());
        txtDiachi.setText(tblBang.getValueAt(i, 6).toString());
        txtIdtt.setText(tblBang.getValueAt(i, 7).toString());
        txtChucvu.setText(tblBang.getValueAt(i, 8).toString());
        txtGioitinh.setText(tblBang.getValueAt(i, 9).toString());
        txtTk.setText(tblBang.getValueAt(i, 10).toString());
        txtMk.setText(tblBang.getValueAt(i, 11).toString());
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        NhanVienViewModel nvvm = new NhanVienViewModel();
        int index = tblBang.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "chon id can tim");
            return;
        }
        String id = txtIdnv.getText();

        int confirm = JOptionPane.showConfirmDialog(this, " ban co chac muon tim?","confirm",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            LoadDAta(nvs.timkiem(id));

        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnLoadFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFormActionPerformed
        // TODO add your handling code here:
        LoadForm();
    }//GEN-LAST:event_btnLoadFormActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        List<NhanVienViewModel> List = new ArrayList<>();
        List = nhanVienRepository.getLists();
        Collections.sort(List,(a,b)-> a.getTenNV().compareTo(b.getTenNV()));
        dtm.setRowCount(0);
        for(NhanVienViewModel nv : List){
            dtm.addRow(new Object[]{nv.getIdNv(),nv.getMaNV(), nv.getTenNV(),  nv.getNgaySinh(), nv.getEmail(),
                nv.getSdt(), nv.getDiaChi(), nv.getIdTrangthai(), nv.getChucVu(), nv.getGioiTinh(),nv.getTk(),nv.getMk()});
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       List<NhanVienViewModel> List = new ArrayList<>();
        List = nhanVienRepository.getLists();
        Collections.sort(List,(a,b)-> b.getTenNV().compareTo(a.getTenNV()));
        dtm.setRowCount(0);
        for(NhanVienViewModel nv : List){
            dtm.addRow(new Object[]{nv.getIdNv(),nv.getMaNV(), nv.getTenNV(),  nv.getNgaySinh(), nv.getEmail(),
                nv.getSdt(), nv.getDiaChi(), nv.getIdTrangthai(), nv.getChucVu(), nv.getGioiTinh(),nv.getTk(),nv.getMk()});
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        boLoc("Nhan");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        boLoc("Quan");
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    public void boLoc(String x){
        List<NhanVienViewModel> List = new ArrayList<>();
        List<NhanVienViewModel> List1 = new ArrayList<>();
        List = nhanVienRepository.getLists();
        for(NhanVienViewModel nv : List){
            if(nv.getChucVu().contains(x)){
                List1.add(nv);
            }
        }
        dtm.setRowCount(0);
        for(NhanVienViewModel nv : List1){
            dtm.addRow(new Object[]{nv.getIdNv(),nv.getMaNV(), nv.getTenNV(),  nv.getNgaySinh(), nv.getEmail(),
                nv.getSdt(), nv.getDiaChi(), nv.getIdTrangthai(), nv.getChucVu(), nv.getGioiTinh(),nv.getTk(),nv.getMk()});
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTable;
    private javax.swing.JButton btnLoadForm;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton bttDangXuat;
    private javax.swing.JButton bttHoaDon;
    private javax.swing.JButton bttLichSu;
    private javax.swing.JButton bttNV;
    private javax.swing.JButton bttSP;
    private javax.swing.JButton bttTaiKhoan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlLichSu;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSP;
    private javax.swing.JPanel pnlSP1;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtChucvu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtIDNhanHieu;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtIdnv;
    private javax.swing.JTextField txtIdtt;
    private javax.swing.JTextField txtKichCo;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMauSac;
    private javax.swing.JTextField txtMk;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNgaySanXuat;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtTk;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
