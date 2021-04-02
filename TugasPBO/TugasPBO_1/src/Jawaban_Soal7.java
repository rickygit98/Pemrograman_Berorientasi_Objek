
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
//7.Soal: Menentukan N hari yang lalu tanpa menginputkan Hari Ini
public class Jawaban_Soal7 {
    public static void main(String[] args){
        System.out.println("7.Soal: Menentukan N hari yang lalu tanpa menginputkan Hari Ini");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.print("Masukkan n hari yang lalu : ");
        int n = inputNilai.nextInt();
        
        String hariIni = "Senin";
        
        int sisaHasil;
        
        if (n>7){
            sisaHasil = n%7;
            if (sisaHasil == 1){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Minggu");
            }
            else if (sisaHasil == 2){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Sabtu");
            }
            else if (sisaHasil == 3){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Jumat");
            }
            else if (sisaHasil == 4){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Kamis");
            }
            else if (sisaHasil == 5){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Rabu");
            }
            else if (sisaHasil == 6){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Selasa");
            }
            else if (sisaHasil == 7){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Senin");
            }
        }
        
        else{
            sisaHasil = n;
            if (sisaHasil == 1){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Minggu");
            }
            else if (sisaHasil == 2){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Sabtu");
            }
            else if (sisaHasil == 3){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Jumat");
            }
            else if (sisaHasil == 4){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Kamis");
            }
            else if (sisaHasil == 5){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Rabu");
            }
            else if (sisaHasil == 6){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Selasa");
            }
            else if (sisaHasil == 7){
                System.out.println("Hari ini hari "+hariIni+" , "+n+" Hari yang lalu adalah hari Senin");
            }
        }    
       
    }
}
