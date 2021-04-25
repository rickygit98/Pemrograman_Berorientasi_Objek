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
public class MainClass {
    public static void main(String[] args) {
        System.out.println("======LINGKARAN=======");
        Circle circle = new Circle("Lingkaranku",10);
        circle.displayInfo();
        
        System.out.println();
        
        System.out.println("======PERSEGI=======");
        Square square = new Square("Persegiku",5);
        square.displayInfo();
    }
}
