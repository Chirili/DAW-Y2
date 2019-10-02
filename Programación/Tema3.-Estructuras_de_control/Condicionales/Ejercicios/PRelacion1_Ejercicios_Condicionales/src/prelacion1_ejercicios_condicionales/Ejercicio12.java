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
    
    public void toExecute(){
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
        System.out.println("1. Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente.");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("3. Ha perdido el interes que mostraba anteriormente por ti");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("4. Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer)");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("5. No te deja que mires la agenda de su telefono movil");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estas tu delante");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("7. �ltimamente se preocupa mas en cuidar la linea y/o estar bronceado/a");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("8. Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("9. Has notado que ultimamente se perfuma mas");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
        System.out.println("Escribe Si o No");
        System.out.print(">");

        choice = uts.getString();
        uts.clearScreen();

        if (choice.equalsIgnoreCase("si")) {
            points = +3;
        }

        if (points >= 0 && points <= 10) {
            System.out.println("Enhorabuena! tu pareja parece ser totalmente fiel. ");
        } else if (points >= 11 && points <= 22) {
            System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia. ");
        } else if (points > 22 && points <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigues que es lo que esta pasando por su cabeza. ");
        }
        return "";
    }
}
