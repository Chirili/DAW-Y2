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
public class Ejercicio14 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = number();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String number() throws AWTException {

        int choice;

        System.out.println("Introduce un numero entero para saber si ese numero es par y divisible entre 5:  ");
        System.out.print("Elige un numero: ");
        choice = uts.getInt();

        if ((choice % 2) == 0) {
            
            uts.clearScreen();
            
            System.out.println("El numero introducido es par");
            if ((choice % 5) == 0) {
                System.out.println("El numero introducido tambien divisible entre 5.");
            }
        } else {
            System.out.println("El numero introducido es impar");
        }

        return "";
    }
}
