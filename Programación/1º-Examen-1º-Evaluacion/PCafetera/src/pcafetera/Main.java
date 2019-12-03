/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcafetera;

import Utils.Utils;
import java.awt.AWTException;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
         Utils uts = new Utils();
        int fChoice;
        Cafetera cf = new Cafetera();
        
        do {
            System.out.println("Has entrado en el programa encargado de gestionar cafeteras:");
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Ver capacidad maxima de la cafetera.");
            System.out.println("2. Ver capacidad actual de la cafetera(La cafetera tiene capacidad maxima de 1000c.c)");
            System.out.println("3. Llenar cafetera.");
            System.out.println("4. Agregar cafe.");
            System.out.println("5. Vaciar cafetera.");
            System.out.println("6. Servir cafe.");
            System.out.println("7. Salir.");
            System.out.print("Eleccion: ");
            fChoice = uts.getInt();
            switch (fChoice) {
                case 1:
                    System.out.println(cf.getCapacidadMaxima());
                    Thread.sleep(2000);
                    uts.clearScreen();
                    break;
                case 2:
                    System.out.println(cf.getCapacidadActual());
                    Thread.sleep(2000);
                    uts.clearScreen();
                    break;
                case 3:
                    cf.llenarCafetera();
                    System.out.println("Capacidad actual de la cafetera: " + cf.getCapacidadActual());
                    Thread.sleep(2000);
                    uts.clearScreen();
                    break;
                case 4:
                    int coffeAmount;
                    System.out.println("Elige cuanto cafe quieres añadir: ");
                    coffeAmount = uts.getInt();
                    cf.agregarCafe(coffeAmount);
                    Thread.sleep(2000);
                    uts.clearScreen();
                    break;
                case 5:
                    System.out.println("Vaciando cafetera...");
                    cf.vaciarCafetera();
                    break;
                case 6:
                    
                    break;
                case 7:
                    break;
                default:

            }
        } while (fChoice != 7);
    }
    
}
