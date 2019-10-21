/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio13 implements Iejercicios {

    public void toExecute() {
        String str = compareDice();
        System.out.print(str);
    }

    public String compareDice() {
        int fdice = 0, sdice = 0;

        do {
            fdice = (int) (Math.random() * 6 + 1);
            sdice = (int) (Math.random() * 6 + 1);

            System.out.println("Resultado del dado1: " + fdice);
            System.out.println("Resultado del dado2: " + sdice);
        } while (fdice != sdice);

        return "\n";
    }
}
