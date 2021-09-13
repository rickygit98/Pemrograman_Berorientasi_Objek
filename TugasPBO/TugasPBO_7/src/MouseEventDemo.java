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

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener, WindowListener{
    TextField tf = new TextField(60);
    
    public static void main(String[] args) {
        MouseEventDemo med = new MouseEventDemo("Mouse Event Demo");
        med.launchFrame();
    }
    
    MouseEventDemo(String title){
        super(title);
        this.addMouseListener(this);
        this.addWindowListener(this);
    }
    public void launchFrame(){
        add(tf,BorderLayout.SOUTH);
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        String txt = "Mouse Ditekan";
        tf.setText(txt);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String txt = "Mouse Ditahan";
        tf.setText(txt);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        }

    @Override
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {
        }

    @Override
    public void windowIconified(WindowEvent e) {
       }

    @Override
    public void windowDeiconified(WindowEvent e) {
      }

    @Override
    public void windowActivated(WindowEvent e) {
     }

    @Override
    public void windowDeactivated(WindowEvent e) {
       }

    
    
}
