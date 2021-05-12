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
public class Triangle extends Shape{
    double alas;
    double tinggi;
    
    public Triangle() {
    }
    
    public Triangle(String nama) {
        super(nama);
    }
    
    public Triangle(String nama, double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.nama = nama;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void setKeliling(double keliling) {
        double a = alas/2;
        double b = tinggi;
        double c = Math.sqrt(a*a + b*b);
        keliling = a*2 + c*2;
        super.setKeliling(keliling); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLuas(double luas) {
        luas = 0.5 * alas * tinggi;
        super.setLuas(luas); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
