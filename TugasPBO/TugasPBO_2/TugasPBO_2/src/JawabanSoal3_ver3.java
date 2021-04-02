
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
//3.Program Pengecek Angka
public class JawabanSoal3_ver3 {
    public static void main( String[] args ){
        System.out.println("3.Program Pengecek Angka");
        System.out.println("Versi III : for loop");
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
        
        int i;
        int j;
        int counter=0;
        
        for (i=awal;i<=akhir;i++){
            for (j=1;j<=i;j++){
                if(i%j == 0){
                    counter++;
                }
                
            }
            if(counter==2){
                System.out.println(i + " (prima)");
            }
            else if (counter != 2){
                if (i%2 ==0){
                    System.out.println(i + " (genap)");
                }
                else {
                    System.out.println(i + " (ganjil)");
                }
            }
            counter = 0;
        }
    }
}
