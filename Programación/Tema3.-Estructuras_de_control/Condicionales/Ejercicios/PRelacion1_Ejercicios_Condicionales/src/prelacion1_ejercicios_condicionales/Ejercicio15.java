/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Ejercicio15 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = Pyramid();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio15.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Pyramid() throws AWTException {

        String character;
        int choice;

        System.out.print("Elige el carácter para rellenar la piramide: ");
        character = uts.getString();

        uts.clearScreen();

        System.out.println("Eliga el tipo de piramide que quiere: ");
        System.out.println("1. Piramide con el vertice hacia arriba.");
        System.out.println("2. Piramide con el vertice hacia abajo.");
        System.out.println("3. Piramide con el vertice hacia la derecha.");
        System.out.println("4. Piramide con el vertice hacia la izquierda.");
        System.out.print("Eleccion: ");
        choice = uts.getInt();

        uts.clearScreen();

        switch (choice) {

            case 1:
                System.out.println("");
                System.out.println("  " + character);
                System.out.println(" " + character + character + character);
                System.out.println(character + character + character + character + character);
                break;
            case 2:
                System.out.println("");
                System.out.println(character + character + character + character + character);
                System.out.println(" " + character + character + character);
                System.out.println("  " + character);
                break;
            case 3:
                System.out.println("");
                System.out.println(character);
                System.out.println(character + character);
                System.out.println(character + character + character);
                System.out.println(character + character);
                System.out.println(character);
                break;
            case 4:
                System.out.println("    " + character);
                System.out.println("  " + character + " " + character);
                System.out.println(character + " " + character + " " + character);
                System.out.println("  " + character + " " + character);
                System.out.println("    " + character);
                break;
        }
        return "\n";
    }
}
