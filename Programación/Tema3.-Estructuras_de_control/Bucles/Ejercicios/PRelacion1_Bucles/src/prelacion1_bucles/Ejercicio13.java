/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio13 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = positiveNumbers();
        System.out.print(str);
    }

    public String positiveNumbers() {

        int choice, positive = 0, negative = 0;

        for (int i = 0; i <= 9; i++) {

            if (i == 0) {

            } else if (i > 0) {
                System.out.println("Cantidad de números introducidos: " + i);
            }

            System.out.print("Escribe 10 números para saber cuantos son negativos y cuanto positivos: ");
            choice = uts.getInt();

            if (choice > 0) {
                positive++;

            } else if (choice < 0) {
                negative++;
            } else if (choice == 0) {
                System.out.println("Este no cuenta listillo ");
            }
        }

        return "Cantidad de números positivos: " + positive + "\n Cantidad de números negativos: " + negative+"\n";
    }
}
