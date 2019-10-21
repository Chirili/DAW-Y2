/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author Andres
 */
public class Ejercicio10 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = pairNumbers();
        System.out.print("str");
    }

    public String pairNumbers() {

        int nchoice;

        System.out.print("Elige un numero entero para decirte si es par o impar: ");
        nchoice = uts.getInt();

        if (nchoice == 0) {

            System.out.println("El numero introducido no es par ni impar.");
        } else if ((nchoice % 2) == 0) {

            System.out.println("El numero introducido es par.");

        } else {

            System.out.println("El numero introducido es impar.");
        }

        return "\n";
    }
}
