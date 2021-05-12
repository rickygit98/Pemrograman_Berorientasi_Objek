/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;


import javax.swing.JFrame;

/**
 *
 * @author Widianto
 */
public class SampleFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SampleFrame sf = new SampleFrame();                 // Generate Frame dan tampung pada variabel sf        
        sf.setTitle("Frame Baru");                          // Set Judul Frame dengan nama "Frame Baru"
        sf.setSize(1000,1000);                              // Set Ukuran Frame 1000x1000 pixel
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set Tombol X pada Frame agar bisa CLOSE
        sf.setVisible(true);                                // Frame Ditampilkan                
    }
    
}
