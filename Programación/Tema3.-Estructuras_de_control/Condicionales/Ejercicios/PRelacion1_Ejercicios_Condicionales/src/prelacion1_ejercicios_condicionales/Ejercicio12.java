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
public class Ejercicio12 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = Questionary();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Questionary() throws AWTException {

        int points = 0;
        String choice;

        System.out.println("Minicuestionario de programacion");
        System.out.println("1. ¿Como se declara una variable de tipo int?");
        System.out.println("a) int = valor; \t" + "b) String= valor; \t" + "c) int = valor");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("a")) {
            points++;
        }

        System.out.println("2. ¿Como se muestra una variable por pantalla?");
        System.out.println("a) System.out.println('variable')\t" + "b) System.out.prinln('hola')\t" + "c) System.out.println(variable)");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("c")) {
            points++;
        }

        System.out.println("3. ¿Como se guarda el valor de una variable en otra?");
        System.out.println("a) variable = variable\t" + "b) Con una variable auxiliar que alamacene temporalmente el valor de la primera variable\t" + "c) No se puede hacer");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("b")) {
            points++;
        }

        System.out.println("4. ¿Cual es la extension de un archivo java?");
        System.out.println("a) .java\t" + "b) .xml\t" + "c) .css");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("a")) {
            points++;
        }

        System.out.println("5. ¿Cual es el mejor IDE para programar java?");
        System.out.println("a) Netbeans\t" + "b) Eclipse\t" + "c) IntelliJ");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("c")) {
            points++;
        } else if (choice.equalsIgnoreCase("b")) {
            points++;
        } else if (choice.equalsIgnoreCase("a")) {
            points--;
        }

        System.out.println("6. ¿Como se instancia una clase?");
        System.out.println("a) variable = 1;\t" + "b) variable = clase;\t" + "c) clase nombredelObjeto = new clase();");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("c")) {
            points++;
        }

        System.out.println("7. ¿Con que se recoge un tado por pantalla?");
        System.out.println("a) System.out\t" + "b) Scanner\t" + "c) a y b son ciertas");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("b")) {
            points++;
        }

        System.out.println("8. ¿Como funciona un if?");
        System.out.println("a) Si la condicion se cumple se ejecuta el codigo entre las llaves\t" + "b) Si no se cumple la condicion se ejecuta el codigo de las llaves\t " + "c) a y b no son ciertas");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("a")) {
            points++;
        }

        System.out.println("9. ¿Como se recoge un dato de tipo String con un scanner?");
        System.out.println("a) variable = nombreScanner.getnextLine();\t" + "b) variable = getString();\t" + "c) Ninguna es correcta");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("a")) {
            points++;
        }

        System.out.println("10. ¿Como se suman dos variables y se muestran por pantalla? ");
        System.out.println("a) No se puede hacer\t" + "b) Ninguna es correcta\t" + "c) variableSuma = variable1 + variable2; System.out.println(variableSuma)");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("c")) {
            points++;
        }

        System.out.println("Tu resultado en el test es el siguiente:  " + points);

        return "\n";
    }
}
