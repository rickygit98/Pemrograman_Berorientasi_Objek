package JawabanSoal1;

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
    protected String name;
    protected String address;
    protected int age;
    private static int studentCount;
 
     public void StudentInfo(String inputName,String inputAddress, int inputAge){
        this.name = inputName;
        this.address = inputAddress;
        this.age = inputAge;
    }
       /*
    Menghitung jumlah siswa
    */
   
    public StudentRecord()
    {
        studentCount++;
    }
    
    public static int getStudentCount(){
    return studentCount;
    }

       /*
    Mengambil  data umum dari siswa
    */
    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public int getAge(){
    return age;
    }
   

    /*
    Mengubah data umum dari siswa
    */
    public void setName( String inputName ){
    name = inputName;
    }
    public void setAddress( String inputAddress ){
    address = inputAddress;
    }
    public void setAge( int inputAge ){
    age = inputAge;
    }

    /*
    Fungsi Lain
    */
    public void displayInfo(){
        System.out.println("Nama \t : "+this.name);
        System.out.println("Alamat \t : "+this.address);
        System.out.println("Umur \t : "+this.age);
    }
}
