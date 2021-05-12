/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import javax.swing.*;

/**
 *
 * @author Widianto
 */
public class GrafikPanel extends Panel {

    public GrafikPanel() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0,255,0));
        g.setFont(new Font("Helvetica",Font.PLAIN,16));
        g.drawString("Hello GUI World", 30, 100);
        g.setColor(new Color(1.0f, 0, 0));
        g.fillRect(30, 100, 150, 10);
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Testing");
        GrafikPanel gp =  new GrafikPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(gp);
        f.setSize(600,300);
        f.setVisible(true);
    }
    
}
