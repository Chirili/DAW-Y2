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
public class Ejercicio19 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = negativeInteger();
        System.out.print(str);
    }

    public String negativeInteger() {

        int number, digits = 0;

        System.out.print("Elige el numero entero de 5 digitos maximos para calcular el numero de digitos: ");
        number = uts.getInt();

        if (number < 10) {
            digits = 1;
        } else if (number >= 10 && number < 100) {
            digits = 2;
        } else if (number >= 100 && number < 1000) {
            digits = 3;
        } else if (number >= 1000 && number < 10000) {
            digits = 4;
        } else if (number >= 10000) {
            digits = 5;
        }

        System.out.println("La cantidad de digitos del numero introducido es la siguiente:  " + digits);
        return "\n";

    }
}
