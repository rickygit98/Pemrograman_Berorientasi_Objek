/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner (System.in);
        int index = 0;
        Lingkaran[] lingkaranArray =  new Lingkaran[10];
        Segitiga[] segitigaArray = new Segitiga[10];
        
        lingkaranArray[0] = new Lingkaran("Lingkaran1",10);
        lingkaranArray[1] = new Lingkaran("Lingkaran2",40);
        lingkaranArray[2] = new Lingkaran("Lingkaran3",100); 
        
        segitigaArray[0] = new Segitiga("Segitiga1",10,20,12,14,16);
        segitigaArray[1] = new Segitiga("Segitiga2",100,200,50,60,70);
        segitigaArray[2] = new Segitiga("Segitiga3",450,300,90,80,75);
        
        String pilihanUser ="5";
        String subPilihan;
        String keyword;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("Main Menu Shape\n");
            System.out.println("1.ADD");
            System.out.println("2.DELETE");
            System.out.println("3.EDIT");
            System.out.println("4.VIEW");
            System.out.println("5.EXIT");
            System.out.println("9.VIEW ALL OBJECT (BONUS)"); 
            System.out.print("\nPilihan anda: ");
            pilihanUser = inputUser.next();

            switch (pilihanUser) {
//CASE 1 ADD OBJECT ---------------------------------------------------------------------------------------------------------------------------------
               case "1":
                    System.out.println("=================");
                    System.out.println("ADD OBJECT");
                    System.out.println("=================");
                   
                    System.out.println("a.Obj_BangunDatar1");
                    System.out.println("b.Obj_BangunDatar2");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a"://OBJECT SEGITIGA
                            for (int i = 0; i < segitigaArray.length; i++) {
                                if (segitigaArray[i] != null) {
                                    index += 1;
                                }   
                            }
                            System.out.print("Masukkan Nama Object : ");
                            String inputNama = inputUser.next();
                            System.out.print("Masukkan Alas Segitiga : ");
                            float inputAlas = inputUser.nextFloat();
                            System.out.print("Masukkan Tinggi Segitiga :");
                            float inputTinggi = inputUser.nextFloat();
                            System.out.print("Masukkan Sisi ke - 1 :");
                            float inputSisi1= inputUser.nextFloat();
                            System.out.print("Masukkan Sisi ke - 2 :");
                            float inputSisi2 = inputUser.nextFloat();
                            System.out.print("Masukkan Sisi ke - 3 :");
                            float inputSisi3 = inputUser.nextFloat();
                            segitigaArray[index] = new Segitiga(inputNama,inputAlas,inputTinggi,inputSisi1,inputSisi2,inputSisi3);  
                            break;
                            
                        case "b": //OBJECT LINGKARAN
                            for (int i = 0; i < lingkaranArray.length; i++) {
                                if (lingkaranArray[i] != null) {
                                    index += 1;
                                }   
                            }
                           System.out.print("Masukkan Nama Object : ");
                           inputNama = inputUser.next();
                           System.out.print("Masukkan Jari - Jari Lingkaran : ");
                           float inputJari2 = inputUser.nextFloat();
                           lingkaranArray[index] = new Lingkaran(inputNama,inputJari2);
                            break;
                            
                        case "c":
                            System.out.println("Keluar SubMenu");
                            break;
                            
                        default:
                        System.err.println("Input anda tidak ditemukan, Silahkan pilih [a/b/c]");
                     
                    }  
                    break;
//CASE 2 DELETE OBJECT-----------------------------------------------------------------------------------------------------------------------------
               case "2":
                    System.out.println("=================");
                    System.out.println("DELETE OBJECT");
                    System.out.println("=================");
                    
                    System.out.println("a.Obj_BangunDatar1");
                    System.out.println("b.Obj_BangunDatar2");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a":
                            System.out.println("=================");
                             for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i] != null) {
                                        System.out.println(segitigaArray[i].getName());
                                    }  
                                }
                            System.out.println("=================");
                            System.out.print("Input Nama Object yang ingin dihapus : ");
                            keyword = inputUser.next();
                            for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i].getName().equals(keyword)) {
                                        segitigaArray[i] = null;
                                        System.out.println("Data Berhasil di hapus");
                                        break;
                                    }
                            }
                            break;
                        
                        case "b":
                            System.out.println("=================");
                             for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i] != null) {
                                        System.out.println(lingkaranArray[i].getName());
                                    }  
                                }
                            System.out.println("=================");
                            System.out.print("Input Nama Object yang ingin dihapus : ");
                            keyword = inputUser.next();
                            for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i].getName().equals(keyword)) {
                                        lingkaranArray[i] = null;
                                        System.out.println("Data Berhasil di hapus");
                                        break;
                                    }
                            }
                            break;
                        case "c":
                            System.out.println("Keluar SubMenu");
                            break;
                        default:
                        System.err.println("Input anda tidak ditemukan, Silahkan pilih [a/b/c]");
                    }
                    break;
