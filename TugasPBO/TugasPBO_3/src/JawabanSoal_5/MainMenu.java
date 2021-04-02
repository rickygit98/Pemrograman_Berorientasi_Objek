/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal_5;

/**
 *
 * @author User
 */

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser ="6";
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            utility.clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tCetak Data");
            System.out.println("2.\tIsi Data");
            System.out.println("3.\tPencarian Data");
            System.out.println("4.\tUbah Data");
            System.out.println("5.\tHapus Data");
            System.out.println("6.\tExit");
            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH KONTAK");
                    System.out.println("=================");
                    operation.tampilkanData();
                    break;
                    
                case "2":
                    System.out.println("\n=========");
                    System.out.println("TAMBAH KONTAK");
                    System.out.println("=========");
                    
                    int baris;
                    baris = utility.cekBatas();
                    
                    if (baris<100){
                        operation.tambahKontak();
                        operation.tampilkanData();
                        break;
                    }else{
                        System.out.println("Maaf Data maksimal adalah 100, silakan coba hapus data");
                        break;
                    }
                        
                case "3":
                    System.out.println("\n=========");
                    System.out.println("CARI KONTAK");
                    System.out.println("=========");
                    operation.cariKontak();
                    break;
                    
                case "4":
                    System.out.println("\n=========");
                    System.out.println("UBAH KONTAK");
                    System.out.println("=========");
                   operation.ubahKontak();
                    break;   
                    
                 case "5":
                    System.out.println("\n=========");
                    System.out.println("HAPUS KONTAK");
                    System.out.println("=========");
                    operation.hapusKontak();
                    break;   
                    
                   case "6":
                    System.out.println("\n=========");
                    System.out.println("Exit");
                    System.out.println("=========");
                    System.out.println("Anda Keluar Program");
                    break;   

                 default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-6]");
            }
                    if (!pilihanUser.equals("6")){
                          isLanjutkan = utility.getYesorNo("Apakah Anda ingin melanjutkan program ini");
                    }
                    else{
                        break;
                    }
                      
                    
        }
    }
    
   


}
