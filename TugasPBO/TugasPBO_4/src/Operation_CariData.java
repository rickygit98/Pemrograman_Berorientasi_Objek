
import java.io.File;
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
public class Operation_CariData {
        public static void CariData() throws IOException{

        // membaca database ada atau tidak

        try {
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan keyword untuk mencari kontak: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        UtilityClass.cekDataDiDatabase(keywords,true);

    }
}
