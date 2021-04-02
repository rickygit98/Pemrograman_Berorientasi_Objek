/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal_2;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author User
 */
//2.  Cetak buku alamat + Tambah kontak

public class JawabanSoal_2 {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh Kontak");
            System.out.println("2.\tTambah data Kontak");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH KONTAK");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("TAMBAH KONTAK");
                    System.out.println("=========");
                     int baris;
                    baris = cekBatas();
                    
                    if (baris<100){
                        tambahKontak();
                        tampilkanData();
                        break;
                    }else{
                        System.out.println("Maaf Data maksimal adalah 100, silakan coba hapus data");
                        break;
                    }
                    
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }

    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahKontak();
            return;
        }


        System.out.println("Daftar Kontak");
        System.out.println("-------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {

             nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.println(nomorData+".Nama\t : "+stringToken.nextToken());
            System.out.println("  Tel. # : "+stringToken.nextToken());
            System.out.println("  Address: "+stringToken.nextToken());
            System.out.println();
            
            data = bufferInput.readLine();
        }

        System.out.println("-------------");
    }
    
    private static void tambahKontak() throws IOException{


        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);


        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String nama, telp, alamat;

        System.out.print("masukan nama kontak   : ");
        nama = terminalInput.nextLine();
        System.out.print("masukan nomor telepon : ");
        telp = terminalInput.nextLine();
        System.out.print("masukan alamat        : ");
        alamat = terminalInput.nextLine();


        // cek Kontak di database

        String[] keywords = {nama+","+telp+","+alamat};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = false;

        // menulis Kontak di databse
        if (!isExist){
            
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Name    : " + nama);
            System.out.println("Tel.#   : " + telp);
            System.out.println("Address  : " + alamat);

            boolean isTambah = getYesorNo("Apakah akan ingin menambah data tersebut? ");

            if(isTambah){
                bufferOutput.write(nama+","+telp+","+alamat);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        }
        bufferOutput.close();
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }
    
    private  static int  cekBatas() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput = null;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
        }


        String data = bufferInput.readLine();
        int jumlahBaris = 0;
        while(data != null) {
            jumlahBaris++;
            data = bufferInput.readLine();
        }
        return jumlahBaris;

    }

}
