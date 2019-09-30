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
public class Ejercicio1 implements Ejercicio {
    
        utils uts = new utils();
    
    public void toExecute() {
        String str = intMultiplied();
        System.out.println(str);
    }

    public String intMultiplied() {
        
        double numeroElegido, total;
        
        System.out.println("Multiplicacion por dos de un numero elegido: ");
        System.out.print("Elige el numero entero a multiplicar: ");
        /*
        * Recogida de los datos por pantalla y operacion del mismo
        */
        numeroElegido = uts.getDouble();
        total = numeroElegido * 2;
        
        return "El numero elegido " + numeroElegido + " ha sido multiplicado por dos y es igual a : " + total;
        
    }
   
}
