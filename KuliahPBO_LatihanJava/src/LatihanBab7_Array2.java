
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LatihanBab7_Array2 {
    public static void main( String[] args ) throws IOException{
        Scanner inputNilai = new Scanner(System.in);
        //System.out.println("Masukkan banyak input yang anda inginkan:");
        //int inputAnda  = inputNilai.nextInt();
               
        //minta input
        int nilai[] = new int[10];
           
        for (int i=0;i<nilai.length;i++){
            System.out.print("Masukkan Nilai ke- "+(i+1) + ":");
            nilai [i]= inputNilai.nextInt();
        }
        
        //cek nilai tertinggi
        int max = 0;
        
        for (int j=0;j<nilai.length;j++){
            if (max <= nilai[j]){
                max = nilai[j];
            }
            else {
                max = max;
            }    
        }
        
        System.out.println("");
        //tampilkan output
        for (int k = 0 ; k<nilai.length;k++){
            System.out.println("Nilai ke - "+ (k+1) +" adalah : "+nilai[k]);
        }
        System.out.println("Nilai tertinggi dari list tersebut adalah : " + max);
                
        
    }
}
