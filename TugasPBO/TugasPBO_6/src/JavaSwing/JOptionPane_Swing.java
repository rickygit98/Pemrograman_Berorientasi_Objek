/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;
import javax.swing.*;
/**
 *
 * @author User
 */
public class JOptionPane_Swing {
    
    // JOptionPane adalah Turunan Jcomponent. Disediakan untuk mempermudah menampilkan popup kotak dialog.
    //Bisa untuk menampilkan instruksi tertentu atau meminta input dari user
    
    //Membuat variable / wadah untuk menampun JOptionPane
        JOptionPane optionPane;
        
        // Method untuk menjalankan JOptionPane
        void launchFrame() {
            // Membuat Object baru JOptionPane
            optionPane = new JOptionPane();
            
            //ShowInputDialog berarti pop-up untuk meminta input dari user
            String name = optionPane.showInputDialog("Hi, what's your name?");
            
            //showMessageDialog berarti pop-up untuk menampilkan pesan / instruksi pada user
            optionPane.showMessageDialog(null,"Nice to meet you, " + name + ".", "Greeting...",optionPane.PLAIN_MESSAGE);
            
            //Exit dari pop-up setelah selesai dijalankan
            System.exit(0);
    }
        
    public static void main(String args[]) {
        // Menjalankan method launchFrame yang sudah dibuat sebelumnya
        new JOptionPane_Swing().launchFrame();
    }
}
