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
import javax.swing.JOptionPane;

public class CloseFrameAdapter extends Frame{
    AdapterClose a = new AdapterClose(this);
    
    public static void main(String[] args) {
        CloseFrameAdapter cfa = new CloseFrameAdapter("Close Frame with Adapter");
        cfa.launchFrame();
    }
    CloseFrameAdapter (String title){
        super(title);
        this.addWindowListener(a);
    }
    void launchFrame(){
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class AdapterClose extends WindowAdapter{
    CloseFrameAdapter ref;
    AdapterClose (CloseFrameAdapter ref){
        this.ref = ref;
    }
   
    public void windowClosing(WindowEvent e){
        ref.setVisible(false);
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(ref, "Selamat Datang Admin");
    }
    
}
