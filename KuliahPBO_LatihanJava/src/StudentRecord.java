/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentRecord {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    /**
    * Menghasilkan nama dari Siswa
    */
    public StudentRecord()
    {
        studentCount++;
    }

    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public int getAge(){
    return age;
    }
    public double getMathGrade(){
    return mathGrade;
    }
    public double getEnglishGrade(){
    return englishGrade;
    }
    public double getScienceGrade(){
    return scienceGrade;
    }
    /**
    * Mengubah nama siswa
    */
    public void setName( String temp ){
    name = temp;
    }
    public void setAddress( String temp ){
    address = temp;
    }
    public void setAge( int temp ){
    age = temp;
    }
    public void setMathGrade( double temp ){
    mathGrade = temp;
    }
    public void setEnglishGrade( double temp ){
    englishGrade = temp;
    }
    public void setScienceGrade( double temp ){
    scienceGrade = temp;
    }
    public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
    System.out.println("Name:" + name);
    System.out.println("Math Grade:" + mGrade);
    System.out.println("English Grade:" + eGrade);
    System.out.println("Science Grade:" + sGrade);
    }
    // area penulisan kode lain
    /**
    * Menghitung rata – rata nilai Matematik, Bahasa Inggris, * * Ilmu Pasti
    */
    public double getAverage(){
    double result = 0;
    result = ( mathGrade+englishGrade+scienceGrade )/3;
    return result;
    }
    /**
    * Menghasilkan jumlah instance StudentRecord
    */
    public static int getStudentCount(){
    return studentCount;
    }

}
