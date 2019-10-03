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
public class Ejercicio5 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Equations();
        System.out.print(str);
    }

    public String Equations() {

        double a, b, x;
        System.out.println("Elige el valor de las variables para una ecuacion de primer grado:  ");
        System.out.print("Introduce el valor de a: ");
        a = uts.getDouble();

        System.out.print("Introduce el valor de b: ");
        b = uts.getDouble();

        if (a == 0) {
            System.out.println("Error no se puede solucionar ");
        } else {
            x = b / a;
            System.out.print("La solucion es: " + x);
        }

        return "\n";
    }
}
