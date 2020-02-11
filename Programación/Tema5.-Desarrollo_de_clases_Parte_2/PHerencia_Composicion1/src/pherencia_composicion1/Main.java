/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia_composicion1;

import Utils.Utils;
import models.*;

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

        Empleado emple1 = new Empleado();

        do {
            System.out.println("Bienvenido al programa que desea hacer: ");
            System.out.println("1. Crear Empleado.");
            System.out.println("2. Mostrar los datos del empleado.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:

                    emple1.capturarEmpleado();
                    break;
                case 2:
                    System.out.println(emple1);
                    break;
            }
        } while (choice != 0);
    }

}
