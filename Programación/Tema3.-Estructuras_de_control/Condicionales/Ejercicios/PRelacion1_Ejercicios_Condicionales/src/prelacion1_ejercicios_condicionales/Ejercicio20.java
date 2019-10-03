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
public class Ejercicio20 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = integerPalindrome();
        System.out.print(str);
    }

    public String integerPalindrome() {

        int number;
        boolean palindrome = false;

        System.out.print("Elige un numero entero maximo 5 cifras para saber si es capicua o no: ");
        number = uts.getInt();

        if (number < 10) {
            palindrome = true;
        }

        if ((number >= 10) && (number < 100)) {
            if ((number / 10) == (number % 10)) {
                palindrome = true;
            }
        }

        if ((number >= 100) && (number < 1000)) {
            if ((number / 100) == (number % 10)) {
                palindrome = true;
            }
        }

        if ((number >= 1000) && (number < 10000)) {
            if (((number / 1000) == (number % 10)) && (((number / 100) % 10) == ((number / 10) % 10))) {
                palindrome = true;
            }
        }

        if (number >= 10000) {
            if (((number / 10000) == (number % 10)) && ((((number / 1000) % 10)) == ((number / 10) % 10))) {
                palindrome = true;
            }
        }

        if (palindrome) {
            System.out.println("El numero introducido es capicua.");
        } else {
            System.out.println("El numero introducido no es capicua.");
        }
        return "\n";
    }
}
