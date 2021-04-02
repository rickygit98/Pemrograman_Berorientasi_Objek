
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
//2.Bilangan Prima dari Awal (input) hingga Akhir (input)
public class JawabanSoal2_ver1 {
    public static void main( String[] args ){
        System.out.println("2.Bilangan Prima dari Awal (input) hingga Akhir (input)");
        System.out.println("Versi I : while loop");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai Awal :");
        int awal = inputNilai.nextInt();
        System.out.println();
        
        while(awal<=0){
            System.out.println("Masukkan angka lebih besar dari O !");
            System.out.println("Masukkan Nilai Awal :");
            awal = inputNilai.nextInt();
            System.out.println();
        }
        
        System.out.println("Masukkan Nilai Akhir :");
        int akhir = inputNilai.nextInt();
        System.out.println();
        
        while(akhir <= awal){
            System.out.println("Masukkan angka lebih besar dari nilai awal!");
            System.out.println("Masukkan Nilai Akhir :");
            akhir = inputNilai.nextInt();
            System.out.println();    
        }
        
        System.out.println();
        
        // program utama
        while(awal<=akhir){
            int j=1;
            int count = 0;
            
            while(j<=awal){
                if(awal%j == 0){
                    count++;
                }
                j++;
            }
            if(count==2){
               System.out.println(awal);
            }
            awal++;
            count = 0;
        }
    }
}
