/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2examen;

import Utils.Utils;
import models.EntrenadorHM;
import models.FutbolistaHM;
import models.MasajistaHM;

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
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Entrenador ");
            System.out.println("2. Futbolista");
            System.out.println("3. Masajista");
            System.out.println("0. Salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    menuEntrenador();
                    break;
                case 2:
                    menuFutbolista();
                    break;
                case 3:
                    menuMasajista();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuEntrenador() {
        EntrenadorHM ehm = new EntrenadorHM();
        ehm.capturarEntrenadorHM();
        System.out.println(ehm);
        ehm.concentrarse();
        ehm.viajar();
    }

    public static void menuFutbolista() {
        FutbolistaHM fhm = new FutbolistaHM();
        fhm.capturarFutbolistaHM();
        System.out.println(fhm);
        fhm.jugarPartido();
        fhm.concentrarse();
    }

    public static void menuMasajista() {
        MasajistaHM mhm = new MasajistaHM();
        mhm.capturarMasajistaHM();
        System.out.println(mhm);
        mhm.concentrarse();
        mhm.viajar();
    }
}
