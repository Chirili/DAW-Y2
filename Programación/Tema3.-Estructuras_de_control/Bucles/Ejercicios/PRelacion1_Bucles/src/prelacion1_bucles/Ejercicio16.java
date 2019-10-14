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
public class Ejercicio16 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = primeNumbers();
        System.out.print(str);
    }

    public String primeNumbers() {

        int nchoice;
        boolean primeNumber = true;

        System.out.print("Introduce un numero para saber si es primoo no: ");
        nchoice = uts.getInt();

        for (int i = 2; i < nchoice; i++) {
            if ((nchoice % i) == 0) {
                primeNumber = false;
            }
        }

        if (primeNumber) {
            System.out.println("El numero que has introducido es primo. ");
        } else {
            System.out.println("El numero que has introducido no es primo ");
        }

        return "\n";
    }

}
