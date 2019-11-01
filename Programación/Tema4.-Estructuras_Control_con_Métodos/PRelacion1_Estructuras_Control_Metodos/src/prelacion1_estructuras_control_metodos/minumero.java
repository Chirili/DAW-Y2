/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author usuario
 */
public class minumero {

    private int nLength;
    private int nChoice;
    private int partLength;
    private boolean isVampire = false;
    private int index = 0, secondIndex = 0;
    private int finalArr1[] = new int[0];
    private int finalArr2[] = new int[0];

    /*
    * Recogemos el numero que ha introducido el usuario por teclado y lo condicionamos
    * en funcion de la longitud del numero se hara un calculo u otro
     */
    public void selectNumber() {
        Scanner sc = new Scanner(System.in);
        int tusk1, tusk2;

        do {
            System.out.println("Introduce un numero par que sea 4 o mayor que el mismo, para saber si es vampiro o no: ");
            nChoice = sc.nextInt();
            //Variable encarga de recoger la cantidad de digitos que está formado el numero introducido
            nLength = (int) (Math.log10(nChoice) + 1);
            //Switch basico para hacer las operaciones con numeros de hasta 10 cifras maximo, con 12 no se puede porque se pasa del rango maximo de la variable int
            if ((nLength % 2) == 0) {
                switch (nLength) {
                    //Partimos el numero en 2 en funcion de la cantidad de digitos que tenga, para despues operarlos
                    case 4:
                        tusk1 = nChoice / 100;
                        tusk2 = nChoice % 100;
                        calcVampireNumber(tusk1, tusk2);

                        break;
                    case 6:
                        tusk1 = nChoice / 1000;
                        tusk2 = nChoice % 1000;
                        calcVampireNumber(tusk1, tusk2);
                        break;
                    case 8:
                        tusk1 = nChoice / 10000;
                        tusk2 = nChoice % 10000;
                        calcVampireNumber(tusk1, tusk2);
                        break;
                    case 10:
                        tusk1 = nChoice / 10000;
                        tusk2 = nChoice % 10000;
                        calcVampireNumber(tusk1, tusk2);
                    default:

                }
            } else {
                System.out.print("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos correcto");
            }
        } while ((nChoice % 2) != 0 && nChoice > 2);
    }

    public int calcVampireNumber(int tusk1, int tusk2) {
        int possibilities = 1;
        int id = 0, result = 0;
        //Calculamos la cantidad de digitos de una parte, es indistinto cual se coja porque son las dos del mismo tamaño
        partLength = (int) (Math.log10(tusk1) + 1);
        
        for (int i = 1; i <= partLength; i++) {
            possibilities *= i;
        }
        Arrays.fill(finalArr1, 0);
        Arrays.fill(finalArr2, 0);
        
        index = 0;
        secondIndex = 0;
        
        finalArr1 = Arrays.copyOf(finalArr1, possibilities);
        finalArr2 = Arrays.copyOf(finalArr2, possibilities);
        

        //Declaramos el array en funcion del tamaño del colmillo. Ya que va contener todas las combinaciones para ese colmillo.
        int vampireArr1[] = new int[partLength];
        int vampireArr2[] = new int[partLength];

        /*
        * Este bucle lo que hace es hacer un calculo para saber cuantas combinaciones son posibles hacer con la cantidad de digitos
        * del comillo, es decir, si metemos un numero de 4 cifras, serian dos colmillos de 2 cifras y las combinaciones posibles con esos
        * colmillos seria igual a 2*1 que seria igual a 2, lo mismo para un numero de 6 cifras 2 * 3 igual a 6 posibilidades
         */
        int tempArr1[] = new int[0];
        int tempArr2[] = new int[0];

        int vector1 = 0, vector2;

        // Este bucle recibe un colmillo y va separando digito a digito y lo va añadiendo al array declarado anteriormente
        for (int i = 0; i < partLength; i++) {
            vector1 = tusk1 % 10;
            tusk1 = tusk1 / 10;

            vector2 = tusk2 % 10;
            tusk2 = tusk2 / 10;

            vampireArr1[i] = vector1;
            vampireArr2[i] = vector2;

        }
        
        

        permute(vampireArr1, 0, 1);
        permute(vampireArr2, 0, 2);

        for (int i = 0; i <= possibilities-1 ; i++) {
            if (isVampire == true){
                break;
            }
            for (int j = 0; j <= possibilities-1; j++) {
                result = finalArr1[i] * finalArr2[j];

                if (result == nChoice) {
                    System.out.println("El numero introducido es vampiro");
                    isVampire = true;
                    break;
                }
            }
        }

        if (result != nChoice){
            System.out.println("El numero que has introducido no es vampiro");
        }
        return vector1;
    }

    public void permute(int[] a, int k, int id) {
        

        String concat, result = "";
        int finalResult;

        
        
        

        if (k == a.length) {

            for (int i = 0; i < a.length; i++) {
                concat = String.valueOf(a[i]);
                result += concat;
            }
            if (id == 1) {
                finalResult = Integer.parseInt(result);
                finalArr1[index] = finalResult;
                index++;
            } else {
                finalResult = Integer.parseInt(result);
                finalArr2[secondIndex] = finalResult;
                secondIndex++;
            }
        } else {

            for (int i = k; i < a.length; i++) {
                
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                permute(a, k + 1, id);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;

            }

        }
    }
}
