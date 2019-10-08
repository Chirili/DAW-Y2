/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author usuario
 */
public class Ejercicio10 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = Avg();
        System.out.print(str);
    }

    public String Avg() {
        int number = 0, sum = 0, count = 0, result;

        do {
            System.out.print("Elige un numero positivo: ");
            number = uts.getInt();

            if (number > 0) {
                sum += number;
                count++;
            }
        } while (number > 0);

        if (count == 0) {
            System.out.println("Error no se puede realizar la media");
        } else {
            result = sum / count;
            System.out.println("La media de los numeros introducidos es: " + result);
        }

        return "\n";
    }
}
