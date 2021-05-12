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
public class FlowLayoutManager_AWT extends Frame {
    FlowLayoutManager_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String args[]) {
        //Membuat object baru FlowLayoutManager
        FlowLayoutManager_AWT fld = new FlowLayoutManager_AWT();
        
        //Mengatur alignment dari component di Frame
        //Parameternya (alignment , hgap , vgap) untuk alignment pilihannya RIGHT,CENTER,LEFT
        fld.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 50));
        
        //Membuat object baru button dengan label masing-masing
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));

        //Mengatur ukuran Frame
        fld.setSize(700, 700);
        
        //Mengatur agar lokasi frame di tengah saat ditampilkan
        fld.setLocationRelativeTo(null);
        //Menampilkan frame saat program di run
        fld.setVisible(true);
    }

}
