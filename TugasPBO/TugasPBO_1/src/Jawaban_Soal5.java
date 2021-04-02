
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
//5. Soal: Tunjangan Anak
public class Jawaban_Soal5 {
    public static void main(String[] args){
        
        System.out.println("5. Soal: Tunjangan Anak");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.print("Masukkan Gaji Pokok : ");
        int gajiPokok = inputNilai.nextInt();
        
        System.out.print("Masukkan Jumlah Anak : ");
        int jumlahAnak = inputNilai.nextInt();
        
        if( jumlahAnak>=1 && jumlahAnak<=3){
            int totalTunjangan = (10*gajiPokok/100)*jumlahAnak;
            System.out.println("Gaji Anda: "+ gajiPokok + " ,jumlah Anak: "+ jumlahAnak +" --- Total Tunjangan : "+totalTunjangan);
        }
        else if (jumlahAnak < 1){
            System.out.println("Total Tunjangan : 0, anda tidak mendapat tunjangan"); 
        }
        else {
            System.out.println("Total Tunjangan : 300000, batas maksimum tunjangan pemerintah 3 anak");
        }
        
        
    }
}
