/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés
 */
public class Ejercicio7 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        try {
            String str = vaultAccessControl();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String vaultAccessControl() throws AWTException {
        int choice, i = 4;
        System.out.println("Control de acceso de la caja fuerte:  ");

        do {
            System.out.print("Por favor introduzca el numero de acceso a la caja fuerte: ");
            choice = uts.getInt();
            i--;
            uts.clearScreen();
            if (choice != 1999) {
                System.out.println("Numero incorrecto por favor intentalo de nuevo. ");
            }
        } while ((i > 0) && (choice != 1999));

        if (i == 0) {
            System.out.println("Mala suerte, solo tenia 4 intentos. Vuelva a intentarlo en otra ocasion. ");

        } else if (choice == 1999 && i > 0) {
            System.out.println("Ha adivinado la combinacion de la caja fuerte ");
        }

        return "\n";
    }

}
