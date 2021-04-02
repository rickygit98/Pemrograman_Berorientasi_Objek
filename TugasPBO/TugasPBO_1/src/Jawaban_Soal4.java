
import static java.awt.SystemColor.text;
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
//4. Soal: Menghitung selisih waktu dalam jam dan menit
public class Jawaban_Soal4 {
    public static void main(String[] args){
        
        System.out.println("4. Soal: Menghitung selisih waktu dalam jam dan menit");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        System.out.print("Masukkan waktu-1 : ");
        String waktu1 = inputNilai.nextLine();
        
        System.out.print("Masukkan waktu-2 : ");
        String waktu2 = inputNilai.nextLine();
        
        String[] pisahWaktu1 = waktu1.split("\\:");
        String[] pisahWaktu2 = waktu2.split("\\:");
        
        String jam1 = pisahWaktu1[0];
        String menit1 = pisahWaktu1[1];
        
        String jam2 = pisahWaktu2[0];
        String menit2 = pisahWaktu2[1]; 
        
        int selisihMenit = Math.abs(Integer.parseInt(menit1)-Integer.parseInt(menit2));
        
        if(Integer.parseInt(jam2)<Integer.parseInt(jam1)){
            int totalMenit1 = (Integer.parseInt(jam1)*60)+Integer.parseInt(menit1);
            int totalMenit2 = ((Integer.parseInt(jam2)+12)*60)+Integer.parseInt(menit2);
            int selisihMenitTotal = Math.abs(totalMenit2 - totalMenit1);

            if (selisihMenitTotal <= 60){
                System.out.println("Selisih Waktu: "+selisihMenitTotal+" Menit");
            }
            else{
                int selisihTotal = selisihMenitTotal/60;
                System.out.println("Selisih Waktu: "+selisihTotal+" Jam "+selisihMenit+" menit ");
            }

        }
        else{
            int totalMenit1 = (Integer.parseInt(jam1)*60)+Integer.parseInt(menit1);
            int totalMenit2 = (Integer.parseInt(jam2)*60)+Integer.parseInt(menit2);
            int selisihMenitTotal = Math.abs(totalMenit2 - totalMenit1);

            if (selisihMenitTotal <= 60){
                System.out.println("Selisih Waktu: "+selisihMenitTotal+" Menit");
            }
            else{
                int selisihTotal = selisihMenitTotal/60;
                System.out.println("Selisih Waktu: "+selisihTotal+" Jam "+selisihMenit+" menit ");
            }
        
        }
    }
}
