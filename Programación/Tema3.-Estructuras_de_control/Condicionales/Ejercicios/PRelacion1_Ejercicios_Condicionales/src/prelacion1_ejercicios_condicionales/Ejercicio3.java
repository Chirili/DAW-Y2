/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

/**
 *
 * @author Andrés
 */
public class Ejercicio3 implements Iejecicios {

    Utils uts = new Utils();

    public void toExecute() {
            String str = weekDayNames();
            System.out.print(str);
    }

    public String weekDayNames() {

        int choice;

        System.out.print("Elige un dia de la semana entre el 1 y el 7: ");
        choice = uts.getInt();

        if (choice == 1) {
            System.out.print("Lunes ");
        } else if (choice == 2) {
            System.out.print("Martes");
        } else if (choice == 3) {
            System.out.print("Miercoles");
        } else if (choice == 4) {
            System.out.print("Jueves");
        } else if (choice == 5) {
            System.out.print("Viernes");
        } else if (choice == 6) {
            System.out.print("Sabado");
        } else if (choice == 7) {
            System.out.print("Domingo");
        }

        return "\n";
    }
}
