/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;

import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class Ejercicio2 implements Ejercicio {

    
    utils uts = new utils();
    
    public void toExecute() {
        String str = realSum();
        System.out.print(str);
    }

    public String realSum() {

        double numero1, numero2, numero3, total;

        /*
            * Recogida del valor de las variables por pantalla
         */
        System.out.println("Lectura y suma de tres datos de tipo real: ");
        
        System.out.print("Elige el primer numero real: ");
        numero1 = uts.getDouble();
        
        System.out.print("Elige el segundo numero real: ");
        numero2 = uts.getDouble();
        
        System.out.print("Elige el tercer numero real: ");
        numero3 = uts.getDouble();

        /*
            * Mostrar por pantalla el valor de las variables
         */
        System.out.println("Valor del primer numero: " + numero1);
        System.out.println("Valor del segundo numero: " + numero2);
        System.out.println("Valor del tercer numero: " + numero3);

        total = numero1 + numero2 + numero3;

        return " La suma de todos los numeros elegidos es la siguiente:  " + total + "\n";
    }
}
