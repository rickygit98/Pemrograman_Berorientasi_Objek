/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main( String[] args ){
    StudentRecord annaRecord = new StudentRecord();
    StudentRecord dodiRecord = new StudentRecord();
    StudentRecord budiRecord = new StudentRecord();
    annaRecord.setName("Anna");
    annaRecord.setAddress("Philippines");
    annaRecord.setAge(15);
    annaRecord.setMathGrade(80);
    annaRecord.setEnglishGrade(95.5);
    annaRecord.setScienceGrade(100);
    //overloaded methods
    annaRecord.print( annaRecord.getName() );
    annaRecord.print( annaRecord.getEnglishGrade(),
    annaRecord.getMathGrade(),
    annaRecord.getScienceGrade());
    System.out.println("Count="+StudentRecord.getStudentCount());
    }
}
