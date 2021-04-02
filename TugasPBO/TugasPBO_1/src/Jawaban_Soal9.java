/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//9. Soal: Deret Ganjil
public class Jawaban_Soal9 {
    public static void main(String[] args){
        System.out.println("9. Soal: Deret Ganjil");
        System.out.println(" ");
        
        int awal = 1;
        int akhir = 20;
        
        while(awal <= akhir){
            awal ++;
            if (awal % 2 == 1){
                System.out.print(awal + " ");
            }
            
        }
        
        System.out.println();
    }
}
