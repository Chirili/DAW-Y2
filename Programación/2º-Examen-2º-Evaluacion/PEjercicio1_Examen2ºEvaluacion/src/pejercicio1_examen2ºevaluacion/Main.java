/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pejercicio1_examen2ºevaluacion;

import models.moneda.Moneda;
import models.persona.Persona;
import models.salario.SalariosPaises;
import models.salario.tipos.*;
import Utils.Utils;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        int choice;
        do {
            System.out.println("Bienvenid@ al programa encargado de gestionar salarios, estas apunto de elegir donde se encuentra el trabajador: ");
            System.out.println("Elige de donde es el trabajador: ");
            System.out.println("1. Union Europea.");
            System.out.println("2. Dinamarca.");
            System.out.println("3. Inglaterra.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    menuUnionEuropea();
                    break;
                case 2:
                    menuDinamarca();
                    break;
                case 3:
                    menuInglaterra();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuUnionEuropea() {
        SalariosUE sue = new SalariosUE();
        sue.capturarSalariosUE();
        System.out.println(sue.toString());
    }

    public static void menuDinamarca() {
        Utils uts = new Utils();

        String nacionalizado;
        SalariosDinamarca sd = new SalariosDinamarca();
        do {
            System.out.print("¿Se encuentra nacionalizado en Dinamarca? Escribe si o no: ");
            nacionalizado = uts.getString();
        } while (!nacionalizado.equalsIgnoreCase("si") && !nacionalizado.equalsIgnoreCase("no"));
        if (nacionalizado.equalsIgnoreCase("si")) {
            sd.setNacionalizado(true);
        } else {
            sd.setNacionalizado(false);
        }
        sd.capturarSalariosDinamarca();
        System.out.println(sd.toString());
    }

    public static void menuInglaterra() {
        SalariosInglaterra si = new SalariosInglaterra();
        si.capturarSalariosInglaterra();
        System.out.println(si.toString());
    }
}
