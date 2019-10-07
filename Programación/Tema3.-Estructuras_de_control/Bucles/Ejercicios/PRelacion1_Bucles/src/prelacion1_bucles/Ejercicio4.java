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
public class Ejercicio4 implements Iejercicios {

    public void toExecute() {
        String str = subtractionOfTwentyF();
        System.out.print(str);
    }

    public String subtractionOfTwentyF() {

        System.out.println("Mostrar los numero del 320 al 160 con bucle for restando 20:  ");

        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }

        return "\n";
    }
}
