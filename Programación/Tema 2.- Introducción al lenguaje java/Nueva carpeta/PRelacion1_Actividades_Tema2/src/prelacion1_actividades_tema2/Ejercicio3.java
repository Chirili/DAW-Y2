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
public class Ejercicio3 implements Ejercicio{
    
    utils uts = new utils();
    public void toExecute() {
        String str = switchVariableData();
        System.out.println(str);
    }

    public String switchVariableData() {
        
        System.out.println("Intercambio de valores de variables:  ");
        
         // Declaracion de variables
        double a, b, c;
        
        //Recogida del valor de a por pantalla
        System.out.print("Elige el valor de la primera variable: ");
        a = uts.getDouble();
        //Recogida del valor b por pantalla
        System.out.print("Elige el valor de la segunda variable: ");
        b = uts.getDouble();

        c = a;
        a = b;
        b = c;

        return "El valor de la primera variable introducida es el siguiente:  " + a + " y el valor de la segunda variable es el siguiente: " + b;
    }
}
