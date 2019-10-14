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
public class Ejercicio22 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = primeNumbers();
        System.out.print(str);
    }

    public String primeNumbers() {

        System.out.println("Todos los numeros primos entre el 2 y el 100:  ");

        boolean isPrimeNumber = false;

        for (int i = 2; i <= 100; i++) {
            
            isPrimeNumber = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                }
            }

            if (isPrimeNumber) {
                System.out.println("El numero  " +i + " es primo.");
            }
        }
        return "\n";
    }

}
