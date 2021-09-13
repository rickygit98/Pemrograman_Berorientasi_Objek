
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
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
public class Koneksi {

    public static void main(String[] args) {
        Koneksi connect = new Koneksi();
        connect.koneksi();
    }
    
    //variable con untuk membuat koneksi , nanti nilainya diisi di method koneksi yang dipanggil dibawah
    Connection con = null;
    
    String statusKoneksi;
    public void koneksi() {
        try {
            //ConnectionURL berisi alamat dan nama database anda
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            //Username dan Password sesuaikan dengan database anda , default "root" dan ""
            String username = "root";
            String password = "";

            //ini jangan diganti, sesuai nama librarynya
            Class.forName("com.mysql.jdbc.Driver");

            //untuk membuat koneksinya dan mengambil nilai parameter dari data diatas
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);

            //mengeluarkan mesaggedialog saat sukses
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            
            statusKoneksi = "Berhasil Konek ke database";
        } catch (Exception e) {
            //mengeluarkan messagedialog saat gagal dan keluar dari program (exit)
            //JOptionPane.showMessageDialog(null, e);
            
            //System.exit(0);
            statusKoneksi = "Gagal Konek ke database";
        }
    }
}
