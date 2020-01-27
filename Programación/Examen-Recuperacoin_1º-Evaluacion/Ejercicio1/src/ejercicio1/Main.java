/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Utils.Utils;
import models.Restaurante;

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
        double cantidad;
        Restaurante r = new Restaurante(0, 0);
        do {
            System.out.println("Restaurante Mejicano de Israel");
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("Opciones: ");
            System.out.println("1. Mostrar comensales que pueden atender.");
            System.out.println("2. Añadir papas.");
            System.out.println("3. Añadir chocos.");
            System.out.println("4. Mostrar papas.");
            System.out.println("5. Mostrar chocos.");
            System.out.println("6. Restablecer papas.");
            System.out.println("7. Restablecer chocos.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    System.out.println("Numero de comensales que se pueden atender: " + r.getComensales());
                    break;
                case 2:
                    System.out.print("Numero de papas a añadir: ");
                    cantidad = uts.getDouble();
                    r.addPapas(cantidad);
                    break;
                case 3:
                    System.out.print("Numero de chocos a añadir: ");
                    cantidad = uts.getDouble();
                    r.addChocos(cantidad);
                    break;
                case 4:
                    r.showPapas();
                    break;
                case 5:
                    r.showChocos();
                    break;
                case 6:
                    System.out.print("Porque numero de papas quieres restablecer: ");
                    cantidad = uts.getDouble();
                    r.setPapas(cantidad);
                    break;
                case 7:
                    System.out.print("Porque numero de chocos quieres restablecer: ");
                    cantidad = uts.getDouble();
                    r.setChocos(cantidad);
            }
        } while (choice != 0);
    }

}
