/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbouts2;

/**
 *
 * @author Widianto
 */
public class Square extends Shape {

    @Override
    public void setKeliling(double keliling) {
        keliling = 2*panjang + 2*lebar;
        super.setKeliling(keliling); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLuas(double luas) {
        luas =  panjang * lebar;
        super.setLuas(luas); //To change body of generated methods, choose Tools | Templates.
    }

    public Square() {
    }
    
    public Square(String nama) {
        super(nama);
    }
    public Square(String nama, double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.nama = nama;
    }
}
