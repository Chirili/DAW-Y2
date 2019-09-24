/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plectura_teclado;


import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {
    public static void numerosMuliplicados(){
        Scanner sn = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        
        System.out.print("Escribe el numero 1: ");
        number1 = sn.nextInt();
        System.out.print("Escribe el numero 2: ");
        number2 = sn.nextInt();
        
        result = number1 * number2;
        System.out.println("El resultado de los numero elegidos "+number1+" y "+number2+" es igual a: "+result);
    }
}
