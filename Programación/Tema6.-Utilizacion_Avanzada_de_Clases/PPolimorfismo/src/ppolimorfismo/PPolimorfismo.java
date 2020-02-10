/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppolimorfismo;

import models.*;
import Utils.Utils;

/**
 *
 * @author usuario
 */
public class PPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();

        int choice;

        do {
            System.out.println("Que quieres hacer: ");
            System.out.println("1. Crear un PC.");
            System.out.println("2. Crear un Portatil.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch(choice){
                case 1:
                    PC pc1 = new PC();
                    pc1.capturar();
                    System.out.println(pc1);
                    break;
                case 2:
                    Portatil p1 = new Portatil();
                    p1.capturar();
                    System.out.println(p1);
                    break;
            }
        } while (choice != 0);
    }

}
