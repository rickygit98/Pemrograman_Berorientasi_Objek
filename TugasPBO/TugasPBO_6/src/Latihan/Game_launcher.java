/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Game_launcher {
    public static void main(String[] args) {
        //menjalankan method yang dibuat di TicTacToeGUI
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TicTacToeGUI();
            }
        });
        
        
    }
}
