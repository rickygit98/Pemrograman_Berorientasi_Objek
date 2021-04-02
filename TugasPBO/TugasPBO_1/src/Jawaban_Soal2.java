/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//2.Soal: Biaya Parkir
import java.util.*;

public class Jawaban_Soal2 {
              
    public static void main( String[] args ){
        
        System.out.println("2. Soal: Biaya Parkir");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        int jam1;
        int jam2;
        
        System.out.print("Masukkan jam masuk :");
        jam1 = inputNilai.nextInt();
        
        while (jam1 > 24){
            System.out.println("Masukkan jam maksimum 24 !");
            System.out.print("Masukkan jam masuk :");
            jam1 = inputNilai.nextInt();
        }
        
        System.out.print("Masukkan jam keluar :");
        jam2 = inputNilai.nextInt();
        
        
        if (jam2 < jam1){
            jam2 += 12;
        }
        
        int jamTotal = jam2 - jam1;
        
        int bayar = 0;
        
        if (jamTotal <= 2){
            bayar = jamTotal * 2000;
        }
        else if(jamTotal > 2){
            bayar = (2*2000)+((jamTotal-2)*500); 
        }
        
        System.out.println("Jam Masuk: " + jam1);
        System.out.println("Jam Keluar: " + jam2);
        System.out.println("Lama: " + jamTotal + " Jam -- Biaya: " + bayar);
        
        
    }
}
