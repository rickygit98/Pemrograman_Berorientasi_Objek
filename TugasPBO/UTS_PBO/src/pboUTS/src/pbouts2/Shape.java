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
public abstract class Shape {
    double luas;
    double keliling;
    double lebar;
    double panjang;
    String nama;

    public Shape() {
    }

    public Shape(double luas, double keliling, double lebar, double panjang, String nama) {
        this.luas = luas;
        this.keliling = keliling;
        this.lebar = lebar;
        this.panjang = panjang;
        this.nama = nama;
    }

    public Shape(String nama) {
        this.nama = nama;               
    }   
    
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getLebar() {
        return lebar;
    }

    public double getLuas() {
        return luas;
    }

    public String getNama() {
        return nama;
    }

    public double getPanjang() {
        return panjang;
    }    
}
