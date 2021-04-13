
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UtilityClass {
        protected static boolean cekDataDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
            System.out.println("Daftar Alamat");
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

                    System.out.println("Nama\t\t : "+stringToken.nextToken());
                    System.out.println("Alamat\t\t : "+stringToken.nextToken());
                    System.out.println("Nomor Telepon\t : "+stringToken.nextToken());
                    System.out.println("Alamat Email\t : "+stringToken.nextToken());

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

        protected static boolean getYesorNo(String message){
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
        
        public static void clearScreen(){
            try {
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033\143");
                }
            } catch (Exception ex){
                System.err.println("tidak bisa clear screen");
            }
        }
        
        public static int  cekBatas() throws IOException{

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
