import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

//1. Soal: Lama Bekerja
public class Jawaban_Soal1 {
    public static void main( String[] args ){
        
        System.out.println("1. Soal: Lama Bekerja");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        int jam1;
        int jam2;
        
        System.out.print("Masukkan jam masuk :");
        jam1 = inputNilai.nextInt();
        
        while (jam1 > 12){
            System.out.println("Masukkan jam lebih kecil atau sama dengan 12 !");
            System.out.print("Masukkan jam masuk :");
            jam1 = inputNilai.nextInt();
        }
        
        
        System.out.print("Masukkan jam keluar :");
        jam2 = inputNilai.nextInt();
        
        while (jam2 > 12 || jam2 < jam1){
            System.out.println("Masukkan jam lebih kecil atau sama dengan 12 dan lebih besar dari jam masuk !");
            System.out.print("Masukkan jam keluar :");
            jam2 = inputNilai.nextInt();
        }
        
        int jamkerja = jam2-jam1;
        
        System.out.println();
        System.out.println("Jam Masuk: "+ jam1);
        System.out.println("Jam Keluar: "+ jam2);
        System.out.println("Lama Bekerja " + jamkerja + " jam");
        
    }
}
