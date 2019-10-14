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
public class Ejercicio18 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = takeNumber();
        System.out.print(str);
    }

    public String takeNumber() {

        int fnumber, snumber, aux;

        do {
            System.out.print("Introduce el valor del primer numero: ");
            fnumber = uts.getInt();

            System.out.print("Introduce el valor del segundo numero: ");
            snumber = uts.getInt();

            if (fnumber == snumber) {
                System.out.println("El primero numero y el segundo numero son igual, tienen que ser distintos. ");
            }

        } while (fnumber == snumber);

        if (fnumber > snumber) {
            aux = fnumber;
            fnumber = snumber;
            snumber = aux;
        }

        for (int i = fnumber; i <= snumber; i += 7) {
            System.out.print(i + " ");
        }

        return "\n";
    }
}
