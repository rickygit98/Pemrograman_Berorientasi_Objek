
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
//10.Soal: Menampilkan bilangan kelipatan 3
public class Jawaban_Soal10 {
    public static void main(String[] args){
        System.out.println("10.Soal: Menampilkan bilangan kelipatan 3");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal: ");
        int awal = inputNilai.nextInt();
        System.out.print("Masukkan Batas Akhir: ");
        int akhir = inputNilai.nextInt();
        
        System.out.println();
        System.out.println("Bilangan kelipatan 3 diantara batas tersebut : ");
        do {
            awal++;
            
            if (awal % 3 == 0){            
                System.out.print(awal + " ");
            }
        }while (awal<akhir);
        
        System.out.println();
    
    }
}
