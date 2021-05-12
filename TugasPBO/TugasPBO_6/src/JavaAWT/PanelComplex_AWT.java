/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author User
 */
public class PanelComplex_AWT extends Frame {
    PanelComplex_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String args[]) {
        //Membuat object baru PanelComplex_AWT, ini sebagai wadah atau frame
        PanelComplex_AWT cl = new PanelComplex_AWT();
        
        //Membuat object baru Panel dan membaginya menjadi 3 bagian
        Panel panelNorth = new Panel();
        Panel panelCenter = new Panel();
        Panel panelSouth = new Panel();
        
        
        /* Panel atas */
        //Panel menggunakan FlowLayout sebagai default , jadi tidak perlu ditulis new FlowLayout()
        //Membuat Object baru Button dengan label masing - masing
        panelNorth.add(new Button("ONE"));
        panelNorth.add(new Button("TWO"));
        panelNorth.add(new Button("THREE"));
        
        
        /* Panel tengah */
        //Mengatur Layout panel GridLayout dengan ukuran 4 baris dan 4 kolom
        panelCenter.setLayout(new GridLayout(4,2));
        //Membuat Object baru textfield dengan isi content dalam parameter
        panelCenter.add(new TextField("1st"));
        panelCenter.add(new TextField("2nd"));
        panelCenter.add(new TextField("3rd"));
        panelCenter.add(new TextField("4th"));
        
        
        /* Panel bawah */
        //Mengatur layout panel Border Layout
        panelSouth.setLayout(new BorderLayout());
        //Membuat Object baru Checkbox dan label masing - masing dan posisi masing - masing
        panelSouth.add(new Checkbox("Choose me!"),
        BorderLayout.CENTER);
        panelSouth.add(new Checkbox("I'm here!"),
        BorderLayout.EAST);
        panelSouth.add(new Checkbox("Pick me!"),
        BorderLayout.WEST);
        
        
        /* Menambahkan panel pada container Frame*/
        //Frame menggunakan BorderLayout sebagai default
        cl.add(panelNorth, BorderLayout.NORTH);
        cl.add(panelCenter, BorderLayout.CENTER);
        cl.add(panelSouth, BorderLayout.SOUTH);
        
        //Mengatur ukuran frame
        cl.setSize(700,700);
        
        //Menampilkan frame saat program di run
        cl.setVisible(true);
    }

}
