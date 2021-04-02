/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Jawaban_Soal5_1 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        
        String word1 = "";
        System.out.print("Enter Word 1:");
        
        try{
            word1 = dataIn.readLine();
           }catch( IOException e ){
                System.out.println("Error!");
        }
        
        String word2 = "";
        System.out.print("Enter Word 2:");
        
        try{
            word2 = dataIn.readLine();
           }catch( IOException e ){
                System.out.println("Error!");
        }
        
        String word3 = "";
        System.out.print("Enter Word 3:");
        
        try{
            word3 = dataIn.readLine();
           }catch( IOException e ){
                System.out.println("Error!");
        }
        
        System.out.println("");
        System.out.println(word1+ " " + word2 + " " + word3);
        
    }
}
