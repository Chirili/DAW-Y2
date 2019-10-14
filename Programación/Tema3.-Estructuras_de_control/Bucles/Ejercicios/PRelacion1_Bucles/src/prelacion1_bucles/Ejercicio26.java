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
public class Ejercicio26 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numberPosition();
        System.out.print(str);
    }

    public String numberPosition() {
        int nChoice,
                digit,
                number,
                length = 0,
                position = 1,
                inverted = 0;

        System.out.print("Introduce un numero entero: ");
        nChoice = uts.getInt();

        System.out.print("Introduce un dígito: ");
        digit = uts.getInt();

        System.out.print("Contando de izquierda a derecha, el " + digit + " aparece dentro de " + nChoice + " en las siguientes posiciones: ");

        number = nChoice;

        if (number == 0) {
            length = 1;
        }

        while (number > 0) {
            inverted = (inverted * 10) + (number % 10);
            number /= 10;
            length++;
        }

        while (inverted > 0) {
            if ((inverted % 10) == digit) {
                System.out.print(position + " ");
            }
            
            inverted /= 10;
            position++;
        }

        return "\n";
    }
}
