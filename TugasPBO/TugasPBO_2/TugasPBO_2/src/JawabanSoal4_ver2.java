/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//4.Program hitung nilai rata-rata nilai berdasarkan prosentase
import javax.swing.JOptionPane;

public class JawabanSoal4_ver2 {
    public static void main( String[] args ){
        System.out.println("4.Program Program hitung nilai rata-rata nilai berdasarkan prosentase");
        System.out.println("Versi II : JOptionPane");
        System.out.println(" ");
        
        float nilaiUjian1=Float.parseFloat(JOptionPane.showInputDialog("Masukkan Nilai 1 : "));
        float p1= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 1 : "));
        
        float nilaiUjian2=Float.parseFloat(JOptionPane.showInputDialog("Masukkan Nilai 2 : "));
        float p2= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 2 : "));
        
        float nilaiUjian3=Float.parseFloat(JOptionPane.showInputDialog("Masukkan Nilai 3 : "));
        float p3= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 3 : "));
        
        
        float p_total = p1+p2+p3;
        
        while (p_total > 100 || p_total < 100){
            JOptionPane.showMessageDialog(null,"Prosentase yang anda masukkan tidak sama dengan 100% , input lagi! ");
            p1= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 1 : "));
            p2= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 2 : "));
            p3= Float.parseFloat(JOptionPane.showInputDialog("Masukkan Prosentase Nilai 3 : "));
            p_total = p1+p2+p3;
        }
        
        float nilai1 = nilaiUjian1*p1/100;
        float nilai2 = nilaiUjian2*p2/100;
        float nilai3 = nilaiUjian3*p3/100;
        
        float rataNilai = (nilai1+nilai2+nilai3);
        
        if (rataNilai >= 60){
            JOptionPane.showMessageDialog(null,"Rata - Rata Nilai = "+rataNilai+ "  :-)");
        }
        else{
            JOptionPane.showMessageDialog(null,"Rata - Rata Nilai = "+rataNilai+ "  :-(");
        }
        
    }
}
