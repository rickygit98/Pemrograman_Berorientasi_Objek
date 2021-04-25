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

public class GradeSubject extends StudentRecord {
        private double mathGrade;
        private double englishGrade;
        private double computerGrade;
        private double scienceGrade;
    

        public void setMathGrade(double inputMathGrade){
            this.mathGrade = inputMathGrade;
        }
        public void setEnglishGrade(double inputEnglishGrade){
            this.englishGrade = inputEnglishGrade;
        }
        public void setComputerGrade(double inputComputerGrade){
            this.computerGrade = inputComputerGrade;
        }
        public void setScienceGrade(double inputScienceGrade){
            this.scienceGrade = inputScienceGrade;
        }

        public double getMathGrade(){
            return this.mathGrade;
        }

        public double getComputerGrade(){
            return this.computerGrade;
        }

        public double getScienceGrade(){
            return this.scienceGrade;
        }

        public double getEnglishGrade(){
            return this.englishGrade;
        }
        @Override
        public void displayInfo(){
            System.out.println("Nama \t : "+this.name);
            System.out.println("Alamat \t : "+this.address);
            System.out.println("Umur \t : "+this.age  + " Tahun");
            System.out.println("Nilai Matematika "+this.name+"\t= "+this.mathGrade);
            System.out.println("Nilai B.Inggris "+this.name+"\t= "+this.englishGrade);
            System.out.println("Nilai Komputer "+this.name+"\t= "+this.computerGrade);
            System.out.println("Nilai Science "+this.name+"\t= "+this.scienceGrade);
            System.out.println("");
            System.out.println("Siswa saat ini : "+StudentRecord.getStudentCount());
        }
    
}
