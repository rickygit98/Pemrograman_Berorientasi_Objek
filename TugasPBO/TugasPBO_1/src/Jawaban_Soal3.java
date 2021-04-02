
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//3. Soal: Gaji karyawan mingguan
public class Jawaban_Soal3 {
    public static void main( String[] args ){
        
        System.out.println("3. Soal: Gaji karyawan mingguan");
        System.out.println(" ");
        
        Scanner inputNilai = new Scanner(System.in);
        
        float golongan = 0;
        float jamKerja = 0;
        float gaji = 0;
        
        System.out.print("Masukkan golongan :");
        golongan = inputNilai.nextFloat();
        
        System.out.print("Masukkan lama bekerja :");
        jamKerja = inputNilai.nextFloat();
        
        if (golongan == 1){
            if (jamKerja > 40){
                gaji = (40*3000)+((jamKerja-40)*(3*3000/2));
            }
            else{
                gaji = jamKerja * 3000;  
            }
        }
        else if (golongan == 2){
            if (jamKerja > 40){
                gaji = (40*3500)+((jamKerja-40)*(3*3500/2));
            }
            else{
                gaji = jamKerja * 3500;  
            }
        }
        else if (golongan == 3){
            if (jamKerja > 40){
                gaji = (40*4000)+((jamKerja-40)*(3*4000/2));
            }
            else{
                gaji = jamKerja * 4000;  
            }
        }
        else if (golongan == 4){
            if (jamKerja > 40){
                gaji = (40*5000)+((jamKerja-40)*(3*5000/2));
            }
            else{
                gaji = jamKerja * 5000;  
            }
            
        }
        System.out.println("Anda golongan: "+golongan);
        System.out.println("Jam Kerja anda 1 minggu: "+jamKerja+" Jam");
        System.out.println("Gaji Anda: "+ gaji);
    }
}
