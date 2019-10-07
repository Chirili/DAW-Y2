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
public class Ejercicio1 implements Iejercicios {

    public void toExecute() {
        String str = multipleOfFive();
        System.out.print(str);
    }

    public String multipleOfFive() {
        System.out.println("Mostrar los multiplos de 5 entre el 1 y el 100:   ");

        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        return "\n";
    }

}
