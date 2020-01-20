/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pempleado;

import Utils.Utils;
import java.awt.AWTException;
import models.*;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        int choice, userChoice;
        String nif, nombre, apellidos, checkData;
        int horas_extras, num_hijos = 0;
        double sueldo_base, pago_horas_extras;
        boolean casado, hijos;
        Utils uts = new Utils();

        System.out.println("Programa encargado de la gestion de empleados. ");
        System.out.println("A continuación tendrás que introducir toda la informacion referente a tu persona: ");

        do {

            System.out.print("Introduce tu nombre: ");
            nombre = uts.getString();

            System.out.print("Introduce tus apellidos: ");
            apellidos = uts.getString();

            System.out.print("Introduce tu nif: ");
            nif = uts.getString();

            System.out.print("Introduce tu sueldo base: ");
            sueldo_base = uts.getDouble();

            System.out.print("Introduce las horas extras trabajadas: ");
            horas_extras = uts.getInt();

            System.out.print("Introduce el pago por las horas extras trabajadas: ");
            pago_horas_extras = uts.getDouble();

            Persona p = new Persona(nif, nombre, apellidos);
            Empleado ep = new Empleado(sueldo_base, pago_horas_extras, horas_extras, p);

            do {

                System.out.print("¿Estas casado? Escribe si o no: ");
                checkData = uts.getString();

            } while (!checkData.equalsIgnoreCase("si") && !checkData.equalsIgnoreCase("no"));

            if (checkData.equalsIgnoreCase("si")) {
                casado = true;
            } else {
                casado = false;
            }

            p.setCasado(casado);

            do {
                System.out.print("¿Tienes hijos? Escribe si o no: ");
                checkData = uts.getString();
            } while (!checkData.equalsIgnoreCase("si") && !checkData.equalsIgnoreCase("no"));
            if (checkData.equalsIgnoreCase("si")) {
                hijos = true;
                do {
                    System.out.println("¿Cuandos hijos tienes? Escribe un numero: ");
                    num_hijos = uts.getInt();
                } while (num_hijos < 1 || num_hijos > 5);
                p.setNum_hijos(num_hijos);
            } else {
                hijos = false;
            }

            p.setHijos(hijos);

            uts.clearScreen();

            System.out.println("Datos introducidos: ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Nif: " + nif);
            System.out.println("Sueldo base: " + sueldo_base);
            System.out.println("Horas extras trabajadas: " + horas_extras);
            System.out.println("Pago por las horas extras trabajadas: " + horas_extras);

            if (casado == true) {
                System.out.println("Casado: si");
            } else {
                System.out.println("Casado: no");
            }
            if (hijos == true) {
                System.out.println("Tiene hijos: si");
                System.out.println("Numero de hijos: " + num_hijos);
            } else {
                System.out.println("Tiene hijos: no");
            }

            do {
                System.out.print("¿Son correctos estos datos? Escribe si o no: ");
                checkData = uts.getString();
            } while (!checkData.equalsIgnoreCase("si") && !checkData.equalsIgnoreCase("no"));

            uts.clearScreen();
            Empleado ep2 = (Empleado) ep.clone();

            do {
                System.out.println("Elige el empleado a visualizar:");
                System.out.println("1.- Empleado 1");
                System.out.println("2.- Empleado 2");
                System.out.println("3.- Salir");
                System.out.print("Eleccion: ");
                choice = uts.getInt();
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("Que informacion quieres ver: ");
                            System.out.println("1.- Informacion simple ");
                            System.out.println("2.- Informacion completa ");
                            System.out.println("3.- Salir ");
                            System.out.print("Eleccion: ");
                            userChoice = uts.getInt();
                            switch (userChoice) {
                                case 1:
                                    System.out.println("Información simple del primer empleado: ");
                                    ep.println();
                                    break;
                                case 2:
                                    System.out.println("Informacion completa del segundo empleado");
                                    ep.printAll();
                                    break;
                            }
                        } while (userChoice != 3);
                        break;
                    case 2:
                        do {
                            System.out.println("Que informacion quieres ver: ");
                            System.out.println("1.- Informacion simple ");
                            System.out.println("2.- Informacion completa ");
                            System.out.println("3.- Salir ");
                            System.out.print("Eleccion:  ");
                            userChoice = uts.getInt();

                            switch (choice) {
                                case 1:
                                    System.out.println("Informacion simple del segundo empleado: ");
                                    ep2.println();
                                    break;
                                case 2:
                                    System.out.println("Informacion completa del segundo empleado: ");
                                    ep2.printAll();
                                    break;
                            }
                        } while (userChoice != 3);
                        break;
                }
            } while (choice != 3);
        } while (checkData.equalsIgnoreCase("no"));
    }
}
