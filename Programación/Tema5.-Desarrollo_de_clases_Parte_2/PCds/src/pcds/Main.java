/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcds;

import models.*;
import Utils.Utils;
import java.awt.AWTException;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        Utils uts = new Utils();
        int choice;
        System.out.println("Bienvenid@ al programa de gestion de CD: ");
        do {
            System.out.print("Dime la cantidad de Canciones del CD(maximo 10):");
            choice = uts.getInt();
        } while (choice < 0 || choice > 10);
        CD cd1 = new CD(choice - 1);
        uts.clearScreen();
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Agregar canciones al CD.");
            System.out.println("2. Agregar cancion al final del CD.");
            System.out.println("3. Ver canciones del cd.");
            System.out.println("4. Ver el numero de canciones del cd.");
            System.out.println("5. Grabar Cancion.");
            System.out.println("6. Ver cancion.");
            System.out.println("7. Eliminar cancion.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    System.out.println("A continuacion se motrara una lista con las posiciones de las cancione del CD.");
                    do {
                        int contador = 1;
                        System.out.println("Selecciona la posicion vacia para agregar la cancion.");
                        for (Cancion cans : cd1.getCanciones()) {
                            if(cans == null){
                                System.out.println(contador+". ");
                                contador ++;
                            }else{
                                System.out.println(contador+". "+cans.getNombre());
                                contador ++;
                            }
                        }
                        System.out.println("0. Salir");
                        System.out.print("Eleccion: ");
                        choice = uts.getInt();
                    } while (choice != 0 && cd1.getCanciones()[choice] != null);
                    break;
                case 2:
                    if (cd1.getCanciones()[cd1.getCanciones().length - 1] == null) {
                        Cancion can = new Cancion();
                        can.capturar();
                        cd1.setCancionesFinal(can);
                    } else {
                        String opcion;
                        System.out.println("La ultima posicion del CD esta ocupada por la siguiente cancion: " + cd1.getCanciones()[cd1.getCanciones().length - 1].getNombre());
                        do {
                            System.out.print("¿Estas seguro que deseas sustituir dicha cancion?Escribe si o no: ");
                            opcion = uts.getString();
                        } while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no"));
                        if (opcion.equalsIgnoreCase("si")) {
                            Cancion can = new Cancion();
                            can.capturar();
                            cd1.setCancionesFinal(can);
                        }
                    }
                    break;
                case 3:
                    int contador = 1;
                    for (Cancion cdE : cd1.getCanciones()) {
                        if (cdE != null) {
                            System.out.println(contador + ". " + cdE.getNombre());
                        }
                    }
                    Thread.sleep(1500);
                    break;

                    
            case 4:
                   cd1.manu("salir.entrar.disfrazar");
                   break;
                   
            }
            

        } while (choice != 0);
    }

}
