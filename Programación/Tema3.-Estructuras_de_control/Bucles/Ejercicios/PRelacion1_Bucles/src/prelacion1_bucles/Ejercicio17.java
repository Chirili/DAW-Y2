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
public class Ejercicio17 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = fHundredNumber();
        System.out.print(str);
    }

    public String fHundredNumber() {

        int nchoice, nnumber, result = 0;

        System.out.print("Introduce un numero entero y positivo: ");
        nchoice = uts.getInt();

        nnumber = nchoice;
        
        if (nchoice > 0) {
            for (int i = nchoice; i <= nchoice + 100; i++) {
                
                
                result += i;

            }
        } else {
            System.out.println("Introduce un numero correcto ");
        }
        
        System.out.println("El resultado de la suma de los 100 primero numeros es:  " + result);

        return "\n";
    }

}
