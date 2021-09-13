
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ServiceGUI extends javax.swing.JFrame {

    /**
     * Creates new form ServiceGUI
     */
    int hargaServiceRingan = 250000;
    int hargaServiceSedang = 500000;
    int hargaServiceBerat = 750000;
    int hargaManual = 150000;
    int hargaMatic = 300000;
    int hargaMerkDaihatsu =50000;
    int hargaMerkIzusu=75000;
    int hargaMerkWuling=100000;
    int hargaMerkHonda=150000;
    int hargaMerkSuzuki=175000;
    
    public ServiceGUI() {
        initComponents();

        this.setTitle("Aplikasi Service Mobil");
        this.setLocationRelativeTo(null);
        Koneksi konek = new Koneksi();
        konek.koneksi();

        status_koneksi.setText(konek.statusKoneksi);
        
        DataTable();
    }
    
    Statement pst;
    ResultSet rs;

    public void DataTable() {
        Koneksi connect = new Koneksi();
        connect.koneksi();
        try {

            String sql = "select * from service_mobil";
            pst = connect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabel_data.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void selectByStatus(String status) {
        Koneksi connect = new Koneksi();
        connect.koneksi();
        try {
            String sql = "select * from service_mobil where status like '%" + status + "%'";
            pst = connect.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabel_data.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        status_koneksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        list_service = new javax.swing.JComboBox<>();
        list_jenismobil = new javax.swing.JComboBox<>();
        list_merkmobil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in_nama = new javax.swing.JTextField();
        in_nik = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_hargaService = new javax.swing.JLabel();
        lbl_hargaJenisMobil = new javax.swing.JLabel();
        lbl_hargaMerkMobil = new javax.swing.JLabel();
        lbl_totalBayar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_selesai = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        list_status = new javax.swing.JComboBox<>();
        btn_new = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel11.setText("Rp.");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("APLIKASI SERVICE MOBIL");

        jLabel2.setText("Status Koneksi :");

        jLabel3.setText("Jenis Service");

        jLabel4.setText("Jenis Mobil");

        jLabel5.setText("Merk Mobil");

        list_service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Jenis Service ---", "Service Ringan", "Service Sedang", "Service Berat" }));
        list_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_serviceActionPerformed(evt);
            }
        });

        list_jenismobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Jenis Mobil ---", "Manual", "Matic" }));
        list_jenismobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_jenismobilActionPerformed(evt);
            }
        });

        list_merkmobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Merk Mobil ---", "Daihatsu", "Izusu", "Wuling", "Honda", "Suzuki" }));
        list_merkmobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_merkmobilActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama");

        jLabel7.setText("NIK");

        in_nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_nikKeyTyped(evt);
            }
        });

        jLabel8.setText("Total Biaya Service :");

        lbl_hargaService.setText("0");

        lbl_hargaJenisMobil.setText("0");

        lbl_hargaMerkMobil.setText("0");

        lbl_totalBayar.setText("0");

        jLabel9.setText("Rp.");

        jLabel10.setText("Rp.");

        jLabel12.setText("Rp.");

        jLabel13.setText("Rp.");

        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "NIK", "Total Bayar", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_data);

        jLabel14.setText("ID Pesanan");

        lbl_id.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_selesai.setText("SELESAI");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        jLabel15.setText("Status Pesanan :");

        list_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Dikerjakan", "Selesai" }));
        list_status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_statusMouseClicked(evt);
            }
        });
        list_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_statusActionPerformed(evt);
            }
        });

        btn_new.setText("PESANAN BARU");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        jLabel16.setText("Tampilkan berdasarkan status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(status_koneksi))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(in_nik)
                                            .addComponent(list_service, 0, 167, Short.MAX_VALUE)
                                            .addComponent(list_jenismobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(list_merkmobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(in_nama, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(60, 60, 60)
                                        .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_hargaMerkMobil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_hargaJenisMobil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_hargaService, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(list_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(125, 125, 125))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(209, 209, 209)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_selesai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_new)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(in_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(in_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(list_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(lbl_hargaService))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(list_jenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lbl_hargaJenisMobil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(list_merkmobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(lbl_hargaMerkMobil)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_totalBayar)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_update)
                    .addComponent(btn_selesai)
                    .addComponent(jButton1)
                    .addComponent(btn_new))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(list_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(status_koneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_serviceActionPerformed
        String msg = (String) list_service.getSelectedItem();
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
 
        switch (msg) {
            case "Service Ringan":
                lbl_hargaService.setText(String.valueOf(hargaServiceRingan));
                break;
            case "Service Sedang":
                lbl_hargaService.setText(String.valueOf(hargaServiceSedang));
                break;
            case "Service Berat":
                lbl_hargaService.setText(String.valueOf(hargaServiceBerat));
                break;
            default:
                lbl_hargaService.setText("0");
                break;

        }
        
        int total = Integer.parseInt(lbl_hargaService.getText())+Integer.parseInt(lbl_hargaJenisMobil.getText())+Integer.parseInt(lbl_hargaMerkMobil.getText());
        lbl_totalBayar.setText(String.valueOf(total));
    }//GEN-LAST:event_list_serviceActionPerformed

    private void list_jenismobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_jenismobilActionPerformed
        String msg = (String) list_jenismobil.getSelectedItem();
 
        switch (msg) {
            case "Manual":
                lbl_hargaJenisMobil.setText(String.valueOf(hargaManual));
                break;
            case "Matic":
                lbl_hargaJenisMobil.setText(String.valueOf(hargaMatic));
                break;
            default:
                lbl_hargaJenisMobil.setText("0");
                break;

        }
        int total = Integer.parseInt(lbl_hargaService.getText())+Integer.parseInt(lbl_hargaJenisMobil.getText())+Integer.parseInt(lbl_hargaMerkMobil.getText());
        lbl_totalBayar.setText(String.valueOf(total));
    }//GEN-LAST:event_list_jenismobilActionPerformed

    private void list_merkmobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_merkmobilActionPerformed
        String msg = (String) list_merkmobil.getSelectedItem();
        NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
 
        switch (msg) {
            case "Daihatsu":
                lbl_hargaMerkMobil.setText(String.valueOf(hargaMerkDaihatsu));
                break;
            case "Izusu":
                lbl_hargaMerkMobil.setText(String.valueOf(hargaMerkIzusu));
                break;
            case "Wuling":
                lbl_hargaMerkMobil.setText(String.valueOf(hargaMerkWuling));
                break;
            case "Honda":
                lbl_hargaMerkMobil.setText(String.valueOf(hargaMerkHonda));
                break;
            case "Suzuki":
                lbl_hargaMerkMobil.setText(String.valueOf(hargaMerkSuzuki));
                break;
            default:
                lbl_hargaMerkMobil.setText("0");
                break;

        }
        int total = Integer.parseInt(lbl_hargaService.getText())+Integer.parseInt(lbl_hargaJenisMobil.getText())+Integer.parseInt(lbl_hargaMerkMobil.getText());
        lbl_totalBayar.setText(String.valueOf(total));
    }//GEN-LAST:event_list_merkmobilActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        int id = Integer.parseInt(lbl_id.getText());
        String nama = in_nama.getText();
        String nik = in_nik.getText();
        int totalBayar = Integer.parseInt(lbl_totalBayar.getText());
        String status = "D";
        //panggil method insertnya beserta masukkan parameter yang dibutuhkan
        class_simpan simpan = new class_simpan();
        simpan.class_simpan(id, nama, nik, totalBayar,status);
        DataTable();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void in_nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_nikKeyTyped
         if (in_nik.getText().length() >= 16) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_in_nikKeyTyped

    private void tabel_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dataMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tabel_data.getModel(); //create a model
        int selectedRowIndex = tabel_data.getSelectedRow(); //get selected row
        int id = (int) dtm.getValueAt(selectedRowIndex, 0); //get the primary key to fetch data.
        try {
            Koneksi connect = new Koneksi();
            connect.koneksi();

            String sql = "select * from service_mobil where id like '%" + id + "%'";
            pst = connect.con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {    //u can use normal query
                lbl_id.setText(rs.getString("id"));
                in_nama.setText(rs.getString("nama"));
                in_nik.setText(rs.getString("nik"));
                lbl_totalBayar.setText(rs.getString("total_bayar"));
                lbl_status.setText(rs.getString("status"));
            }
        } catch (Exception ex) {
            //Logger.getLogger(ExistingStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabel_dataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lbl_id.setText("");
        in_nama.setText("");
        in_nik.setText("");
        list_service.setSelectedIndex(0);
        list_jenismobil.setSelectedIndex(0);
        list_merkmobil.setSelectedIndex(0);
        lbl_hargaService.setText("0");
        lbl_hargaJenisMobil.setText("0");
        lbl_hargaMerkMobil.setText("0");
        lbl_totalBayar.setText("0");
        lbl_status.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        Koneksi connect = new Koneksi();
        connect.koneksi();

        class_selesai delete = new class_selesai();
        int input_id= Integer.parseInt(lbl_id.getText());
        delete.class_selesai(input_id);

        DataTable();
    }//GEN-LAST:event_btn_selesaiActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Koneksi connect = new Koneksi();
        connect.koneksi();

        class_update ubah = new class_update();
        int input_id = Integer.parseInt(lbl_id.getText());
        String status = lbl_status.getText();
        ubah.class_update(input_id, status);

        DataTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        Random randomNumbers = new Random();
        //int id = randomNumbers.nextInt();
        int number = Math.abs(randomNumbers.nextInt(999999999));
        lbl_id.setText(String.valueOf(number));
    }//GEN-LAST:event_btn_newActionPerformed

    private void list_statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_statusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_list_statusMouseClicked

    private void list_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_statusActionPerformed
        if (list_status.getSelectedItem() == "Dikerjakan") {
            selectByStatus("D");
        } else if (list_status.getSelectedItem() == "Selesai") {
            selectByStatus("S");
        } else {
            DataTable();
        }
        
    }//GEN-LAST:event_list_statusActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_nik;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl_hargaJenisMobil;
    private javax.swing.JLabel lbl_hargaMerkMobil;
    private javax.swing.JLabel lbl_hargaService;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_totalBayar;
    private javax.swing.JComboBox<String> list_jenismobil;
    private javax.swing.JComboBox<String> list_merkmobil;
    private javax.swing.JComboBox<String> list_service;
    private javax.swing.JComboBox<String> list_status;
    private javax.swing.JTextField status_koneksi;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables
}