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
public class Ejercicio12 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = equation();
        System.out.print(str);
    }

    public String equation() {

        double a, b, c, div1, div2, result;

        System.out.print("Introduce el valor de las variables a y b para realizar una operacion matematica: ");

        System.out.print("Introduce el valor para la variable a: ");
        a = uts.getDouble();
        System.out.print("Introduce el valor para la variable b: ");
        b = uts.getDouble();
        System.out.print("Introduce el valor para la variable c: ");
        c = uts.getDouble();

        div1 = (a + 7 * c);
        div2 = (b + 2 - a) + 2 * b;

        if (div2 > 0) {
            result = div1 / div2;

            System.out.println("El resultado de la operacion realizada con el valor de las variables introducidas es igual a: " + result);
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        return "\n";
    }
}
