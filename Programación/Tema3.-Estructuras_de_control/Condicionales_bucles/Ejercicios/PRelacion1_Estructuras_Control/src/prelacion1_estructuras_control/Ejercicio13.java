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
public class Ejercicio13 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = equation2();
        System.out.print(str);
    }

    public String equation2() {

        double a, b, result;

        System.out.println("Introduce el valor de las variables a y b para realizar una operacion matematica: ");

        System.out.print("Introduce el valor de la variable a: ");
        a = uts.getDouble();

        System.out.print("Introduce el valor de la variable b: ");
        b = uts.getDouble();


            result =  (a+5)*3 / 2*b-b;

            System.out.println("El resultado de la operacion matematica realizada es igual a: " + result);
            
        return "\n";
    }

}
