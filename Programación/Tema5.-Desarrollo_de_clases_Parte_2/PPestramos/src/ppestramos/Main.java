/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppestramos;

import Utils.Utils;
import java.awt.AWTException;
import models.*;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Utils uts = new Utils();
        int choice = 0;

        System.out.println("Bienvenid@ al programa de gestion de prestamos, estas apunto de crear un prestamo: ");
        System.out.println("Vamos a introducir primero los datos del solicitante: ");
        Persona solicitante = new Persona();
        solicitante.capturar();
        uts.clearScreen();
        System.out.println("Ahora vamos a pasar a los datos relacionados con el prestamo: ");
        Prestamo prestamo = new Prestamo(solicitante);
        prestamo.capturar();
        uts.clearScreen();

        do {
            System.out.println("Bienvenid@ al menu de gestion de prestamos.");
            System.out.println("Que deseas hacer: ");
            System.out.println("1. Ver los datos del prestamo.");
            System.out.println("2. Ver los datos del solicitante.");
            System.out.println("3. Ver si el año es bisiesto.");
            System.out.println("4. Ver la edad del solicitante.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    System.out.println(prestamo.toString());
                    break;
                case 2:
                    System.out.println(solicitante.toString());
                    break;
                case 3:
                    if (solicitante.isLeapYear()) {
                        System.out.println("Que suerte el año es bisiesto.");
                    } else {
                        System.out.println("Que mala suerte el año no es bisiesto");
                    }
                    break;
                case 4:
                    System.out.println("Edad del solicitante: " + solicitante.calcularEdad(solicitante.getFechaNacimiento()));
                    break;
            }
        } while (choice != 0);
    }

}
