/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_opcional;

/**
 *
 * @author Andrés
 */
public class Ejercicio5 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = calc();
        System.out.print(str);
    }

    public String calc() {

        int num = 5;

        num += num - 1 * 4 + 1;

        System.out.println(num);

        num = 4;
        num %= 7 * num % 3 * 7 >> 1;

        System.out.println(num);

        return "";
    }
    //El programa mostrará dos resultados distintos de la variable num el primero sera: 7, y el segundo resultado sera: 1
}
