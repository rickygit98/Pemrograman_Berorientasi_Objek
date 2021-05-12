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
public abstract class Bangun2Dimensi {

    String nama;
    double tinggi;
    double sisi;
    double luas;
    double keliling;
    
    public Bangun2Dimensi(String nama) {
        this.nama = nama;
    }
    
    public Bangun2Dimensi(double tinggi, double sisi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    
    public Bangun2Dimensi(String nama, double tinggi, double sisi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.nama = nama;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public String getNama() {
        return nama;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }    
}
