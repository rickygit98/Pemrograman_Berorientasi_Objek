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
public class BangunPersegi extends Bangun2Dimensi {

    public BangunPersegi(String nama, double sisi) {
        super(nama, sisi, sisi);
    }

    public BangunPersegi(String nama) {
        super(nama);
    }
 
    public BangunPersegi(double sisi) {
        super(sisi, sisi);
    }

    public BangunPersegi() {
        super(null);
    }
    
    
    // Tinggi = Sisi pada Bangun Datar, dan disebut SISI

    @Override
    public void setLuas(double luas) {
        luas = sisi * sisi;
        super.setLuas(luas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKeliling(double keliling) {
        keliling = 2 * sisi;
        super.setKeliling(keliling); //To change body of generated methods, choose Tools | Templates.
    }
}
