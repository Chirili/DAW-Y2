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
    private int index = 0;
    private int finalArr1[] = new int[0];

    /*
    * Recogemos el numero que ha introducido el usuario por teclado y lo condicionamos
    * en funcion de la longitud del numero se hara un calculo u otro
     */
    public void selectNumber() {
        Scanner sc = new Scanner(System.in);
        int id;

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
                        calcVampireNumber(id = 4, nChoice);

                        break;
                    case 6:
                        calcVampireNumber(id = 6, nChoice);
                        break;
                    case 8:
                        calcVampireNumber(id = 8, nChoice);
                        break;
                    case 10:
                        calcVampireNumber(id = 10, nChoice);
                    default:

                }
            } else {
                System.out.print("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos correcto");
            }
        } while ((nChoice % 2) != 0 && nChoice > 2);
    }

    public int calcVampireNumber(int id, int nChoice) {
        int possibilities = 2;
        int result = 0;
        //Calculamos la cantidad de digitos de una parte, es indistinto cual se coja porque son las dos del mismo tamaño
        for (int i = 3; i <= id; i++){
            possibilities*= i;
        }
        
        Arrays.fill(finalArr1, 0);
        
        index = 0;
        
        finalArr1 = Arrays.copyOf(finalArr1, possibilities);        

        //Declaramos el array en funcion del tamaño del colmillo. Ya que va contener todas las combinaciones para ese colmillo.
        int vampireArr1[] = new int[partLength];

        /*
        * Este bucle lo que hace es hacer un calculo para saber cuantas combinaciones son posibles hacer con la cantidad de digitos
        * del comillo, es decir, si metemos un numero de 4 cifras, serian dos colmillos de 2 cifras y las combinaciones posibles con esos
        * colmillos seria igual a 2*1 que seria igual a 2, lo mismo para un numero de 6 cifras 2 * 3 igual a 6 posibilidades
         */
        int tempArr1[] = new int[0];
        int tempArr2[] = new int[0];

        int vector1 = 0;

        // Este bucle recibe un colmillo y va separando digito a digito y lo va añadiendo al array declarado anteriormente
        for (int i = 0; i < partLength; i++) {

            vampireArr1[i] = vector1;

        }
        
        

        permute(vampireArr1, 0, 1);
        
        return 0;
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
