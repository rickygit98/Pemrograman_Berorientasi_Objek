package JavaAWT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;

public class Default_AWT extends Frame{
    Default_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
        
    public static void main(String args[]) {
        Default_AWT sf = new Default_AWT();    // Membuat Object baru Frame
        sf.setSize(1000, 1000);                                 // Mengatur ukuran Frame
  
        sf.setVisible(true);                                         // Menampilkan Frame saat di run
        
    }
}

