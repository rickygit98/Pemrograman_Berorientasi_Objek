
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
    public void class_update(int id,String status){
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
            String update_status = "";
            if (status.equals("D")){
                update_status = "S" ;
            }else {
                update_status = "D" ;
            }
            
            String sql = "update service_mobil set status = '"+ update_status +"' where id = '"+ id +"'";
            
            statement.executeUpdate(sql);
            statement.close();
            // Setelah berhasil simpan tampilkan message dialog "berhasil disimpan"
            
            JOptionPane.showMessageDialog(null, "Status berhasil diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
