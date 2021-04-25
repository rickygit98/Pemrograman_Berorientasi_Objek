/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorpisme;

import Pewarisan.*;

/**
 *
 * @author Widianto
 */
public class Student extends Person{
    public Student(){
        System.out.println("Inside Student:Constructor");
        //beberapa kode di sini
    }

    @Override
    public String getName() {
        System.out.println("Student Name:" + name);
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
