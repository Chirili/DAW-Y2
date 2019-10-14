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
public class Ejercicio29 implements Iejercicios {

    Utils uts = new Utils();

    public void toExecute() {
        String str = positiveNumbers();
        System.out.print(str);
    }

    public String positiveNumbers() {
        
        int biggestNumber,
                smallestNumber,
                count = 0,
                sum = 0;
        
        System.out.print("Introduce un numero entero positivo mayor al siguiente numero que vas a introducir: ");
        biggestNumber = uts.getInt();

        System.out.print("Introduce otro número menor que el numero anteriomente introducido: ");
        smallestNumber = uts.getInt();

        System.out.print("Los numeros enteros positivos menores que " + biggestNumber);
        System.out.println(" que no son divisibles entre " + smallestNumber + " son los siguientes:");

        for (int i = 1; i < biggestNumber; i++) {
            if ((i % smallestNumber) != 0) {
                System.out.print(i + " ");
            }
            
        }
       return "\n";
    }
 }
