/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcola_concierto;

import Utils.Utils;
import pcola_concierto.models.*;

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
        Persona[] cola = new Persona[10];
        do {
            System.out.println("Bienvenido al programa de gestion de cola concierto: ");
            System.out.println("1. Nueva persona en la cola.");
            System.out.println("2. Persona accede al recinto.");
            System.out.println("3. Mostrar situacion de la cola.");
            System.out.println("4. Numero de personas en la cola.");
            System.out.println("5. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    Persona p = new Persona();
                    p.capturarPersona();
                    for (int i = 0; i < cola.length; i++) {
                        if (cola[i] == null) {
                            cola[i] = p;
                            System.out.println("Persona añadida a la cola correctamente.");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (cola[0] != null) {
                        cola[0] = null;
                        for (int i = 1; i < cola.length; i++) {
                            Persona auxiliar = new Persona();
                            auxiliar = cola[i];
                            cola[i - 1] = auxiliar;
                            cola[i] = null;
                        }
                    } else {
                        System.out.println("Si no hay personas en la cola, no pueden entrar al recinto...");
                    }
                    break;
                case 3:
                    for (int i = 0; i < cola.length; i++) {
                        if (cola[i] != null) {
                            System.out.println("Puesto en la cola: " + (i + 1));
                            System.out.println(cola[i].toString());
                        }
                    }
                    break;
                case 4:
                    int cPersonas = 0;
                    for (int i = 0; i < cola.length; i++) {
                        if (cola[i] != null) {
                            cPersonas++;
                        }
                    }
                    System.out.println("Cantidad de personas en la cola: " + cPersonas);
                    break;
            }
        } while (choice != 5);
    }

}
