
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
public class Latihan_While {
    public static void main( String[] args ){
        //int i = 4;
        
        //while (i>=0){
        //    System.out.println(i);
        //    i--;
        //}
        
        Scanner inputNilai = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = inputNilai.nextInt();
        
        while (n>0){
            if (n%2 == 0){
                System.out.println(n + " Genap");
            }
            else {
                System.out.println(n + " Gasal");
            }
            n--;
        }
        
    }
}
