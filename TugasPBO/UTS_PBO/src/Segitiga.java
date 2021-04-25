/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Segitiga extends Bangun2Dimensi{
    private String name;
    public static int objectCount = 0;
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;
    private float luasSegitiga;
    private float kelilingSegitiga;
    
    //Constructor
    public Segitiga(String inputName,float inputAlas,float inputTinggi,float inputSisi1,float inputSisi2,float inputSisi3){
        this.objectCount++;
        this.name = inputName;
        this.alas = inputAlas;
        this.tinggi = inputTinggi;
        this.sisi1 = inputSisi1;
        this.sisi2 = inputSisi2;
        this.sisi3 = inputSisi3;
        this.luasSegitiga = inputAlas*inputTinggi/2;
        this.kelilingSegitiga = inputSisi1+inputSisi2+inputSisi3;
    }
    
    //Mutator
    @Override
    public void setName(String inputName){
        this.name = inputName;
    }
    public void setAlas(float inputAlas){
        this.alas = inputAlas;
    }
    public void setTinggi(float inputTinggi){
        this.tinggi = inputTinggi;
    }
    public void setSisi1(float inputSisi1){
        this.sisi1 = inputSisi1;
    }
    public void setSisi2(float inputSisi2){
        this.sisi2 = inputSisi2;
    }
    public void setSisi3(float inputSisi3){
        this.sisi3 = inputSisi3;
    }
    
    //Accessor
    @Override
    public String getName(){
        return this.name;
    }
    public float getAlas(){
        return this.alas;
    }
    public float getTinggi(){
        return this.tinggi;
    }
    public float getSisi1(){
        return this.sisi1;
    }
    public float getSisi2(){
        return this.sisi2;
    }
    public float getSisi3(){
        return this.sisi3;
    }
     @Override
    public float getLuas(){
        return this.luasSegitiga;
    }
     @Override
    public float getKeliling(){
        return this.kelilingSegitiga;
    }
    
    //Tambahan
    public static int getObjectCount(){
        return objectCount;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Name\t : "+this.name);
        System.out.println("Alas\t : "+this.alas);
        System.out.println("Tinggi\t : "+this.tinggi);
        System.out.println("Sisi 1\t : "+this.sisi1);
        System.out.println("Sisi 2\t : "+this.sisi2);
        System.out.println("Sisi 3\t : "+this.sisi3);
        System.out.println("Luas\t : "+this.luasSegitiga);
        System.out.println("Keliling : "+this.kelilingSegitiga);
    }
    
    @Override
    public void displayMinInfo(){
        System.out.println("Name\t : "+this.name);
        System.out.println("Alas\t : "+this.alas);
        System.out.println("Tinggi\t : "+this.tinggi);
    }
        
}