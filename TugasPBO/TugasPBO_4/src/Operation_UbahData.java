
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
public class Operation_UbahData {
    public static void UbahData() throws IOException{
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
        Operation_TampilkanData.TampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor Data yang ingin diubah: ");
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
                System.out.println("Nama\t\t: "+st.nextToken());
                System.out.println("Alamat\t\t: "+st.nextToken());
                System.out.println("Nomor Telepon\t: "+st.nextToken());
                System.out.println("Alamat Email\t: "+st.nextToken());

                // update data

                // mengambil input dari user

                String[] fieldData = {"nama","alamat","telp","email"};
                String[] tempData = new String[4];

                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();
                
                boolean isUpdate = UtilityClass.getYesorNo("Apakah anda ingin merubah Data tersebut");
                if(isUpdate){
                    System.out.println("\nMasukan data  baru:");
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
                System.out.println("Nama\t\t: " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Alamat\t\t: " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Nomor Telepon\t: " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Alamat Email\t: " + st.nextToken() + " --> " + tempData[3]);


                isUpdate = UtilityClass.getYesorNo("Apakah anda yakin ingin mengupdate data tersebut ");

                if (isUpdate){

                    // cek data baru di database
                    boolean isExist = UtilityClass.cekDataDiDatabase(tempData,false);

                    if(isExist){
                        System.err.println("data sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        // copy data
                        bufferedOutput.write(data);

                    } else {

                        // format data baru kedalam database
                        String nama = tempData[0];
                        String alamat = tempData[1];
                        String  telp = tempData[2];
                        String email = tempData[3];

                        // tulis data ke database
                        bufferedOutput.write(nama + "," + alamat + ","+ telp  + ","+email);
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
        // delete original database
        database.delete();
        // rename file tempDB menjadi database
        tempDB.renameTo(database);

    }
}
