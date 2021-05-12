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
public class GridLayoutManager_AWT extends Frame{
    GridLayoutManager_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String args[]) {
        
        //Membuat object baru GridLayoutManager_AWT
        //GridLayout membagi frame menjadi bagian - bagian baris dan kolom dan tidak memedulikan ukuran sebenarnya dari komponen
        GridLayoutManager_AWT gld = new GridLayoutManager_AWT();
        
        // Urutan parameter GridLayout(jumlahBaris, jumlahKolom, horizontalGap, verticalGap)
        gld.setLayout(new GridLayout(2, 3, 4, 4));
        
        // Membuat Object baru button dengan label masing - masing
        gld.add(new Button("ONE"));
        gld.add(new Button("TWO"));
        gld.add(new Button("THREE"));
        gld.add(new Button("FOUR"));
        gld.add(new Button("FIVE"));
        
        // Mengatur ukuran frame nya
        gld.setSize(200, 200);
        
        // Menampilkan frame saat program dijalankan
        gld.setVisible(true);
    }
}
