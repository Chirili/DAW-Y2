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
public class Ejercicio25 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = printTenNumbersFor();
        System.out.print(str);
    }

    public String printTenNumbersFor() {

        System.out.println("Impresion por pantalla con bucle for de numeros del 1 al 10 y al reves: ");

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            
        }
        System.out.println();
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }

        return "\n";
    }
}
