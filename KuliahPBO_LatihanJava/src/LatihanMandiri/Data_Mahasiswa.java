/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Data_Mahasiswa implements ActionListener{
        public static void main(String[] args) {
        new Data_Mahasiswa();
    }
    public Data_Mahasiswa(){
        initComponent();
    }
    
    private void initComponent(){
         // ============================== Bagian Container
        String judul = "Aplikasi Data Mahasiswa";
        //inisiasi form baru
        JFrame form = new JFrame(judul);
        //Ukuran Form
        form.setSize(500,500);
        //Mengatur fungsi tombol exit
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Supaya form berada di tengah
        form.setLocationRelativeTo(null);
        //Mengatur layout secara manual
        form.setLayout(null);
    
        // ============================== Bagian Component
        JLabel label = new JLabel (judul);
        //Mengatur posisis dan ukuran component label
        //urutan (x,y,width,height)
        label.setBounds(180, 30, 150, 30);
        //Memasukan component ke form / container
        form.add(label);
        
        //Area nama
        JLabel labelNama= new JLabel("Nama");
        labelNama.setBounds(80,100, 100, 25);
        form.add(labelNama);
        
        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 100, 150, 25);
        form.add(txtNama);
        
        //Area Nrp
        JLabel labelNrp= new JLabel("NRP");
        labelNrp.setBounds(80, 150, 100, 25);
        form.add(labelNrp);
        
        JTextField txtNrp = new JTextField();
        txtNrp.setBounds(150, 150, 150, 25);
        form.add(txtNrp);
        
        //Area Gender
        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(80,200, 100,25);
        form.add(labelGender);
       
        JRadioButton radioPria = new JRadioButton();
        radioPria.setText("Pria");
        radioPria.setBounds(150, 200, 80, 25);
        
        JRadioButton radioWanita = new JRadioButton();
        radioWanita.setText("Wanita");
        radioWanita.setBounds(250,200, 80, 25);
        
        form.add(radioPria);
        form.add(radioWanita);
        
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(radioPria);
        groupGender.add(radioWanita);
        
        //Area Jurusan
        JLabel labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(80, 250, 200, 25);
        form.add(labelJurusan);
        String jurusan[] ={"Informatika","Akuntansi","Managemen","Bahasa"}; 

        JComboBox listJurusan = new JComboBox(jurusan);
        listJurusan.setBounds(150, 250, 150, 25);
        form.add(listJurusan);
        
        //Area Semester
        JLabel labelSemester = new JLabel("Semester");
        labelSemester.setBounds(80,300, 200, 25);
        form.add(labelSemester);
        
        String semester[] = new String[8];
        for (int i=0;i<semester.length;i++){
            semester[i] = Integer.toString(i+1);
        }
         
        JComboBox listSemester = new JComboBox(semester);
        listSemester.setBounds(150, 300, 50, 25);
        form.add(listSemester);
       
        //Area Button
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(150, 400, 100, 25);
        form.add(btnSimpan);
        
        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(260, 400, 100, 25);
        form.add(btnHapus);
        
        //Menampilkan form saat di run
        form.setVisible(true);
        
        // ================================================== Area Event
        btnSimpan.addActionListener(this);
        btnHapus.addActionListener(this);
        btnSimpan.setActionCommand("simpan");
        btnHapus.setActionCommand("hapus");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
                case "simpan":
                    JOptionPane.showMessageDialog(null, "Data Disimpan");
                    break;
                case "hapus":
                    JOptionPane.showMessageDialog(null, "Data Dihapus");
                    break;
                default:
                    System.out.println("Tidak ada");
                    break;
            }
        
    }
}
