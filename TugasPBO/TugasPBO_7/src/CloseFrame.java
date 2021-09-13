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

public class CloseFrame extends Frame implements WindowListener{
    public static void main(String[] args) {
        CloseFrame cf = new CloseFrame("Close Window");
        cf.launchFrame();
    }
    CloseFrame(String title){
        super(title);
        Label label = new Label("Close Window");
        this.addWindowListener(this);
    }
    
    void launchFrame(){
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
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
