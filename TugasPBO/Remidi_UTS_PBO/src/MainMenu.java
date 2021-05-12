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
        
        //Definisi Array dengan data maksimal 10
        Lingkaran[] lingkaranArray =  new Lingkaran[10];
        Bola[] bolaArray = new Bola[10];
        
        // Buat Object Array Lingkaran 3 buah
        lingkaranArray[0] = new Lingkaran("Lingkaran1",10);
        lingkaranArray[1] = new Lingkaran("Lingkaran2",40);
        lingkaranArray[2] = new Lingkaran("Lingkaran3",100); 
        
        // Buat Object Array Bola 3 buah
        bolaArray[0] = new Bola("Bola1",14);
        bolaArray[1] = new Bola("Bola2",30);
        bolaArray[2] = new Bola("Bola3",97);
        
        
        String pilihanUser;
        String subPilihan;
        String keyword;
        String inputName;
        float inputJari2;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
           System.out.println("=================");
            System.out.print("Main Menu Shape\n");
            System.out.println("=================");
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
                   
                    System.out.println("a.Obj_BangunDatar");
                    System.out.println("b.Obj_Bangun3D");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a"://OBJECT LINGKARAN
                           for (int i = 0; i < lingkaranArray.length; i++) {
                                if (lingkaranArray[i] != null) {
                                    index += 1;
                                }   
                            }
                           System.out.print("Masukkan Nama Object : ");
                           inputName = inputUser.next();
                           System.out.print("Masukkan Jari - Jari Lingkaran : ");
                           inputJari2 = inputUser.nextFloat();
                           lingkaranArray[index] = new Lingkaran(inputName,inputJari2);
                            break;
                            
                        case "b": //OBJECT BOLA
                             for (int i = 0; i < bolaArray.length; i++) {
                                if (bolaArray[i] != null) {
                                    index += 1;
                                }   
                            }
                            System.out.print("Masukkan Nama Object : ");
                            inputName = inputUser.next();
                            System.out.print("Masukkan Jari - Jari Bola : ");
                            inputJari2 = inputUser.nextFloat();

                            bolaArray[index] = new Bola(inputName,inputJari2);  
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
                    
                   System.out.println("a.Obj_BangunDatar");
                    System.out.println("b.Obj_Bangun3D");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a": // DELETE LINGKARAN OBJECT
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
                                        UtilityClass.sortingData(lingkaranArray);
                                        System.out.println("Data Berhasil di hapus");
                                        
                                        break;
                                    }
                            }
                            break;
                        
                        case "b":   // DELETE BOLA OBJECT
                            System.out.println("=================");
                             for (int i = 0; i < bolaArray.length; i++) {
                                    if (bolaArray[i] != null) {
                                        System.out.println(bolaArray[i].getName());
                                    }  
                                }
                            System.out.println("=================");
                            System.out.print("Input Nama Object yang ingin dihapus : ");
                            keyword = inputUser.next();
                            for (int i = 0; i < bolaArray.length; i++) {
                                    if (bolaArray[i].getName().equals(keyword)) {
                                        bolaArray[i] = null;
                                        UtilityClass.sortingData(bolaArray);
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
                    
                    System.out.println("a.Obj_BangunDatar");
                    System.out.println("b.Obj_Bangun3D");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){     
                        case "a": //EDIT LINGKARAN OBJECT
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
                                        System.out.print("Masukkan Nama baru :");
                                        inputName = inputUser.next();
                                        System.out.print("Masukkan Jari-Jari baru:");
                                        inputJari2 = inputUser.nextFloat();
                                               
                                        lingkaranArray[i].setJari2(inputJari2);
                                        lingkaranArray[i].setName(inputName);
                                        
                                        break;
                                    }
                                }
                                break;
                                
                        case "b": // EDIT BOLA OBJECT
                                System.out.println("=================");
                                for (int i = 0; i < bolaArray.length; i++) {
                                        if (bolaArray[i] != null) {
                                            System.out.println(bolaArray[i].getName());
                                        }  
                                    }
                                System.out.println("=================");
                                    System.out.print("Input Nama Object yang ingin diubah : ");
                                    keyword = inputUser.next();

                                    for (int i = 0; i < bolaArray.length; i++) {
                                        if (bolaArray[i].getName().equals(keyword)) {
                                            System.out.print("Masukkan Nama baru :");
                                            inputName = inputUser.next();
                                            System.out.print("Masukkan Jari - jari baru :");
                                            inputJari2 = inputUser.nextFloat();

                                            bolaArray[i].setName(inputName);
                                            bolaArray[i].setJari2(inputJari2);

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
                    
                    System.out.println("a.Obj_BangunDatar");
                    System.out.println("b.Obj_Bangun3D");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                        case "a": // VIEW OBJECT LINGKARAN
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
                            
                        case "b": // VIEW OBJECT BOLA
                            System.out.println("=================");
                             for (int i = 0; i < bolaArray.length; i++) {
                                    if (bolaArray[i] != null) {
                                        System.out.println(bolaArray[i].getName());
                                    }  
                                }
                             System.out.println("=================");
                                
                             System.out.print("Masukkan nama yang object yang ingin dilihat : ");
                            keyword = inputUser.next();
                            
                            for (int i = 0 ;i<bolaArray.length;i++){
                                if (bolaArray[i].getName().equals(keyword)) {
                                        bolaArray[i].displayInfo();
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
                    
                     System.out.println("a.Obj_BangunDatar");
                    System.out.println("b.Obj_Bangun3D");
                    System.out.println("c.Exit");
                    System.out.print("\nPilihan anda: ");
                    subPilihan = inputUser.next();
                    System.out.println();
                    
                    switch(subPilihan){
                            case "a": // VIEW ALL BOLA
                               for (int i = 0; i < lingkaranArray.length; i++) {
                                    if (lingkaranArray[i] != null) {
                                        lingkaranArray[i].displayInfo();    
                                        System.out.println();
                                    }                        
                                }
                                break;
                                
                            case "b": // VIEW ALL LINGKARAN
                                 for (int i = 0; i < bolaArray.length; i++) {
                                    if (bolaArray[i] != null) {
                                        bolaArray[i].displayInfo();
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
