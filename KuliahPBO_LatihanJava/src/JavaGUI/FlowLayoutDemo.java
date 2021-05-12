/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

/**
 *
 * @author Widianto
 */
import java.awt.*;
import javax.swing.JFrame;
class FlowLayoutDemo extends JFrame {

    public static void main(String args[]) {
        FlowLayoutDemo fld = new FlowLayoutDemo();
        Panel P1 = new Panel();
        Panel P2 = new Panel();
        //fld.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        fld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        P1.add(new Button("ONE"));
        P1.add(new Button("TWO"));
        P1.add(new Button("THREE"));
        P1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        fld.add(P1);
        
        //fld.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));       
   /*     P2.add(new Button("FOUR"));
        P2.add(new Button("FIVE"));
        P2.add(new Button("SIX"));
        P2.setLayout(new FlowLayout(FlowLayout.RIGHT,100,100));
        fld.add(P2); */
        
        fld.setSize(500, 500);
        fld.setVisible(true);
    }
}

