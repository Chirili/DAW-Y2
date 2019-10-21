/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio9 implements Iejercicios {

    public void toExecute() {
        String str = pairRandomNumbers();
        System.out.println(str);
    }

    public String pairRandomNumbers() {

        int rnumber = 0, count = 0;

        while (rnumber != 24) {
            rnumber = (int) (Math.random() * 100) + 1;
            System.out.println("El numero generado es el: " + rnumber);
            count++;
        }
        System.out.println("Cantidad de numeros generados para conseguir el numero 24: " + count);
        return "\n";
    }
}
