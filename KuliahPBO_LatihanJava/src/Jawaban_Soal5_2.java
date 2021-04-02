/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import javax.swing.JOptionPane;

public class Jawaban_Soal5_2 {
    public static void main( String[] args ){
        String word1 = "";
        word1 = JOptionPane.showInputDialog("Enter Word1 :");
        
        String word2 = "";
        word2 = JOptionPane.showInputDialog("Enter Word2 :");
        
        String word3 = "";
        word3 = JOptionPane.showInputDialog("Enter Word3 :");
        
        String msg = word1 + " " + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
