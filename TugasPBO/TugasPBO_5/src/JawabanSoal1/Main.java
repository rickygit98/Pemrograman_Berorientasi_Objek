/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal1;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {

        
        GradeSubject AnniGrade = new GradeSubject();
        AnniGrade.StudentInfo("Anni","Surabaya", 18);
        AnniGrade.setMathGrade(100);
        AnniGrade.setEnglishGrade(90);
        AnniGrade.setComputerGrade(80);
        AnniGrade.setScienceGrade(70);

        AnniGrade.displayInfo();
        
        
        System.out.println();
        System.out.println("========================================================================");
        System.out.println();
        
        GradeSubject BudiGrade = new GradeSubject();
        BudiGrade.StudentInfo("Budi","Sidoarjo", 30);
        BudiGrade.setMathGrade(70);
        BudiGrade.setEnglishGrade(65);
        BudiGrade.setComputerGrade(40);
        BudiGrade.setScienceGrade(80);
        
        BudiGrade.displayInfo();

        
        /*
        Penjelasan :
        1. Class StudentRecord memuat data - data umum Name , Address , Age
        2. Class GradeSubject mengextends dari class StudentRecord sekaligus menambah beberapa fungsi baru sesuai mata pelajaran masing - masing
        3. Math , English, Computer, Science
        4. Di Class GradeSubject ini ditambahkan constructor yang parameter nya mengambil data berupa object hasil class StudentRecord sehingga 
        5. Class GradeSubject dan StudentRecord bisa saling berhubungan
        6. Untuk pemanggilannya / implementasinya :
            + pertama dibuat dulu object dari StudentRecord dan jadi sebuah object
            + Kemudian dibuat juga object dari Class GradeSubject yang parameternya akan menangkap dari object StudentRecord
            + Tambahkan data baru sesuai Gradennya
        
        */
    }
}
