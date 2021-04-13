
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
public class Operation_TampilkanData {
     public static void TampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            Operation_TambahData.TambahData();
            return;
        }


        System.out.println("Daftar Alamat");
        System.out.println("-------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.println(nomorData+".Nama\t        : "+stringToken.nextToken());
            System.out.println("  Alamat        : "+stringToken.nextToken());
            System.out.println("  Nomor Telepon : "+stringToken.nextToken());
            System.out.println("  Alamat Email  : "+stringToken.nextToken());
            System.out.println("");
            data = bufferInput.readLine();
        }

        System.out.println("-------------");
    }
}
