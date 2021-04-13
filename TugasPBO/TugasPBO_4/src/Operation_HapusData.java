
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
public class Operation_HapusData {
    public static void HapusData() throws  IOException{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Data");
        Operation_TampilkanData.TampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan Nomor Data yang ingin dihapus:  ");
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
                System.out.println("Nama\t\t: "+st.nextToken());
                System.out.println("Alamat\t\t: "+st.nextToken());
                System.out.println("Nomor Telepon\t: "+st.nextToken());
                System.out.println("Alamat Email\t: "+st.nextToken());

                isDelete = UtilityClass.getYesorNo("Apakah anda yakin ingin menghapus data tersebut");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Data tidak ditemukan");
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
}
