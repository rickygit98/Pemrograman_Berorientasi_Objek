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
public class CloseFrameAnon extends Frame{
    public static void main(String[] args) {
        CloseFrameAnon cfia = new CloseFrameAnon("Close Frame dengan Anonymous Class");
        cfia.launchFrame();
    }
    CloseFrameAnon(String title){
        super(title);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
                System.exit(0);
            }
        });
    }
    void launchFrame(){
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
}
