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
public class Square extends Shape {
    private String nama;
    private float sisi;
    private float luasPersegi;
    private float kelilingPersegi;
    
   public Square(String inputNama, float inputSisi){
       this.nama = inputNama;
       this.sisi = inputSisi;
       this.luasPersegi = inputSisi*inputSisi;
       this.kelilingPersegi = 4*inputSisi;
   }
   
   @Override
   public void setNama(String inputNama){
       this.nama = inputNama;
   }
   
   public void setSisi(float inputSisi){
       this.sisi = inputSisi;
   }
   
   @Override
   public String getNama(){
       return this.nama;
   }
   @Override
   public float getLuas(){
       return this.luasPersegi;
   }
   @Override
   public float getKeliling(){
       return this.kelilingPersegi;
   }
   @Override
   public void displayInfo(){
       System.out.println("Name \t : "+this.nama);
        System.out.println("Sisi \t : "+this.sisi);
        System.out.println("Luas \t : "+this.luasPersegi);
        System.out.println("Keliling : "+this.kelilingPersegi);
   }
}
