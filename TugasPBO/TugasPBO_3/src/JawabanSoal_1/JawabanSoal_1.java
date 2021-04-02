/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 *
 * @author User
 */
//1. Cetak buku alamat
public class JawabanSoal_1 {
    public static void main(String[] args) throws IOException {

        tampilkanData();
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

    
    
}
