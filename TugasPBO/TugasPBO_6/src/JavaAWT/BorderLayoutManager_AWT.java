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
public class BorderLayoutManager_AWT extends Frame{
    BorderLayoutManager_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String args[]) {
        //Membuat object baru BorderLayoutManager
        //FlowLayout membagi kontainer menjadi 3 bagian saja : kiri, tengah, kanan
        //BorderLayout membagi kontainer menjadi lima bagian diantaranya utara, selatan, timur,barat, dan tengah.
        BorderLayoutManager_AWT bld = new BorderLayoutManager_AWT();
        
        //Jarak antar komponen
        //Urutannya (HorizontalGap, VerticalGap)
        bld.setLayout(new BorderLayout(50, 10)); 
        
        //Membuat object baru Button dengan label masing - masing dengan posisi masing - masing
        bld.add(new Button("NORTH"), BorderLayout.NORTH);
        bld.add(new Button("SOUTH"), BorderLayout.SOUTH);
        bld.add(new Button("EAST"), BorderLayout.EAST);
        bld.add(new Button("WEST"), BorderLayout.WEST);
        bld.add(new Button("CENTER"), BorderLayout.CENTER);
        
        //Mengatur ukuran frame
        bld.setSize(700, 700);
        
        //Menampilkan frame saat program di run
        bld.setVisible(true);
    }


}
