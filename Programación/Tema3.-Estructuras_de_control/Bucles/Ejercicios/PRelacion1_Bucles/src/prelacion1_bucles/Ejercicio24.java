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
public class Ejercicio24 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numberPyramid();
        System.out.print(str);
    }

    public String numberPyramid() {

        int height = 1,
                i = 0,
                spaces,
                hInput;

        System.out.println("Porgrama para pintar piramides de numeros ");
        System.out.print("Introduce la altura de la piramide: ");
        hInput = uts.getInt();

        spaces = hInput - 1;

        while (height <= hInput) {

            for (i = 1; i < height; i++) {
                System.out.print(i);
            }

            for (i = height; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            height++;
            spaces--;
        }

        return "\n";
    }
}
