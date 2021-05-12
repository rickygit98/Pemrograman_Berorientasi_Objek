package JavaSwing;
import java.awt.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Jframe_Swing {
    
    // Menyiapkan wadah / variablenya dulu
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPane;
   
        void launchFrame() {
            /* inisialisasi */
            // masing masing variable yang sudah dibuat diatas diisi dengan component masing - masing
            // penamaan component di swing mirip dengan AWT , hanya perlu ditambahkan prefix J tiap component
            // misal Frame --> JFrame , Button --> JButton
            frame = new JFrame("My First Swing Application");
            panel = new JPanel();
            textField = new JTextField("Default text");
            button = new JButton("Click me!");
            contentPane = frame.getContentPane();
            
            /* menambahkan komponen-komponen ke panel– menggunakan
            FlowLayout sebagai default */
            // Disini tiap komponen yang dibuat ditampung ke Panel
            panel.add(textField);
            panel.add(button);
            
            /* menambahkan komponen-komponen contentPane– menggunakan
            BorderLayout */
            //Mengatur Layout Panel
            contentPane.add(panel, BorderLayout.CENTER);
            
            // Mempack / mengelompokan semua component dan panel tersebut ke satu frame
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Menampilkan frame saat program dijalankan
            frame.setVisible(true);
        }
    
        //Class Main untuk memanggil JFrame yang dibuat sebelumnya
        public static void main(String args[]) {
            //Membuat object baru Jframe_Swing yang menampung frame yang dibuat tadi
            Jframe_Swing sd = new Jframe_Swing();
            //Menjalankan (run) JFrame
            sd.launchFrame();
        }
}
