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
public class Ejercicio2 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = greaterLessHundred();
        System.out.print(str);
    }

    public String greaterLessHundred() {

        double nchoice;

        System.out.print("Elige un numero para que pueda decirte si es mayor o menor que 100: ");

        nchoice = uts.getDouble();

        if (nchoice > 100) {
            System.out.println("El numero introducido es mayor que 100.");

        } else if (nchoice < 100) {
            System.out.println("El numero introducido es menor que 100.");
        } else if (nchoice == 100) {
            System.out.println("El numero introducido es exactamente igual a 100.");
        } else {
            System.out.println("Numero introducido no valido.");
        }

        return "\n";
    }

}
