/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_opcional;

/**
 *
 * @author Andrés
 */
public class Ejercicio9 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = changeVariables();
        System.out.print(str);
    }

    public String changeVariables() {
        double a, b, aux;

        System.out.println("Intercambio de variables:  ");

        System.out.print("Elige el valor de la variable a: ");
        a = uts.getDouble();
        System.out.print("Elige el valor de la variable b: ");
        b = uts.getDouble();

        aux = a;
        b = a;
        a = b;

        System.out.println("La variable A vale ahora: " + a);
        System.out.println("La variable B vale ahora: " + b);

        return "\n";
    }
}
