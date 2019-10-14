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
public class Ejercicio23 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = numbersSum();
        System.out.print(str);
    }

    public String numbersSum() {
        int cNumbers = 0;
        double nChoice,
                nSum = 0,
                avgNumbers;

        do {
            System.out.print("Porfavor introduce numeros para sumarlos: ");
            nChoice = uts.getDouble();

                cNumbers++;
                nSum += nChoice;

        } while (nSum < 10000);

        System.out.println("El total acumulado de suma de numeros es:  " + nSum);
        System.out.println("La cantidad de numeros introducidos es:  " + cNumbers);
        System.out.println("La media de todos los numeros introducidos es:  " + nSum / cNumbers);

        return "\n";
    }
}
