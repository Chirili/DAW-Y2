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
public class Ejercicio6 implements Iejecicios {

    Utils uts = new Utils();

    public void toExecute() {
          String str = objectFall();
          System.out.print(str);
    }

    public String objectFall() {
        double h, s;
        final double g = 9.81;
        System.out.print("Elige la altura(metros) desde la que caera el objeto: ");
        h = uts.getDouble();

        if (h <= 0) {
            System.out.println("Error no se puede solucionar el problema. Vuelve a intentarlo. ");
        } else if (h > 0) {
            s = Math.sqrt(2 * h / g);
        }
        return "\n";
    }
}
