/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lingkaran extends Bangun2Dimensi {
    protected String name;
    protected static int objectCount = 0;
    protected float jari2;
    protected float diameter;
    private float luasLingkaran;
    private float kelilingLingkaran;
    
    // -------------------------------------------------------------------- 3 Constructor
    public Lingkaran(){
        objectCount++;
    }
    public Lingkaran(String inputName){
         objectCount++;
        this.name = inputName;
    }
    public Lingkaran(String inputName,float inputJari2){
        objectCount++;
        this.name = inputName;
        this.jari2 = inputJari2;
        this.diameter = 2*inputJari2;
        
        if(inputJari2%7 == 0){
            this.luasLingkaran = (float) (22*inputJari2*inputJari2/7);
            this.kelilingLingkaran = (float) (2*22*inputJari2/7);
        }
        else{
            this.luasLingkaran = (float) (3.14*inputJari2*inputJari2);
            this.kelilingLingkaran = (float) (2*3.14*inputJari2);
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
        return this.luasLingkaran;
    };

    public float getKeliling(){
        return this.kelilingLingkaran;
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
        System.out.println("Luas \t : "+this.luasLingkaran);
        System.out.println("Keliling : "+this.kelilingLingkaran);
    };
    @Override
    public void displayMinInfo(){
        System.out.println("Name\t : "+this.name);
        System.out.println("Jari-Jari\t : "+this.jari2);
    };
}
