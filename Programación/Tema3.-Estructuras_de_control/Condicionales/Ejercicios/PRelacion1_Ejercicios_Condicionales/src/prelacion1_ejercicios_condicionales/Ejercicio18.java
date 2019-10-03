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
public class Ejercicio18 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = integerNumer2();
        System.out.print(str);
    }

    public String integerNumer2() {

        int number, fnumber = 0;

        System.out.print("Elige un numero entero de 5 cifras como maximo: ");
        number = uts.getInt();

        if (number < 10) {
            fnumber = number;
        } else if (number >= 10 && number < 100) {
            fnumber = number / 10;
        } else if (number >= 100 && number < 1000) {
            fnumber = number / 100;
        } else if (number >= 1000 && number < 10000) {
            fnumber = number / 1000;
        } else if (number >= 10000) {
            fnumber = number / 10000;
        }

        System.out.println("La primera cifra del numero introducido es la siguiente:  " + fnumber);
        return "\n";
    }
}
