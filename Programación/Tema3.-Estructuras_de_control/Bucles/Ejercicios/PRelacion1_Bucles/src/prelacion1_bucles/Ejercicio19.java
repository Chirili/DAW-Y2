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
public class Ejercicio19 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Pyramid();
        System.out.print(str);
    }

    public String Pyramid() {

        int height, spaces, chcs = 1;
        String chc;

        System.out.print("Introduce la altura de la piramide: ");
        height = uts.getInt();

        spaces = height - 1;

        System.out.print("Introduce el caracter con el que rellenar la piramide: ");
        chc = uts.getString();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < chcs; j++) {
                System.out.print(chc);
            }
            System.out.println();
            spaces--;
            chcs += 2;
        }

        return "\n";
    }
}
