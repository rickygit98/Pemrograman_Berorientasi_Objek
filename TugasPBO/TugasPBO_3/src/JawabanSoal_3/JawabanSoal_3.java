/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal_3;
import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author User
 */

//3.  Cetak buku alamat + Tambah kontak + Cari Kontak
public class JawabanSoal_3 {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh Kontak");
            System.out.println("2.\tTambah kontak baru");
            System.out.println("3.\tCari kontak");
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
                case "3":
                    System.out.println("\n=========");
                    System.out.println("CARI KONTAK");
                    System.out.println("=========");
                    cariKontak();
                    break;
                    
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");
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
            
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("-------------");
    }
    
    private static void cariKontak() throws IOException{

        // membaca database ada atau tidak

        try {
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahKontak();
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari Kontak: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        cekKontakDiDatabase(keywords,true);

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

        boolean isExist = cekKontakDiDatabase(keywords,false);

        // menulis Kontak di databse
        if (!isExist){
//            fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Nama    : " + nama);
            System.out.println("Tel.#   : " + telp);
            System.out.println("Address  : " + alamat);

            boolean isTambah = getYesorNo("Apakah akan ingin menambah data tersebut? ");

            if(isTambah){
                bufferOutput.write(nama+","+telp+","+alamat);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("Kontak yang anda akan masukan sudah tersedia di database dengan data berikut:");
            cekKontakDiDatabase(keywords,true);
        }


        bufferOutput.close();
    }

    private static boolean cekKontakDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
            System.out.println("Daftar Kontak");
            System.out.println("-------------");
        }

        while(data != null){

            // cek keywords didalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.contains(keyword);
            }

            // jika keywordsnya cocok maka tampilkan

            if(isExist){
                if(isDisplay) {
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    System.out.println("Nama\t : "+stringToken.nextToken());
                    System.out.println("Tel. #\t : "+stringToken.nextToken());
                    System.out.println("Address\t : "+stringToken.nextToken());

                    System.out.print("\n");
                } else {
                    break;
                }
            }
            
            data = bufferInput.readLine();
        }
        if (isDisplay){
            System.out.println("-------------");
        }

        return isExist;
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
    
    private static int  cekBatas() throws IOException{

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
