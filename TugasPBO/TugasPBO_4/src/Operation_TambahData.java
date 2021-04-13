
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
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
public class Operation_TambahData {
        public static void TambahData() throws IOException{


        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);


        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String nama, telp, alamat, email;

        System.out.print("masukan nama          : ");
        nama = terminalInput.nextLine();
        System.out.print("masukan alamat        : ");
        alamat = terminalInput.nextLine();
        System.out.print("masukan nomor telepon : ");
        telp = terminalInput.nextLine();
        System.out.print("masukan alamat email  : ");
        email = terminalInput.nextLine();

        // cek kontak di database

        String[] keywords = {nama+","+alamat+","+telp+","+email};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = UtilityClass.cekDataDiDatabase(keywords,false);

        // menulis kontak di databse
        if (!isExist){
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Nama           : " + nama);
            System.out.println("Alamat         : " + alamat);
            System.out.println("Nomor Telepon  : " + telp);
            System.out.println("Alamat Email   : " + email);

            boolean isTambah = UtilityClass.getYesorNo("Apakah akan ingin menambah data tersebut");

            if(isTambah){
                bufferOutput.write(nama+","+alamat+","+telp+","+email);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("Kontak  yang anda akan masukan sudah tersedia di database dengan data berikut:");
            UtilityClass.cekDataDiDatabase(keywords,true);
        }


        bufferOutput.close();
    }
}
