/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.util.Scanner;

/**
 * Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. 
 * @author Andres
 */
public class Ejercicio3 {

    private int nChoice, nLength, number, armstrongNumber,dig1,dig2,dig3;
    //int[] dig = new int[3];//Declaración del array bidimensional

    /*
    * Este metodo recoge el numero por teclado
     */
    public int selectNumber() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Por favor introduce un numero de tres cifras para saber si es un numero armstrong: ");
            nChoice = sc.nextInt();
            nLength = (int) (Math.log10(nChoice) + 1);
        } while (nLength != 3);
        return nChoice;
    }
    
    /*
    * Metodo encargado de calcular si el numero introducido es armstrong o no
    */
    public int isAmstrongNumber(int nChoice) {

        armstrongNumber = 0;
        number = nChoice; 

        dig3 = nChoice % 10;
        nChoice = nChoice / 10;
        
        dig2 = nChoice % 10;
        nChoice = nChoice / 10;
        
        dig1 = nChoice % 10;
        
        armstrongNumber = (int) (Math.pow(dig1,3)) + (int)(Math.pow(dig2,3)) + (int)(Math.pow(dig3, 3));
         
        
        //Con array bidimensional
        /*
        /*
        * Este bucle for lo que hace es ir añadiendo los numeros troceados del numero introducido
        * a la array bidimensional y luego se van añadiendo a la variable armstrongNumber en la cual
        * se elevan a 3 y se suman
        for (int i = 0; i <= 2; i++) {

            dig[i] = nChoice % 10;
            nChoice = nChoice / 10;

            armstrongNumber += (int) Math.pow(dig[i], 3);
        }
        */
        if (number == armstrongNumber) {
            System.out.print("El numero introducido es un numero armstrong y el resultado del calculo es el siguiente: ");
        } else {
            System.out.print("El numero introducido no es un numero armstrong y el resultado del calculo es el siguiente: ");
        }

        return armstrongNumber;
    }
}
