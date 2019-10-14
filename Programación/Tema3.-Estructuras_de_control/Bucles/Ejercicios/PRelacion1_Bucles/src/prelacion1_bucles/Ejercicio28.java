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
public class Ejercicio28 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = calculateFactorial();
        System.out.print(str);
    }

    public String calculateFactorial() {

        int nChoice,
                factorial;

        do {
            System.out.print("Introduce un numero entero: ");
            nChoice = uts.getInt();

            if (nChoice < 0) {
                System.out.println("El número introducido no es correcto.");
            }
        } while (nChoice < 0);

        factorial = nChoice;

        if (nChoice == 0) {
            System.out.println("El factorial del numero introducido " + nChoice + " es 1.");
        } else {
            for (int i = 1; i < nChoice; i++) {
                factorial *= i;
            }

            System.out.println("El numero introducido "+nChoice + " es distinto de " + factorial);
        }
        return "\n";
    }
}

      
    

