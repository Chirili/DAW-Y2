/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.lang.reflect.Array;
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
    private int tableWidth;

    /*
    * Recogemos el numero que ha introducido el usuario por teclado y lo condicionamos
    * en funcion de la longitud del numero se hara un calculo u otro
     */
    public void selectNumber() {
        Scanner sc = new Scanner(System.in);
        int vampireNumberPart1, vampireNumberPart2;

        do {
            System.out.println("Introduce un numero par que sea 4 o mayor que el mismo, para saber si es vampiro o no: ");
            nChoice = sc.nextInt();
            //Variable encarga de recoger la cantidad de digitos que está formado el numero introducido
            nLength = (int) (Math.log10(nChoice) + 1);

            if ((nLength % 2) == 0) {
                switch (nLength) {

                    case 4:
                        vampireNumberPart1 = nChoice / 100;
                        vampireNumberPart2 = nChoice % 100;
                        calcVampireNumber(vampireNumberPart1, vampireNumberPart2);

                        break;
                    case 6:
                        vampireNumberPart1 = nChoice / 1000;
                        vampireNumberPart2 = nChoice % 1000;
                        tableWidth = 3;
                        calcVampireNumber(vampireNumberPart1, vampireNumberPart2);
                        break;
                    case 8:
                        break;
                    default:

                }
            } else {
                System.out.println("El numero de digitos introducido no es correcto, prueba a introducir un numero de digitos correcto");
            }
        } while ((nChoice % 2) != 0 && nChoice > 2);
    }

    public int calcVampireNumber(int part1, int part2) {

        int vampireArr1[] = new int[3];

        int vector1 = 0, vector2;

        for (int i = 0; i <= 2; i++) {
            vector1 = part1 % 10;
            part1 = part1 / 10;

            vampireArr1[i] = vector1;

        }
        permute(vampireArr1, 0);

        return vector1;
    }

    public void permute(int[] a, int k) {
        String concat,result = null;
        int finalResult;
        int finalArr1[] = new int[6];
        if (k == a.length) {

            for (int i = 0; i < a.length; i++) {
                System.out.print(" [" + a[i] + "] ");
                concat = String.valueOf(i);
                result += concat;
                
                
            }
            int index = 0;
            finalResult = Integer.parseInt(result);
            finalArr1[index] = finalResult;
            index ++;
            
            System.out.println();

        } else {

            for (int i = k; i < a.length; i++) {
                
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                
                permute(a, k + 1);
                
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;

            }

        }
        for(int i = 0; i<finalArr1.length;i++){
            System.out.println(finalArr1[i]);
        }

    }
}
