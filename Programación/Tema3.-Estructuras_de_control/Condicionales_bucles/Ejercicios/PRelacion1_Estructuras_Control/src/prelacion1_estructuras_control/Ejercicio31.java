/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author Andres
 */
public class Ejercicio31 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = pairNumbersDoWhile();
        System.out.print(str);
    }

    public String pairNumbersDoWhile() {
        int nchoice;

        do {

            System.out.print("Introduce un numero para decirte si es par o impar: ");
            nchoice = uts.getInt();

            if (nchoice == 0) {
                System.out.println("Introduce un numero correcto.");
            } else if ((nchoice % 2) == 0) {

                System.out.println("El numero introducido es par.");

            } else {

                System.out.println("El numero introducido es impar.");
            }
        } while (nchoice == 0);
        return "\n";
    }

}
