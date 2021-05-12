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
public class Graph_AWT extends Panel{

    // Contructor Class untuk GraphAWT
    Graph_AWT() {
         //Konstanta dalam class Color, bisa diganti nama warna yang lain misal red , blue, green, dll
        setBackground(Color.black);                                                  
    }
    
    //Method Khusus untuk
    public void paint(Graphics g) {       
        //Set Warna hijau
        g.setColor(new Color(0,255,0)); 
        //Set Font / tulisan
        g.setFont(new Font("Helvetica",Font.PLAIN,16));
        //Isi tulisan / teksnya
        g.drawString("Hello GUI World!", 30, 100);
        
        //Set warna merah
        g.setColor(new Color(1.0f,0,0)); 
        //Buat shape kotak / rectangle
        g.fillRect(30, 100, 150, 10);
        
         //Set warna Biru
        g.setColor(new Color(0,0,255)); 
        //Buat Shape kotak dengan sudut melingkar / rounded
        g.fillRoundRect(30, 150, 200, 200, 100, 100);
    }
      
    public static void main(String args[]) {
        // Buat Frame baru dengan judul tulisannya "Testing Graphics Panel"
        Frame f = new Frame("Testing Graphics Panel");
        
        //Buat Panel Baru dengan nama variable gp
        Graph_AWT gp = new Graph_AWT();
        
        //Memasukkan Panel ke frame
        f.add(gp);
        
        //Mengatur ukuran Frame
        f.setSize(750, 750);
        
        //Menampilkan frame saat di run
        f.setVisible(true);
    }

}
