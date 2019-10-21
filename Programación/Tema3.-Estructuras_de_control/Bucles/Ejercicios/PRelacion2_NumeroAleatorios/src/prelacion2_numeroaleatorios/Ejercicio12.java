/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Ejercicio12 implements Iejercicios {

    public void toExecute() {

        try {
            String str = matrixScreen();
            System.out.print(str);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String matrixScreen() throws InterruptedException {
        int line = 0;

        for (int i = 0; i < 8000; i++) {
            System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));

            if (line++ == 60) {
                line = 0;
                Thread.sleep(50);
                System.out.println();
            }
        }
        return "\n";
    }
}
