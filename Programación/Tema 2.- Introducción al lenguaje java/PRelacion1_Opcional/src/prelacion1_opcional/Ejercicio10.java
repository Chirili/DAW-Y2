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
public class Ejercicio10 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = randomLetter();
        System.out.print(str);
    }

    public String randomLetter() {

        int random;
        char letter;
        boolean vocal;

        random = (int) (Math.random() * 26 + 65);
        letter = (char) random;

        switch (letter) {
            case 'A':
                System.out.println("La palabra generada ha sido " + letter + " y es una palabra vocal.");
                break;
            case 'E':
                System.out.println("La palabara generada ha sido " + letter + " y es una palabra vocal.");
                break;
            case 'I':
                System.out.println("La palabara generada ha sido " + letter + " y es una palabra vocal.");
                break;
            case 'O':
                System.out.println("La palabara generada ha sido " + letter + " y es una palabra vocal.");
                break;
            case 'U':
                System.out.println("La palabara generada ha sido " + letter + " y es una palabra vocal.");
                break;
            default:
                System.out.println("La palabara generada ha sido " + letter + " y es una palabra consonante.");
        }

        return "\n";
    }
}
