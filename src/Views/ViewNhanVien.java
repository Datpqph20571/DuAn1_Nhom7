/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;


import Views.NewSignin;
import donaimModel.HoaDon;
import donaimModel.KhachHang;
import donaimModel.NhanVien;
import donaimModel.SanPham;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.ImplHoaDonSer;
import service.InterHoaDonSer;

/**
 *
 * @author natsu
 */
public class ViewNhanVien extends javax.swing.JFrame {
    private DefaultTableModel mol;
    private ArrayList<HoaDon> lstHd = new ArrayList<>();
    private InterHoaDonSer hdSer = new ImplHoaDonSer();
    private ArrayList<SanPham> lstSp = new ArrayList<>();
    private ArrayList<KhachHang> lstkh = new ArrayList<>();
    private ArrayList<NhanVien> lstnv = new ArrayList<>();
    /**
     * Creates new form ViewNhanVien
     */
    public ViewNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        loadForm();
        cboidkh.removeAllItems();
        cboidnv.removeAllItems();
        cboidsp.removeAllItems();
        lstSp = hdSer.getidsp();
        for (SanPham x : lstSp) {
            cboidsp.addItem(x.getIdSP());
        }
        lstkh = hdSer.getidkh();
        for (KhachHang x : lstkh) {
            cboidkh.addItem(x.getIdkh());
        }
        lstnv = hdSer.getidnv();
        for (NhanVien x : lstnv) {
            cboidnv.addItem(x.getIdNv());
        }
    }
    public void loadForm(){
        mol = (DefaultTableModel) tblhoadon.getModel();
        mol.setRowCount(0);
        lstHd = hdSer.getList();
        for (HoaDon x : lstHd) {
            mol.addRow(new Object[]{
                x.getIdhd(),x.getIdsp(),x.getTensp(),x.getIdnv(),x.getIdkh(),x.getNgaytao(),x.getDiachi(),x.getThanhtoan()
            });
        }
        setLocationRelativeTo(null);
    }
    public HoaDon getData(){
        String idhd,idsp,tensp,idnv,idkh,ngaytao,diachi,thanhtoan;
        idhd = txtidhd.getText().trim();
        idsp = (String) cboidsp.getSelectedItem();
        tensp = txttensp.getText().trim();
        idnv = (String) cboidnv.getSelectedItem();
        idkh = (String) cboidkh.getSelectedItem();
        ngaytao = txtngaytao.getText().trim();
        diachi = txtdiachi.getText().trim();
        thanhtoan = txtthanhtoan.getText().trim();
        HoaDon hd = new HoaDon(idhd, idsp, idnv, idkh, tensp, diachi, ngaytao, thanhtoan);
        return hd;
    }
    public void New(){
        txtdiachi.setText("");
        txtidhd.setText("");
        txtngaytao.setText("");
        txttensp.setText("");
        txtthanhtoan.setText("");
    }
    public void timKiem(){
        mol = (DefaultTableModel) tblhoadon.getModel();
        mol.setRowCount(0);
        String id = txttk.getText().trim();
        lstHd = hdSer.search(id);
        for (HoaDon x : lstHd) {
            mol.addRow(new Object[]{
                x.getIdhd(),x.getIdsp(),x.getTensp(),x.getIdnv(),x.getIdkh(),x.getNgaytao(),x.getDiachi(),x.getThanhtoan()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bttHoaDon = new javax.swing.JButton();
        bttLichSu = new javax.swing.JButton();
        bttSP = new javax.swing.JButton();
        bttDangXuat = new javax.swing.JButton();
        bttTaiKhaon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlSanPham = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlHoaDon = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnlammoi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnxoa = new javax.swing.JButton();
        cboidsp = new javax.swing.JComboBox<>();
        btnsua = new javax.swing.JButton();
        cboidnv = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboidkh = new javax.swing.JComboBox<>();
        txtidhd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtngaytao = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        btntk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtthanhtoan = new javax.swing.JTextField();
        txttk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhoadon = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        pnlLichSu = new javax.swing.JPanel();
        pnlTaiKhaon = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttHoaDon.setText("Hoa don");
        bttHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(bttHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

        bttLichSu.setText("Lich su");
        bttLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLichSuActionPerformed(evt);
            }
        });
        jPanel1.add(bttLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        bttSP.setText("San pham");
        bttSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSPActionPerformed(evt);
            }
        });
        jPanel1.add(bttSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        bttDangXuat.setText("Dang xuat");
        bttDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(bttDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 90, -1));

        bttTaiKhaon.setText("Tai khoan");
        bttTaiKhaon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTaiKhaonActionPerformed(evt);
            }
        });
        jPanel1.add(bttTaiKhaon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        pnlSanPham.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Nhan Vien");

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(255, 255, 255))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(523, Short.MAX_VALUE))
        );

        jPanel2.add(pnlSanPham, "card2");

        pnlHoaDon.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID SP");

        btnthem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thanh Toán");

        btnlammoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlammoi.setText("LÀM MỚI");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Địa Chỉ");

        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnxoa.setText("XÓA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        cboidsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnsua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsua.setText("SỬA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        cboidnv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tên SP");

        cboidkh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Hóa đơn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID Hóa Đơn");

        btntk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btntk.setText("Tìm kiếm");
        btntk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID Nhân Viên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày Tạo");

        tblhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Hóa Đơn", "ID SP", "Tên Sp", "ID Nhân Viên", "ID KH", "Ngày Tạo", "Địa chỉ", "Thanh Toán"
            }
        ));
        tblhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhoadon);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("ID Khách Hàng");

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(btnthem)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtthanhtoan)
                                        .addComponent(cboidnv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                            .addComponent(btnsua)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                            .addComponent(btnxoa)))
                                    .addComponent(txtidhd, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttensp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txttk))
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(72, 72, 72)
                                            .addComponent(cboidsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel8)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cboidkh, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btntk)
                                    .addComponent(btnlammoi)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9))
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel2)))
                .addGap(44, 44, 44)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(cboidsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(cboidnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboidkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnlammoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntk)
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addComponent(txttk)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlHoaDon, "card3");

        pnlLichSu.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlLichSuLayout = new javax.swing.GroupLayout(pnlLichSu);
        pnlLichSu.setLayout(pnlLichSuLayout);
        pnlLichSuLayout.setHorizontalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        pnlLichSuLayout.setVerticalGroup(
            pnlLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jPanel2.add(pnlLichSu, "card4");

        javax.swing.GroupLayout pnlTaiKhaonLayout = new javax.swing.GroupLayout(pnlTaiKhaon);
        pnlTaiKhaon.setLayout(pnlTaiKhaonLayout);
        pnlTaiKhaonLayout.setHorizontalGroup(
            pnlTaiKhaonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        pnlTaiKhaonLayout.setVerticalGroup(
            pnlTaiKhaonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jPanel2.add(pnlTaiKhaon, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLichSuActionPerformed
        // TODO add your handling code here:
        pnlSanPham.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlLichSu.setVisible(true);
        pnlTaiKhaon.setVisible(false);
    }//GEN-LAST:event_bttLichSuActionPerformed

    private void bttSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSPActionPerformed
        // TODO add your handling code here:
        pnlSanPham.setVisible(true);
        pnlHoaDon.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhaon.setVisible(false);
    }//GEN-LAST:event_bttSPActionPerformed

    private void bttHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttHoaDonActionPerformed
        // TODO add your handling code here:
        pnlSanPham.setVisible(false);
        pnlHoaDon.setVisible(true);
        pnlLichSu.setVisible(false);
        pnlTaiKhaon.setVisible(false);
    }//GEN-LAST:event_bttHoaDonActionPerformed

    private void bttTaiKhaonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTaiKhaonActionPerformed
        // TODO add your handling code here:
        pnlSanPham.setVisible(false);
        pnlHoaDon.setVisible(false);
        pnlLichSu.setVisible(false);
        pnlTaiKhaon.setVisible(true);
    }//GEN-LAST:event_bttTaiKhaonActionPerformed

    private void bttDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDangXuatActionPerformed
