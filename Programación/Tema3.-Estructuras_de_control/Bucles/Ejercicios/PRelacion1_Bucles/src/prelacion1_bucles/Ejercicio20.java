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
public class Ejercicio20 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = hollowPyramid();
        System.out.print(str);
    }

    public String hollowPyramid() {
        int iHeight, spaces, height = 1, i = 0, hollows = 0;
        String chars;
        System.out.print("Introduce la altura de la piradmide: ");
        iHeight = uts.getInt();

        System.out.print("Introduce un caracter para rellenar la piramide: ");
        chars = uts.getString();

        spaces = iHeight - 1;

        while (height < iHeight) {

            // inserta espacios delante
            for (i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print(chars);
            for (i = 1; i < hollows; i++) {
                System.out.print(" ");
            }

            if (height > 1) {
                System.out.print(chars);
            }

            System.out.println();
            height++;
            spaces--;
            hollows += 2;
        } // while ////////////////////////////

        // base de la pirámide
        for (i = 1; i < height * 2; i++) {
            System.out.print(chars);
        }
        return "\n";
    }
}
