/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvector_java_alumno;

import models.Alumno;
import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre[] = {"Ramon", "Paco", "Felipe", "Pepe", "Fran"};
        Alumno alumnos[] = new Alumno[10];
        Utils uts = new Utils();
        boolean arrayChecker = true;
        int choice;
        do {
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Generar los alumnos.");
            System.out.println("2. Ver los alumnos.");
            System.out.println("3. Limpiar lista de alumnos.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion : ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < alumnos.length; i++) {
                        int nName = (int) (Math.random() * 4);
                        int nota;
                        nota = (int) (Math.random() * 10);
                        Alumno al1 = new Alumno(nombre[nName], nota);
                        alumnos[i] = al1;
                    }
                    break;
                case 2:

                    for (Alumno al : alumnos) {
                        if (al == null) {
                            arrayChecker = false;
                        }else{
                            arrayChecker = true;
                        }
                    }
                    if (arrayChecker == false) {
                        System.out.println("Error: Genera los alumnos para poder verlos");
                        break;
                    }
                    for (Alumno al : alumnos) {
                        System.out.println("Nombre del alumno: " + al.getNombre());
                        System.out.println("Nota del alumno: " + al.getNota());
                    }
                    break;
                case 3:
                    for (Alumno al : alumnos) {
                        if (al == null) {
                            arrayChecker = false;
                        }
                    }
                    if (arrayChecker == false) {
                        System.out.println("Error: No se puede limpiar la lista de alumnos si no hay alumnos dentro...");
                        break;
                    }
                    for (int i = 0; i < alumnos.length; i++) {
                        alumnos[i] = null;
                    }
                    break;
            }
        } while (choice != 0);
    }

}
