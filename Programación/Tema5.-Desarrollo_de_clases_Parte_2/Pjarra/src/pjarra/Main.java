/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjarra;
import Models.Jarra;
/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jarra jarraA = new Jarra(5);
        Jarra jarraB = new Jarra(7);
        jarraA.llena();
        jarraB.vacia();
        System.out.println("JA " + jarraA.toString());
        System.out.println("JB " + jarraB.toString());
        jarraB.llenaDesde(jarraA);
        jarraA.llena();
        jarraB.llenaDesde(jarraA);
        jarraB.vacia();
        jarraB.llenaDesde(jarraA);
        jarraA.llena();
        jarraB.llenaDesde(jarraA);
        System.out.println("JA " + jarraA.toString());
        System.out.println("JB " + jarraB.toString());
    }

}
