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
public class Ejercicio8 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = multiplicationTable();
        System.out.print(str);
    }

    public String multiplicationTable() {

        int result, choice;

        System.out.print("Elige la tabla de multiplicar que quieres mostrar:  ");
        choice = uts.getInt();

        for (int i = 0; i <= 10; i++) {
            result = choice * i;
            System.out.println(choice + " x " + i + " = " + result);
        }

        return "\n";
    }
}
