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

public class CloseFrameInner extends Frame{
    public static void main(String[] args) {
        CloseFrameInner cfi = new CloseFrameInner("Close Frame dengan Inner Class");
        cfi.launchFrame();
    }
    CloseFrameInner(String title){
        super(title);
        this.addWindowListener(new InnerClose());
    }
    void launchFrame(){
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    class InnerClose extends WindowAdapter{
        public void windowClosing (WindowEvent e){
            dispose();
            System.exit(0);
        }
    }
}
