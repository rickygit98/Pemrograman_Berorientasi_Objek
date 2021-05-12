/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bola extends Lingkaran{

    private float volumeBola;
    private float luasBola;
    
   // -------------------------------------------------------------------- 3 Constructor
  public Bola(){
        objectCount++;
    }
    public Bola(String inputName){
        objectCount++;
        this.name = inputName;
    }
    public Bola(String inputName,float inputJari2){
        objectCount++;
        this.name = inputName;
        this.jari2 = inputJari2;
        this.diameter = 2*inputJari2;
        
        if(inputJari2%7 == 0){
            this.volumeBola = (float) (4*(22*inputJari2*inputJari2*inputJari2/7)/3);
            this.luasBola = (float) (4*22*inputJari2*inputJari2/7);
        }
        else{
            this.volumeBola = (float) (4*3.14*inputJari2*inputJari2*inputJari2/3);
            this.luasBola = (float) (4*3.14*inputJari2*inputJari2);
        }
        
    }
    
    // -------------------------------------------------------------------- Mutator
    @Override
    public void setName(String inputName){
        this.name = inputName;
    };
    
    public void setJari2(float inputJari2){
        this.jari2 = inputJari2;
    }
    
    // -------------------------------------------------------------------- Accessor
    @Override
    public String getName(){
        return this.name;
    };
    @Override
    public float getJari2(){
        return this.jari2;
    };
    @Override
    public float getDiameter(){
        return this.diameter;
    };
    
    @Override
    public float getLuas(){
        return this.luasBola;
    };

    public float getVolume(){
        return this.volumeBola;
    };
    
//Tambahan
    public static int getObjectCount(){
        return objectCount;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Name \t : "+this.name);
        System.out.println("Jari-Jari: "+this.jari2);
        System.out.println("Diameter : "+this.diameter);
        System.out.println("Luas \t : "+this.luasBola);
        System.out.println("Volume \t : "+this.volumeBola);
    };
    
    @Override
    public void displayMinInfo(){
        System.out.println("Name\t : "+this.name);
        System.out.println("Jari-Jari\t : "+this.jari2);
    }
        
}