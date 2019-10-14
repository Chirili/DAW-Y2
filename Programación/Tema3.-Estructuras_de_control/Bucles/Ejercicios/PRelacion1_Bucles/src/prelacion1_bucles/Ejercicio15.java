/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio15 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = mathsPows();
        System.out.print(str);
    }

    public String mathsPows() {

        double base, result;
        int lexponent, exponent;

        System.out.print("Introduce un numero real como base:  ");
        base = uts.getDouble();

        System.out.print("Introduce un numero entero como exponente: ");
        lexponent = uts.getInt();

        for (int i = 1; i <= lexponent; i++) {

            result = 1;
            exponent = i;

            for (int j = 0; j < exponent; j++) {
                result *= base;
            }

            System.out.println(base + "^" + i + " = " + result);
        }
        return "\n";
    }
}