this.dispose();
        new NewSignin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bttDangXuatActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        if (txtdiachi.getText().equals("") || txtngaytao.getText().equals("") || txtidhd.getText().equals("")|| txtthanhtoan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập đầy đủ thông tin");
        }else{
            HoaDon hd = getData();
            hdSer.Add(hd);
            loadForm();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            New();
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        New();
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = tblhoadon.getSelectedRowCount();
        if (row == 0) {
            JOptionPane.showMessageDialog(this,"Bạn chưa chọn hóa đơn");
        }
        else{
            int confim = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không ?", "confirm", JOptionPane.YES_NO_OPTION);
            if (confim == JOptionPane.YES_OPTION) {
                String idhd = txtidhd.getText();
                hdSer.delete(idhd);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                loadForm();
                New();
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int row = tblhoadon.getSelectedRowCount();
        if (row == 0) {
            JOptionPane.showMessageDialog(this,"Bạn chưa chọn hóa đơn");
        }else{
            int confim = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa không ?", "confirm", JOptionPane.YES_NO_OPTION);
            if (confim == JOptionPane.YES_OPTION) {
                HoaDon hd = getData();
                hdSer.update(hd);
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadForm();
                New();
            }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btntkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkActionPerformed
        timKiem();
    }//GEN-LAST:event_btntkActionPerformed

    private void tblhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhoadonMouseClicked
        int row = tblhoadon.getSelectedRow();
        txtidhd.setText(tblhoadon.getValueAt(row, 0).toString());
        txtdiachi.setText(tblhoadon.getValueAt(row, 6).toString());
        txtngaytao.setText(tblhoadon.getValueAt(row, 5).toString());
        txttensp.setText(tblhoadon.getValueAt(row, 2).toString());
        txtthanhtoan.setText(tblhoadon.getValueAt(row, 7).toString());
        cboidsp.setSelectedItem(tblhoadon.getValueAt(row, 1));
        cboidkh.setSelectedItem(tblhoadon.getValueAt(row, 4));
        cboidnv.setSelectedItem(tblhoadon.getValueAt(row, 3));
    }//GEN-LAST:event_tblhoadonMouseClicked

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
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntk;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton bttDangXuat;
    private javax.swing.JButton bttHoaDon;
    private javax.swing.JButton bttLichSu;
    private javax.swing.JButton bttSP;
    private javax.swing.JButton bttTaiKhaon;
    private javax.swing.JComboBox<String> cboidkh;
    private javax.swing.JComboBox<String> cboidnv;
    private javax.swing.JComboBox<String> cboidsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlLichSu;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlTaiKhaon;
    private javax.swing.JTable tblhoadon;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtidhd;
    private javax.swing.JTextField txtngaytao;
    private javax.swing.JTextField txttensp;
    private javax.swing.JTextField txtthanhtoan;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables
}
