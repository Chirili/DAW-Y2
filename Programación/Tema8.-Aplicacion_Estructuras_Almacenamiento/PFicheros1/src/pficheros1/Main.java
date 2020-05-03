/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pficheros1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import Utils.Utils;
import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException, InvocationTargetException, IOException {
        int choice;
        Utils uts = new Utils();
        do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Ejercicio 1(Leer fichero).");
            System.out.println("2. Ejercicio 2(Lectura y escritura sobre fichero).");
            System.out.println("3. Ejercicio 3.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    Ejercicio1.ejecutar();
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
