/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//4.Program hitung nilai rata-rata nilai berdasarkan prosentase
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class JawabanSoal4_ver1 {
    public static void main( String[] args ) throws IOException{
        System.out.println("4.Program Program hitung nilai rata-rata nilai berdasarkan prosentase");
        System.out.println("Versi I : Buffered Reader");
        System.out.println(" ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan Nilai 1: ");
        float nilaiUjian1 = Float.parseFloat(br.readLine());
        System.out.println("Besar Prosentase Ujian 1 (dalam %): ");
        float p1 = Float.parseFloat(br.readLine());
        
        System.out.println("Masukkan Nilai 2: ");
        float nilaiUjian2 = Float.parseFloat(br.readLine());
        System.out.println("Besar Prosentase Ujian 2 (dalam %): ");
        float p2 = Float.parseFloat(br.readLine());
      
        System.out.println("Masukkan Nilai 3: ");
        float nilaiUjian3 = Float.parseFloat(br.readLine());
        System.out.println("Besar Prosentase Ujian 3 (dalam %): ");
        float p3 = Float.parseFloat(br.readLine());
        
        float p_total = p1+p2+p3;
        
        while (p_total > 100 || p_total < 100){
            System.out.println("Prosentase yang anda masukkan tidak sama dengan 100% , input lagi! ");
            System.out.println("Masukkan lagi Prosentase Ujian 1 (dalam %): ");
            p1 = Float.parseFloat(br.readLine());
            System.out.println("Masukkan lagi Prosentase Ujian 2 (dalam %): ");
            p2 = Float.parseFloat(br.readLine());
            System.out.println("Masukkan lagi Prosentase Ujian 3 (dalam %): ");
            p3 = Float.parseFloat(br.readLine());
            p_total = p1+p2+p3;
        }
        
        float nilai1 = nilaiUjian1*p1/100;
        float nilai2 = nilaiUjian2*p2/100;
        float nilai3 = nilaiUjian3*p3/100;
        
        float rataNilai = (nilai1+nilai2+nilai3);
        
        if (rataNilai >= 60){
            System.out.println("Rata - Rata Nilai = "+rataNilai+ "  :-)");
        }
        else{
            System.out.println("Rata - Rata Nilai = "+rataNilai+ "  :-(");
        }
        
    }
}
