/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbouts2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Widianto
 */
public class utama {
    public static void main(String[] args) {
        ArrayList<Square> S = new ArrayList<Square>();
        ArrayList<Triangle> T = new ArrayList<Triangle>();
        Scanner myInput = new Scanner(System.in);
        
        S.add(new Square("S1", 10, 20));
        System.err.println(S.get(0).lebar);
        
        int pil1=0;
        int pil2=0;
        
        while (pil1!=5) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. View");
            System.out.println("5. Exit");
            System.out.print("Pilihan :");
            pil1 = myInput.nextInt();

            if (pil1 == 1)
            {
                pil2 = 0;
                while (pil2 != 3) {
                    System.out.println("1. Square");
                    System.out.println("2. Triangle");
                    System.out.println("3. Exit");
                    System.out.print("Pilihan :");
                    pil2 = myInput.nextInt();
                }
            }
        }

    }
}
