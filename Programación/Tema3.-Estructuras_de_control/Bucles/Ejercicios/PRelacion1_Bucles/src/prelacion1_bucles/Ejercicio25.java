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
public class Ejercicio25 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = invertedNumbers();
        System.out.print(str);
    }

    public String invertedNumbers() {

        int nChoice,
                number,
                inverted=0;
        
        System.out.print("Introduce un numero entero: ");
        nChoice = uts.getInt();

        number = nChoice;

        while (number > 0) {
            inverted = (inverted * 10) + (number % 10);
            number /= 10;
        }

        System.out.println("El numero " + nChoice + " invertido es: " + inverted);

        return "\n";
    }
}
