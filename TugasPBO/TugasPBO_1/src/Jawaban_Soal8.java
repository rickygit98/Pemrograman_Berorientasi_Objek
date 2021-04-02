
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
//8. Soal: Penghitungan Pembayaran Listrik
public class Jawaban_Soal8 {
    public static void main(String[] args){
        System.out.println("8. Soal: Penghitungan Pembayaran Listrik");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        

        System.out.print("Masukkan golongan (1 atau 2): ");
        int golongan = inputNilai.nextInt();       
        
        System.out.print("Masukkan banyak pemakaian (kwh): ");
        int kwh = inputNilai.nextInt();
        
        int tarif;
        
        if (golongan == 1){
            System.out.println("Pelanggan golongan "+golongan);
            System.out.println("Besar pemakaian: "+kwh+" kwh");
            
            if (kwh>=100 && kwh<1000){
                tarif = kwh * 1000;
                System.out.println("total bayar : "+tarif);
            }
            else if(kwh<100){
                System.out.println("total bayar : 100000 (minimum pembayaran 100kwh)");
            }
            else if(kwh>=1000){
                tarif = kwh * 1000;
                int totalTarif = tarif + (10*tarif/100);
                System.out.println("total bayar : "+totalTarif); 
            }
            
        }
        else if (golongan == 2){
            System.out.println("Pelanggan golongan "+golongan);
            System.out.println("Besar pemakaian: "+kwh+" kwh");
            
            if (kwh>=100 && kwh<1000){
                tarif = kwh * 2000;
                System.out.println("total bayar : "+tarif);
            }
            else if(kwh<100){
                System.out.println("total bayar : 100000 (minimum pembayaran 100kwh)");
            }
            else if(kwh>=1000){
                tarif = kwh * 2000;
                int totalTarif = tarif + (10*tarif/100);
                System.out.println("total bayar : "+totalTarif); 
            }
        }
        else{
            System.out.println("Data Pelanggan tidak ditemukan, cek kembali data golongan anda!");
        }
    }
}
