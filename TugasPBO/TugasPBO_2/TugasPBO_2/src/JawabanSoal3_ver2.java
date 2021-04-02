
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
public class JawabanSoal3_ver2 {
    public static void main( String[] args ){
        System.out.println("3.Program Pengecek Angka");
        System.out.println("Versi II : do while loop");
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
        
        do{
            int j=1;
            int count = 0;
            
            do{
                if(awal%j == 0){
                    count++;
                }
                j++;
            }while(j<=awal);
            
            if(count==2){
               System.out.println(awal+ " (prima)");
            }
            else if (count != 2){
                if (awal%2 == 0){
                    System.out.println(awal+" (genap)");
                }
                else{
                    System.out.println(awal+" (ganjil)");
                }
            }
            awal++;
            count = 0;
        }while(awal<=akhir);
    }
}
