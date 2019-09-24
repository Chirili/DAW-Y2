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
public class Ejercicio4 {
    public static void Operations(){
        int number1;
        int number2;
        double result;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige el primer numero para realizar las operaciones: ");
        number1 = sn.nextInt();
        System.out.print("Elige el segundo numero para realizaciones: ");
        number2 = sn.nextInt();
        
        result = number1+number2;
        System.out.println("La suma de estos numeros es la siguiente: "+result);
        result = number1-number2;
        System.out.println("La resta de estos numeros es la siguiente: "+result);
        result = number1*number2;
        System.out.println("La multiplicacion de estos numeros es la siguiente: "+result);
        result = (double)number1/number2;
        System.out.println("La division de estos numeros es la siguientes: "+result);
    }
}
