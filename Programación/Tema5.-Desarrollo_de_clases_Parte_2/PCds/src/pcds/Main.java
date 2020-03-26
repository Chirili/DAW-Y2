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
        CD cd1 = new CD(choice);
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Grabar Cancion al CD.");
            System.out.println("2. Agregar cancion al final del CD.");
            System.out.println("3. Ver canciones del cd.");
            System.out.println("4. Ver el numero de canciones del cd.");
            System.out.println("5. Ver cancion.");
            System.out.println("6. Eliminar cancion.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    int pchoice = 0;
                    System.out.println("A continuacion se motrara una lista con las posiciones de las cancione del CD.");
                    do {
                        uts.clearScreen();
                        int contador = 1;

                        System.out.println("Selecciona la posicion vacia para agregar la cancion.");
                        for (Cancion cans : cd1.getCanciones()) {
                            if (cans == null) {

                                System.out.println(contador + ". ");
                                contador++;
                            } else {
                                System.out.println(contador + ". " + cans.getNombre());
                                contador++;
                            }
                        }
                        System.out.println("0. Salir");
                        System.out.print("Eleccion: ");
                        pchoice = uts.getInt();
                    } while (pchoice != 0 && pchoice > cd1.getCanciones().length);

                    if (pchoice == 0) {
                        break;
                    } else if (cd1.getCanciones()[pchoice - 1] == null) {
                        Cancion canc = new Cancion();
                        canc.capturar();
                        cd1.grabarCancion(pchoice - 1, canc);
                    } else {
                        String userChoice;
                        System.out.println("La posicion elegida para la cancion esta ocupada.");
                        do {
                            System.out.print("¿Desea sustituir la cancion? Escribe si o no: ");
                            userChoice = uts.getString();
                        } while (!userChoice.equalsIgnoreCase("no") && !userChoice.equalsIgnoreCase("si"));
                        if (userChoice.equalsIgnoreCase("si")) {
                            Cancion canc = new Cancion();
                            canc.capturar();
                            cd1.grabarCancion(pchoice - 1, canc);
                        }
                    }
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
                    uts.clearScreen();
                    for (Cancion cdE : cd1.getCanciones()) {
                        if (cdE != null) {
                            System.out.println("Lista de canciones del CD");
                            System.out.println(contador + ". " + cdE.getNombre());
                        }
                    }
                    break;

                case 4:
                    System.out.println("El numero de canciones del CD es de: " + cd1.numeroCanciones());
                    break;
                case 5:
                    System.out.println("Elige de la siguiente lista la cancion que quieres ver: ");
                    do {
                        int count = 1;
                        for (Cancion cans : cd1.getCanciones()) {
                            if (cans != null) {
                                System.out.println(count + ". " + cans.getNombre());
                                count++;
                            }
                        }
                        System.out.println("0. Salir");
                        System.out.print("Eleccion: ");
                        choice = uts.getInt();
                        count = 0;
                        for (Cancion cans : cd1.getCanciones()) {
                            if (cans != null) {
                                count++;
                                if (count == choice) {
                                    System.out.println(cans.toString());
                                }
                            }
                        }
                    } while (choice != 0);
                    choice++;
                    break;
                case 6:
                    System.out.println("Elige de la siguiente lista la cancion que quieres eliminar: ");
                    do {
                        int count = 1;
                        for (Cancion cans : cd1.getCanciones()) {
                            if (cans != null) {
                                System.out.println(count + ". " + cans.getNombre());
                                count++;
                            }
                        }
                        System.out.println("0. Salir");
                        System.out.print("Eleccion: ");
                        choice = uts.getInt();
                        count = 0;
                        for (int i = 0; i < cd1.getCanciones().length; i++) {
                            if (cd1.getCanciones()[i] != null) {
                                count++;
                                if (count == choice) {
                                    cd1.deleteCancion(i);
                                    break;
                                }
                            }
                        }
                    } while (choice != 0);
                    choice++;
            }
        } while (choice != 0);
    }
}
