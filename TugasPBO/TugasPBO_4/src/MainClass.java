
import java.io.IOException;
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
public class MainClass {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser ="6";
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            UtilityClass.clearScreen();
            System.out.println("Database Buku Alamat\n");
            System.out.println("1.\tTampilkan Data");
            System.out.println("2.\tTambah Data");
            System.out.println("3.\tCari Data");
            System.out.println("4.\tUbah Data");
            System.out.println("5.\tHapus Data");
            System.out.println("6.\tExit");
            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH DATA");
                    System.out.println("=================");
                    Operation_TampilkanData.TampilkanData();
                    break;
                    
                case "2":
                    System.out.println("\n=========");
                    System.out.println("TAMBAH DATA");
                    System.out.println("=========");
                    
                    int baris;
                    baris = UtilityClass.cekBatas();
                    
                    if (baris<100){
                        Operation_TambahData.TambahData();
                        Operation_TampilkanData.TampilkanData();
                        break;
                    }else{
                        System.out.println("Maaf Data maksimal adalah 100, silakan coba hapus data");
                        break;
                    }
                        
                case "3":
                    System.out.println("\n=========");
                    System.out.println("CARI DATA");
                    System.out.println("=========");
                   Operation_CariData.CariData();
                    break;
                    
                case "4":
                    System.out.println("\n=========");
                    System.out.println("UBAH DATA");
                    System.out.println("=========");
                  Operation_UbahData.UbahData();
                    break;   
                    
                 case "5":
                    System.out.println("\n=========");
                    System.out.println("HAPUS DATA");
                    System.out.println("=========");
                    Operation_HapusData.HapusData();
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
                          isLanjutkan = UtilityClass.getYesorNo("Apakah Anda ingin melanjutkan program ini");
                    }
                    else{
                        break;
                    }
                      
                    
        }
    }
}
