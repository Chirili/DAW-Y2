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
public class Ejercicio6 implements Iejercicios {

    public void toExecute() {
        String str = subtractionOfTwentyD();
        System.out.print(str);
    }

    public String subtractionOfTwentyD() {

        System.out.println("Mostrar los numero del 320 al 160 con bucle do while restando 20:  ");

        int i = 320;

        do {
            System.out.println(i);
            i -= 20;
        } while (i >= 160);

        return "\n";
    }
}
