
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
public class class_update {
    public void class_update(int nrp,String nama, String alamat, String jenis){
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
            
            String sql_nama = "update identitas set nama = '"+nama+"' where nrp = '"+ nrp +"'";
            String sql_alamat = "update identitas set alamat = '"+alamat+"' where nrp = '"+ nrp +"'";
            String sql_jenis = "update identitas set jenis_kelamin = '"+jenis+"' where nrp = '"+ nrp +"'";
            
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();
            // Setelah berhasil simpan tampilkan message dialog "berhasil disimpan"
            
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
