
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
public class class_selesai {
     public void class_selesai(int id){
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
            
            String sql = "delete from service_mobil where id= '"+ id +"'";

            statement.executeUpdate(sql);
            statement.close();
            // Setelah berhasil simpan tampilkan message dialog "berhasil disimpan"
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
