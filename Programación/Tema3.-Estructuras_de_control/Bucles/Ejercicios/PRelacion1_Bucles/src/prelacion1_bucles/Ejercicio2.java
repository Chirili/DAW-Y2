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
public class Ejercicio2 implements Iejercicios {

    public void toExecute() {
           String str = multiplesOfFiveW();
           System.out.print(str);
    }

    public String multiplesOfFiveW() {

        System.out.println("Multiplos de 5 entre el 1 y el 100 con while: ");

        int i = 0;

        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }

        return "\n";
    }
}
