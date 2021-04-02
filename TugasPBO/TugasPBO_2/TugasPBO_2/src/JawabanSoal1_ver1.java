
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
//1.Program yang mencetak nama Anda (input) sebanyak (inputan) yang Anda inginkan
public class JawabanSoal1_ver1 {
    public static void main( String[] args ){
        System.out.println("1.Program yang mencetak nama Anda (input) sebanyak (inputan) yang Anda inginkan");
        System.out.println("Versi I : while loop");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.println("Masukkan nama Anda :");
        String nama = inputNilai.nextLine();
        System.out.println();
        
        System.out.println("Masukkan nilai n :");
        int n = inputNilai.nextInt();
          
        while(n<=0){
            System.out.println("Masukkan angka lebih besar dari O !");
            System.out.println("Masukkan nilai n :");
            n = inputNilai.nextInt();

        }
        
        System.out.println();
        int i = 1;
        
        while (i<n+1){
            System.out.println(i+". Hai Namaku "+nama);
            i++;
        }
                
    }
}