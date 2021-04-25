/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JawabanSoal2;

/**
 *
 * @author User
 */
 class Circle extends Shape {
     private String nama;
     private float jari2;
     private float diameter;
     private float luasLingkaran;
     private float kelilingLingkaran;
     
     public Circle(String inputNama,float inputJari2){
         this.nama = inputNama;
         this.jari2 = inputJari2;
         this.diameter = 2*inputJari2;
         this.luasLingkaran = (float) (3.14*inputJari2*inputJari2);
         this.kelilingLingkaran = (float) (3.14*2*inputJari2);
     }
     @Override
     public void setNama(String nama){
         this.nama = nama;
     }
     
     public void setJari2(float inputJari2){
         this.jari2 = inputJari2;
     }
     
     @Override
     public String getNama(){
         return this.nama;
     }
     
     @Override
     public float getLuas(){
         return this.luasLingkaran;
     }
     @Override
     public float getKeliling(){
         return this.kelilingLingkaran;
     }
     
     @Override
     public void displayInfo(){
         System.out.println("Name \t : "+this.nama);
        System.out.println("Jari-Jari: "+this.jari2);
        System.out.println("Diameter : "+this.diameter);
        System.out.println("Luas \t : "+this.luasLingkaran);
        System.out.println("Keliling : "+this.kelilingLingkaran);
     }
}
