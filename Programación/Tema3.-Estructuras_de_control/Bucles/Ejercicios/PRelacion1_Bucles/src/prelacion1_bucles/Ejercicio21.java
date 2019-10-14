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
public class Ejercicio21 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {

    }

    public String posNegaNumbers() {

        int nChoice,
                nNumbers = 0,
                oNumbers = 0,
                avgOdd = 0,
                maxPair = 0;

        do {
            System.out.print("Por favor ve introduciendo numeros, el bucle solo terminará si introduce un numero negativo: ");
            nChoice = uts.getInt();

            if (nChoice >= 0) {
                nNumbers++;
                if ((nChoice % 2) == 1) {
                    oNumbers++;
                    avgOdd += nChoice;
                } else {
                    if (nChoice > maxPair) {
                        maxPair = nChoice;
                    }
                }
            }

        } while (nChoice >= 0);
        
        System.out.println("Has introducido  "+nNumbers+" numeros");
        System.out.println("La media de todos los numeros impares introducidos es:  "+avgOdd/nNumbers);
        System.out.println("El maximo numero par introducido es:  "+maxPair);
        
        return "\n";
    }

}
