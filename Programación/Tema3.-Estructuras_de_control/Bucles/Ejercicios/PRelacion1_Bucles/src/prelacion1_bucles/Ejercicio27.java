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
public class Ejercicio27 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = multiplesOfThree();
        System.out.print(str);
    }

    public String multiplesOfThree() {

        int nChoice,
              count=0,
                sum=0;
        
        System.out.print("Introduce un numero entero, y porfavor que sea mayor que 1: ");
        nChoice = uts.getInt();


        for (int i = 1; i < nChoice; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.print("\nDesde 1 hasta " + nChoice + " hay " + count);
        System.out.println(" multiplos de 3 y suman " + sum);

        return "\n";
    }

}
