/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class LatihanBab10_Main {

    public static void main( String[] args ){
    //membuat 3 object StudentRecord
    LatihanBab10_StudentRecord annaRecord = new LatihanBab10_StudentRecord();
    LatihanBab10_StudentRecord beahRecord = new LatihanBab10_StudentRecord();
    LatihanBab10_StudentRecord crisRecord = new LatihanBab10_StudentRecord();
    //Memberi nama siswa
    annaRecord.setName("Anna");
    beahRecord.setName("Beah");
    crisRecord.setName("Cris");
    //Menampilkan nama siswa “Anna”
    System.out.println( annaRecord.getName());
    //Menampilkan jumlah siswa
    System.out.println("Count="+LatihanBab10_StudentRecord.getStudentCount());
    }
    
}
