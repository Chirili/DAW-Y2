/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcds;

import models.*;
import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        int choice;
        System.out.println("Bienvenid@ al programa de gestion de CD: ");
        System.out.print("Dime la cantidad de Canciones del CD(maximo 10):");
        CD cd1 = new CD(uts.getInt());
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Agregar canciones al CD.");
            System.out.println("2. Ver canciones del cd.");
            System.out.println("3. Ver el numero de canciones del cd.");
            System.out.println("4. Grabar Cancion.");
            System.out.println("5. Ver cancion.");
            System.out.println("5. Eliminar cancion.");
            System.out.println("0. Salir.");
            choice = uts.getInt();
            switch(choice){
                case 1:
                    Cancion can = new Cancion();
                    can.capturar();
                    cd1.setCancionesFinal(can);
                    break;
                case 2:
                    for(Cancion cdE : cd1.getCanciones()){
                        
                    }
                    break;
            
        }
            
        } while (choice != 0);
    }

}
