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
public class Ejercicio39 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = mindGame();
        System.out.print(str);
    }

    public String mindGame() {
        int rnumber = (int) (Math.random() * 101);
        int nchoice, lastNumber = 0;
        int attempts = 4;

        System.out.println("Se ha generado un numero aleatorio y tienes que intentar adivinarlo:");

        do {
            System.out.println("Ultimo numero introducido: " + lastNumber);
            System.out.println("Intentos restantes:" + attempts);
            System.out.print("Introduce un numero: ");
            nchoice = uts.getInt();

            if (nchoice > rnumber) {
                System.out.println("El numero que acabas de introducir es mayor que el numero generado. Sigue intentandolo");
                lastNumber = nchoice;
            } else if (nchoice < rnumber) {
                System.out.println("El numero que acabas de introducir es menor que el numero generado. Sigue intentandolo.");
                lastNumber = nchoice;
            }

            attempts--;

        } while (attempts >= 0 && nchoice != rnumber);

        if (nchoice == rnumber) {
            System.out.println("Felicidades has encontrado el numero en el que estaba pensando.");
        }else if (nchoice != rnumber){
            System.out.println("No has acertado el numero pero no pasa nada la proxima vez saldra.");
        }
        return "\n";
    }

}
