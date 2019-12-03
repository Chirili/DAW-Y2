/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plibros;

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
    public static void main(String[] args) throws CloneNotSupportedException, AWTException {
        Utils ut = new Utils();
        boolean exit = false;
        int userChoice;
        Libro l1 = new Libro("Antonia", "La verdurera", 20, 5);
        Libro l2 = new Libro("Pepe", "Como programar", 19, 18);
        Libro l3 = (Libro) l2.clone();
        do {
            System.out.println("Programa de prestamos y devoluciones de libros:");
            System.out.println("1. Visualizar libros actuales");
            System.out.println("2. Realizar prestamo");
            System.out.println("3. Realizar Devolución");
            System.out.println("4. Salir");
            System.out.print("Eleccion: ");
            userChoice = ut.getInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Libro 1:");
                    System.out.println(l1.toString());
                    System.out.println("Libro 2:");
                    System.out.println(l2.toString());
                    System.out.println("Copia del libro 2:");
                    System.out.println(l3.toString());
                    break;
                case 2:
                    int prestamoChoice;
                    String prestamo;
                    ut.clearScreen();
                    System.out.println("De que libro quieres realizar el prestamo:");
                    System.out.println("1. Nombre del libro: " + l1.getTituloLibro());
                    System.out.println("2. Nombre del libro: " + l2.getTituloLibro());
                    System.out.print("Eleccion: ");
                    prestamoChoice = ut.getInt();
                    switch (prestamoChoice) {
                        case 1:
                            if (l1.prestamo() == true) {
                                System.out.println("El prestamo se ha realizado correctamente.");
                            } else {
                                System.out.println("No se ha podido realizar el prestamo ya que no quedan libros:");
                            }
                            do {
                                System.out.print("¿Deseas realizar otro prestamo? Escribe Si o No: ");
                                prestamo = ut.getString();
                                if (prestamo.equalsIgnoreCase("Si")) {
                                    if (l1.prestamo() == true) {
                                        System.out.println("El prestamo se ha realizado correctamente.");
                                    } else {
                                        System.out.println("No se ha podido realizar el prestamo ya que no quedan libros:");
                                        break;
                                    }
                                }
                            } while (!prestamo.equalsIgnoreCase("no"));
                            break;
                        case 2:
                            if (l2.prestamo() == true) {
                                System.out.println("El prestamo se ha realizado correctamente.");
                            } else {
                                System.out.println("No se ha podido realizar el prestamo ya que no quedan libros:");
                            }
                            do {
                                System.out.print("¿Deseas realizar otro prestamo? Escribe Si o No: ");
                                prestamo = ut.getString();
                                if (prestamo.equalsIgnoreCase("Si")) {
                                    if (l2.prestamo() == true) {
                                        System.out.println("El prestamo se ha realizado correctamente.");
                                    } else {
                                        System.out.println("No se ha podido realizar el prestamo ya que no quedan libros:");
                                        break;
                                    }
                                }
                            } while (!prestamo.equalsIgnoreCase("no"));
                            break;
                        default:

                    }
                    break;
                case 3:
                    int devolucionChoice;
                    String devolucion;
                    ut.clearScreen();
                    System.out.println("De que libro quieres realizar la devolucion:");
                    System.out.println("1. Nombre del libro: " + l1.getTituloLibro());
                    System.out.println("2. Nombre del libro: " + l2.getTituloLibro());
                    System.out.print("Eleccion: ");
                    devolucionChoice = ut.getInt();
                    switch (devolucionChoice) {
                        case 1:
                            if (l1.devolucion() == true) {
                                System.out.println("La devolucion se ha realizado correctamente.");
                            } else {
                                System.out.println("No se ha podido realizar la devolucion ya que estan todos los libros.");
                            }
                            do {
                                System.out.print("¿Deseas realizar otra devolucion? Escribe Si o No: ");
                                devolucion = ut.getString();
                                if (devolucion.equalsIgnoreCase("Si") || devolucion.equalsIgnoreCase("s")) {
                                    if (l1.devolucion() == true) {
                                        System.out.println("La devolucion se ha realizado correctamente.");
                                    } else {
                                        System.out.println("No se ha podido realizar la devolucion ya que estan todos los libros.");
                                        break;
                                    }
                                }
                            } while (!devolucion.equalsIgnoreCase("no"));
                            break;
                        case 2:
                            if (l2.devolucion() == true) {
                                System.out.println("La devolucion se ha realizado correctamente.");
                            } else {
                                System.out.println("No se ha podido realizar la devolucion ya que estan todos los libros.");
                            }
                            do {
                                System.out.print("¿Deseas realizar otro prestamo? Escribe Si o No: ");
                                devolucion = ut.getString();
                                if (devolucion.equalsIgnoreCase("Si")) {
                                    if (l2.devolucion() == true) {
                                        System.out.println("El prestamos se ha realizado correctamente.");
                                    } else {
                                        System.out.println("No se ha podido realizar el prestamo ya que estan todos los libros.");
                                        break;
                                    }
                                }
                            } while (!devolucion.equalsIgnoreCase("no"));
                            break;
                        default:
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
            }
        } while (exit != true);
    }
}
