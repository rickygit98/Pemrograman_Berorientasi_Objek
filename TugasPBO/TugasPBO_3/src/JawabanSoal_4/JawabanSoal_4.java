/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal_4;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author User
 */
//4.  Cetak buku alamat + Tambah kontak + Cari Kontak + Ubah Kontak + Delete Kontak
// Program CRUD Sudah Finish + Main Menunya
// Nanti tinggal dirapikan sedikit di nomer 5

public class JawabanSoal_4 {
     public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh Kontak");
            System.out.println("2.\tTambah kontak baru");
            System.out.println("3.\tCari kontak");
            System.out.println("4.\tUbah kontak");
            System.out.println("5.\tHapus kontak");
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
                    
                case "4":
                    System.out.println("\n=========");
                    System.out.println("UBAH KONTAK");
                    System.out.println("=========");
                   ubahKontak();
                    break;   
                    
                 case "5":
                    System.out.println("\n=========");
                    System.out.println("HAPUS KONTAK");
                    System.out.println("=========");
                    hapusKontak();
                    break;   
                    
                 default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }
    
     private static void ubahKontak() throws IOException{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Kontak");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor kontak yang ingin diubah: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin diupdate

        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan entrycounts == updateNum
            if (updateNum == entryCounts){
                System.out.println("\nData yang ingin anda update adalah : ");
                System.out.println("-----------------------------------");
                System.out.println("Name     : "+st.nextToken());
                System.out.println("Tel. #   : "+st.nextToken());
                System.out.println("Address  : "+st.nextToken());

                // update data

                // mengambil input dari user

                String[] fieldData = {"nama","telp","alamat"};
                String[] tempData = new String[3];

                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();
                
                boolean isUpdate = getYesorNo("Apakah anda ingin merubah Data tersebut");
                if(isUpdate){
                    System.out.println("\nMasukan data kontak baru:");
                    System.out.println("----------------------------------------");
                    for(int i=0; i < fieldData.length ; i++) {
                        terminalInput = new Scanner(System.in);
                        System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                        tempData[i] = terminalInput.nextLine();
                    }
                }  
                else{
                    break;
                }
                // tampilkan data baru ke layar
                st = new StringTokenizer(data,",");
                System.out.println("\nData baru anda adalah ");
                System.out.println("---------------------------------------");
                System.out.println("Name   : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Tel. # : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Address: " + st.nextToken() + " --> " + tempData[2]);


                isUpdate = getYesorNo("Apakah anda yakin ingin mengupdate data tersebut ");

                if (isUpdate){

                    // cek data baru di database
                    boolean isExist = cekKontakDiDatabase(tempData,false);

                    if(isExist){
                        System.err.println("data kontak sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        // copy data
                        bufferedOutput.write(data);

                    } else {

                        // format data baru kedalam database
                        String nama = tempData[0];
                        String telp = tempData[1];
                        String alamat = tempData[2];

                        // tulis data ke database
                        bufferedOutput.write(nama + "," + telp + ","+ alamat );
                    }
                } else {
                    // copy data
                    bufferedOutput.write(data);
                }
            } else {
                // copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();

            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();
        
        //Tutup semua file
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();

        database.delete();
        // delete original database
        database.delete();
        // rename file tempDB menjadi database
        tempDB.renameTo(database);

    }
         
     private static void hapusKontak() throws  IOException{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Kontak");
        tampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan Nomor List yang ingin dihapus:  ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Name    : "+st.nextToken());
                System.out.println("Tel. #  : "+st.nextToken());
                System.out.println("Address : "+st.nextToken());

                isDelete = getYesorNo("Apakah anda yakin ingin menghapus ");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan data dari original ke sementara
                System.out.println("Kontak berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Kontak tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();
        
        //Tutup semua file
       bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();
        
        // delete original file
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);

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
            System.out.println("");
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
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan keyword untuk mencari kontak: ");
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

        // cek kontak di database

        String[] keywords = {nama+","+telp+","+alamat};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekKontakDiDatabase(keywords,false);

        // menulis kontak di databse
        if (!isExist){
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Name    : " + nama);
            System.out.println("Tel.#   : " + telp);
            System.out.println("Address  : " + alamat);

            boolean isTambah = getYesorNo("Apakah akan ingin menambah data tersebut  ");

            if(isTambah){
                bufferOutput.write(nama+","+telp+","+alamat);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("Kontak  yang anda akan masukan sudah tersedia di database dengan data berikut:");
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
