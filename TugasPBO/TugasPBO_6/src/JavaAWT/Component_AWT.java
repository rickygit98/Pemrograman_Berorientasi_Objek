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
public class Component_AWT extends Frame {
    Component_AWT(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String args[]) {
        //Membuat object baru component
        Component_AWT fwc = new Component_AWT();
        
        //Flow / Arah distribusi componentnya
        fwc.setLayout(new FlowLayout());
        
        //Ukuran Frame
        fwc.setSize(700, 700);
        
        //Membuat button dengan diberi label atau tulisan "Test Me!" dan memasukkannya (add) ke frame
        fwc.add(new Button("Test Me!"));
        
       //Membuat label dengan tulisan "Labe" dan memasukkannya (add) ke frame
        fwc.add(new Label("Labe"));
        
        //Membuat Textfield dan memasukkannya (add) ke frame
        fwc.add(new TextField());
        
        //Membuat object baru CheckboxGroup
        CheckboxGroup cbg = new CheckboxGroup();
        //Membuat Pilihan Checkboxnya dan memasukkannya (add) ke frame
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
        
         //Membuat Object baru List
        List list = new List(3, false);
        //Membuat isi listnya
        list.add("MTV");
        list.add("V");
        //memasukkan (add) listnya yang sudah dibuat  ke frame
        fwc.add(list);
        
        //Membuat Object baru Choice , disebut juga radioButton
        Choice chooser = new Choice();
        //Membuat isi choosernya
        chooser.add("Avril");
        chooser.add("Monica");
        chooser.add("Britney");
        //memasukkan (add) choosernya yang sudah dibuat  ke frame
        fwc.add(chooser);
        
         //Membuat Object baru ScrollBar
        fwc.add(new Scrollbar());
        
        //Menampilkan frame saat program di run
        fwc.setVisible(true);
    }

}
