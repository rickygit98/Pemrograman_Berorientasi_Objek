
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class class_simpan{

    public void class_simpan(int id, String nama, String nik, int totalBayar, String status){
        try {
            // Buat object dari class Koneksi
            Koneksi connect = new Koneksi();
            // panggil koneksinya tiap kali di buat
            connect.koneksi();
            
            //buat object statement , sudah ada librarynya tinggal import
            Statement statement = connect.con.createStatement();

            // data akan diambil lewat nama textField.getText
            // insert into "namaTable" bukan nama database
            //berikut query sql untuk insert data (bisa copy juga langsung dari database phpmyadmin)
            
            String sql = "insert into service_mobil values('" + id + "','" + nama + "','" + nik + "','" + totalBayar + "','" + status + "');";

            statement.executeUpdate(sql);
            statement.close();
            // Setelah berhasil class_simpan tampilkan message dialog "berhasil disimpan"
            
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
