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
public class Ejercicio17 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = integerNumber();
        System.out.print(str);
    }

    public String integerNumber() {

        int number;

        System.out.print("Elige un numero entero para mostrar su ultima cifra: ");
        number = uts.getInt();

        System.out.println("La ultima cifra del numero elegido es la siguiente:  " + (number % 10));

        return "\n";

    }
}
