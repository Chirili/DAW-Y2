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
public class Ejercicio2 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Hours();
        System.out.print(str);
    }

    public String Hours() {
        int choice;

        System.out.print("Elige una hora: ");
        choice = uts.getInt();

        if (choice >= 6 && choice <= 12) {
            System.out.println("Buenos dias");
        } else if (choice >= 13 && choice <= 20) {
            System.out.println("Buenas tardes ");
        } else if (choice >= 21 && choice <= 23 || choice >= 0 && choice <= 5) {
            System.out.println("Buenas noches ");
        }

        return "\n";
    }
}
