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
public class Utama {
    public static void main( String[] args ){
        Person ref;
        
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        Staff staffObject = new Staff();
        
        System.out.println("--------- Students -------------------------------");
        ref = studentObject; //Person menunjuk kepada
// object Student
        ref.setName("JOJON");
        String temp = ref.getName(); //getName dari Student
//class dipanggil
        System.out.println( temp );
        
        System.out.println("--------- Employee ----------------------------");
        ref = employeeObject; //Person menunjuk kepada       
// object Employee
        ref.setName("HanHan");
        temp = ref.getName(); //getName dari Employee
//class dipanggil
        System.out.println( temp );

        System.out.println("--------- Staff ----------------------------------");
        ref = staffObject; //Person menunjuk kepada
// object Staff
        ref.setName("Ricky");
        temp = ref.getName(); //getName dari Staff
//class dipanggil
        System.out.println( temp );
    }
}
