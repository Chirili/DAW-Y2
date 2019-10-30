/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

import java.util.Scanner;

/**
 * Realiza un programa con tres variables de tipo entero, a, by c. El programa deberá mostrar por pantalla el valor menor y mayor.
 * @author Andres
 */
public class Ejercicio4 {
    
    private int a,b,c;
    
    /*
    * Este metodo comprar los valores de las variables con if anidados para dar como resultado
    * el numero o mayor
    */
    public int compareValues(int a, int b, int c){
        
        if(a > b && a > c){
            
            System.out.println("El numero mayor es el de la variable a: "+a);
            
            if (b > c){
                
                System.out.println("El numero menor es el de la variable c: "+c);
                
            }else{
                
                System.out.println("El numero menor es el de la variable b: "+b);
                
            }
        }else if(b > a && b > c){
            
            System.out.println("El numero mayor es el de la variable a: "+b);
            
           if (a > c){
               
               System.out.println("El numero menor es el de la variable c: "+c);
               
           }else {
              
               System.out.println("El numero menor es el de la variable a: "+a);
           }
        }else if(c > a && c > b){
            System.out.println("El numero mayor es el de la variable c: "+c);
            if (a > b){
                
                System.out.println("El numero menor es el de la variable b:" + b);
                
            }else {
                System.out.println("El numero menor es el de la variable a: "+a);
            }
        }else {
            System.out.println("Error: introduce los numeros correctamente para poder compararlos.");
        }
        return 0;
    }
}
