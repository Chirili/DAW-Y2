/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pficherosbinarios;
import Utils.Utils;
import ejercicios.*;
import java.io.IOException;
/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int choice;
        Utils uts = new Utils();
        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");
            System.out.println("3. Ejercicio 3.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    Ejercicio1 ej1 = new Ejercicio1();
                    ej1.ejecutar();

                    break;
                case 2:
                    Ejercicio2 ej2 = new Ejercicio2();
                    ej2.ejecutar();
                    break;
                case 3:
                    Ejercicio3 ej3 = new Ejercicio3();
                    ej3.ejecutar();
                    break;
            }
        } while (choice != 0);

    }

}
