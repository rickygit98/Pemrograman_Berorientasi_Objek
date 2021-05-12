/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbouts;

/**
 *
 * @author Widianto
 */
public class BangunLingkaran extends Bangun2Dimensi {

    // Tinggi digunakan sebagai DIAMETER
    
    public BangunLingkaran() {
        super(null);
    }

    public BangunLingkaran(String nama) {
        super(nama);
    }

    public BangunLingkaran(String nama, double tinggi, double sisi) {
        super(nama, tinggi, tinggi);
    }

    public BangunLingkaran(double tinggi, double sisi) {
        super(tinggi, tinggi);
    }

    @Override
    public void setLuas(double luas) {
        luas = 3.14 * tinggi/2 * tinggi/2;
        super.setLuas(luas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKeliling(double keliling) {
        keliling = 3.14 * tinggi;
        super.setKeliling(keliling); //To change body of generated methods, choose Tools | Templates.
    }
}
