
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//6. Soal: Minibus pariwisata

public class Jawaban_Soal6 {
    public static void main(String[] args){
        
        System.out.println("6. Soal: Minibus pariwisata");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa yang ikut pariwisata : ");
        int jumlahPeserta = inputNilai.nextInt();
        int jumlahMiniBus = 0;
        
        if (jumlahPeserta%7 == 0){
            jumlahMiniBus = jumlahPeserta / 7;            
        }
        else if (jumlahPeserta < 7){
            jumlahMiniBus = 1;
        }
        else if (jumlahPeserta > 7 && jumlahPeserta%7 != 0){
            jumlahMiniBus = jumlahPeserta/7 + 1;
        }
        
        System.out.println("Jumlah Peserta: "+jumlahPeserta);
        System.out.println("Jumlah Minibus yang dibutuhkan : "+jumlahMiniBus+" MiniBus");
    }
    
}
