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
                    Thread.sleep(1000);
                    uts.clearScreen();
                    break;
                case 2:
                    System.out.println(cf.getCapacidadActual());
                    Thread.sleep(1000);
                    uts.clearScreen();
                    break;
                case 3:
                    cf.llenarCafetera();
                    System.out.println("Rellenando al maximo la cafetera...");
                    Thread.sleep(1000);
                    uts.clearScreen();
                    break;
                case 4:
                    int coffeAmount;
                    String addCoffeChoice;
                    System.out.print("Elige cuanto cafe quieres añadir: ");
                    coffeAmount = uts.getInt();
                    if (coffeAmount + cf.getCapacidadActual() > 1000) {
                        System.out.println("Estas apunto de añadir mas cafe de la capacidad actual de la cafetera. ¿Estas seguro? Se perderan: " + (coffeAmount + cf.getCapacidadActual() - 1000) + "c.c de cafe.");
                        System.out.print("Escribe si para continuar o no para salir: ");
                        addCoffeChoice = uts.getString();
                        if (addCoffeChoice.equalsIgnoreCase("si")) {
                            System.out.println("Se han desperdiciado " + (coffeAmount + cf.getCapacidadActual() - 1000) + "c.c de cafe...");
                            cf.llenarCafetera();
                            Thread.sleep(1500);
                        } else {
                            do {
                                System.out.println("Capacidad actual de cafe en la cafetera: " + cf.getCapacidadActual() + ".");
                                System.out.print("Tienes que introducir una cantidad de cafe teniendo en cuenta que el valor de arriba mas el tuyo no pueden superar los 1000: ");
                                coffeAmount = uts.getInt();
                            } while (coffeAmount + cf.getCapacidadActual() > 1000);
                        }
                    }
                    cf.agregarCafe(coffeAmount);
                    Thread.sleep(1000);
                    uts.clearScreen();
                    break;
                case 5:
                    System.out.println("Vaciando cafetera...");
                    cf.vaciarCafetera();
                    Thread.sleep(1000);
                    uts.clearScreen();
                    break;
                case 6:
                    uts.clearScreen();
                    int selectCup;
                    int cupsToFill = 0;
                    String fillSelect;
                    if (cf.getCapacidadActual() == 0) {
                        System.out.println("¿Quieres servir cafe sin tenerlo? Por favor rellena la cafetera y vuelve a intentarlo");
                        Thread.sleep(2500);
                        uts.clearScreen();
                        break;
                    } else {
                        do {
                            System.out.println("¿De cuando son las tazas que se van a servir?");
                            System.out.println("1. 100c.c");
                            System.out.println("2. 250c.c");
                            System.out.println("3. 500c.c");
                            System.out.println("0. Salir.");
                            System.out.print("Eleccion de la taza: ");
                            selectCup = uts.getInt();

                            switch (selectCup) {
                                case 1:
                                    System.out.println("Voy a empezar a añadir cafe a las tazas:");
                                    System.out.print("¿Quieres rellenarlas todas? Si o no:");
                                    fillSelect = uts.getString();
                                    if (fillSelect.equalsIgnoreCase("si")) {
                                        for (int i = 1; i < cf.getCapacidadActual(); i++) {
                                            System.out.println("Rellenando la taza " + i + "...");
                                            Thread.sleep(1000);
                                            cf.setCapacidadActual(cf.getCapacidadActual() - 100);
                                            if (cf.getCapacidadActual() < 100 && cf.getCapacidadActual() > 0) {
                                                System.out.println("Vaya la ultima taza no la he podido llenar del todo...");
                                                System.out.println("Solo he podido rellenar: " + cf.getCapacidadActual() + "c.c");
                                                cf.vaciarCafetera();
                                            }
                                        }
                                    } else if (fillSelect.equalsIgnoreCase("no")) {
                                        do {
                                            if ((cf.getCapacidadActual() % 100) == 0) {

                                                System.out.print("¿Cuantas tazas quieres rellenar? Solo puedes rellenar " + cf.getCapacidadActual() / 100 + " tazas: ");
                                            } else {
                                                System.out.print("Cuantas tazas quieres rellenar? Solo puedes rellenar " + cf.getCapacidadActual() / 100 + " tazas y un poco de la ultima: ");
                                            }
                                            cupsToFill = uts.getInt();
                                        } while (cupsToFill > cf.getCapacidadActual() / 100);
                                        for (int i = 1; i <= cupsToFill; i++) {
                                            System.out.println("Rellenando la taza " + i + "...");
                                            Thread.sleep(1000);
                                            cf.setCapacidadActual(cf.getCapacidadActual() - 100);
                                            if (cf.getCapacidadActual() < 100 && cf.getCapacidadActual() > 0) {
                                                System.out.println("Vaya la ultima taza no la he podido llenar del todo...");
                                                System.out.println("Solo he podido rellenar: " + cf.getCapacidadActual());
                                                cf.vaciarCafetera();
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                            }
                        } while (selectCup > 3);
                    }
                    break;
                case 7:
                    break;
                default:

            }
        } while (fChoice != 7);
    }

}