//CASE 3 EDIT OBJECT---------------------------------------------------------------------------------------------------------------------------------   
               case "3":
                    System.out.println("=================");
                    System.out.println("EDIT OBJECT");
                    System.out.println("=================");
                    
                    System.out.println("a.Obj_BangunDatar1");
                    System.out.println("b.Obj_BangunDatar2");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){     
                        case "a": //EDIT SEGITIGA OBJECT
                            System.out.println("=================");
                            for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i] != null) {
                                        System.out.println(segitigaArray[i].getName());
                                    }  
                                }
                            System.out.println("=================");
                                System.out.print("Input Nama Object yang ingin diubah : ");
                                keyword = inputUser.next();
                                
                                for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i].getName().equals(keyword)) {
                                        System.out.print("Masukkan Nama Baru :");
                                        String inputName = inputUser.next();
                                        System.out.print("Masukkan Alas Baru :");
                                        float inputAlas = inputUser.nextFloat();
                                        System.out.print("Masukkan Tinggi Baru :");
                                        float inputTinggi = inputUser.nextFloat();
                                        System.out.print("Masukkan Sisi 1 Baru :");
                                        float inputSisi1 = inputUser.nextFloat();
                                        System.out.print("Masukkan Sisi 2 Baru :");
                                        float inputSisi2 = inputUser.nextFloat();
                                        System.out.print("Masukkan Sisi 3 Baru :");
                                        float inputSisi3 = inputUser.nextFloat();
                                        
                                        segitigaArray[i].setName(inputName);
                                        segitigaArray[i].setAlas(inputAlas);
                                        segitigaArray[i].setTinggi(inputTinggi);
                                        segitigaArray[i].setSisi1(inputSisi1);
                                        segitigaArray[i].setSisi2(inputSisi2);
                                        segitigaArray[i].setSisi3(inputSisi3);
                                        
                                        break;
                                    }
                                }
                                break;
                        case "b": // EDIT LINGKARAN OBJECT
                                System.out.println("=================");
                                for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i] != null) {
                                        System.out.println(lingkaranArray[i].getName());
                                    }  
                                }
                                System.out.println("=================");
                                
                                System.out.print("Input Nama Object yang ingin diubah : ");
                                keyword = inputUser.next();
                                
                                for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i].getName().equals(keyword)) {
                                        System.out.print("Masukkan Nama Baru :");
                                        String inputName = inputUser.next();
                                        System.out.print("Masukkan Jari-Jari:");
                                        float inputJari2 = inputUser.nextFloat();
                                        
                                                
                                        lingkaranArray[i].setJari(inputJari2);
                                        lingkaranArray[i].setName(inputName);
                                        break;
                                    }
                                }
                                break;
                             
                        case "c": // EXIT SUBPROGRAM
                            System.out.println("Keluar SubMenu");
                            break;    
                            
                       default:
                           System.err.println("Input anda tidak ditemukan, Silahkan pilih [a/b/c]");
                    }
                    break;
                    
//CASE 4 VIEW OBJECT---------------------------------------------------------------------------------------------------------------------------------   
               case "4":
                    System.out.println("=================");
                    System.out.println("VIEW OBJECT");
                    System.out.println("=================");
                    
                    System.out.println("a.Obj_BangunDatar1");
                    System.out.println("b.Obj_BangunDatar2");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a": // VIEW OBJECT SEGITIGA
                            System.out.println("=================");
                             for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i] != null) {
                                        System.out.println(segitigaArray[i].getName());
                                    }  
                                }
                             System.out.println("=================");
                                
                             System.out.print("Masukkan nama yang object yang ingin dilihat : ");
                            keyword = inputUser.next();
                            
                            for (int i = 0 ;i<segitigaArray.length;i++){
                                if (segitigaArray[i].getName().equals(keyword)) {
                                        segitigaArray[i].displayInfo();
                                        break;
                                    }
                            }
                            break;
                            
                        case "b": // VIEW OBJECT LINGKARAN
                            System.out.println("=================");
                             for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i] != null) {
                                        System.out.println(lingkaranArray[i].getName());
                                    }  
                                }
                             System.out.println("=================");  
                                
                            System.out.print("Masukkan nama yang object yang ingin dilihat : ");
                            keyword = inputUser.next();
                            
                            for (int i = 0 ;i<lingkaranArray.length;i++){
                                if (lingkaranArray[i].getName().equals(keyword)) {
                                        lingkaranArray[i].displayInfo();
                                        break;
                                    }
                            }
                            break;
                        case "c":
                            System.out.println("Keluar SubMenu");
                            break;
                        default:
                        System.err.println("Input anda tidak ditemukan, Silahkan pilih [a/b/c]");
                    }
                    break;
//CASE 5 EXIT PROGRAM--------------------------------------------------------------------------------------------------------------------------------- 
                   case "5":
                    System.out.println("=================");
                    System.out.println("EXIT");
                    System.out.println("=================");
                    System.out.println("Anda Keluar Program");
                    break;   
                    
//CASE 9 VIEW ALL OBJECT ---------------------------------------------------------------------------------------------------------------------------------              
                case "9":
                    System.out.println("=================");
                    System.out.println("VIEW ALL OBJECT");
                    System.out.println("=================");
                    
                     System.out.println("a.Obj_BangunDatar1");
                    System.out.println("b.Obj_BangunDatar2");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                            case "a": // VIEW SEGITIGA
                                for (int i = 0; i < segitigaArray.length; i++) {
                                    if (segitigaArray[i] != null) {
                                        segitigaArray[i].displayInfo();
                                        System.out.println();
                                    }
                                    
                                }
                                break;
                                
                            case "b": // VIEW LINGKARAN
                                for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i] != null) {
                                        lingkaranArray[i].displayInfo();    
                                        System.out.println();
                                    }
                                    
                                }
                                break;
                            case "c": // EXIT
                                System.out.println("Keluar SubMenu");
                                 break;
                        
                            default:
                        System.err.println("Input anda tidak ditemukan, Silahkan pilih [a/b/c]");
                    }
                break;
                


                 default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5 or 9]");
            }
                    if (!pilihanUser.equals("5")){
                          isLanjutkan = UtilityClass.getYesorNo("Apakah Anda ingin melanjutkan program ini");
                    }
                    else{
                        break;
                    }
                      
                    
        }
    }
}
