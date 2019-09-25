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
public class Ejercicio11 {
    public static void conversionKB(){
            double kb;
            double resultado;
            
            Scanner sn = new Scanner(System.in);
            System.out.print("Elige la cantidad de MegaBytes a covertir en KiloBytes: ");
            kb = sn.nextDouble();
            
            resultado = kb / 1024;
            System.out.println("La cantidad de MegaBytes seleccionados "+kb+ " convertidos a Kilobytes serian lo siguiente: "+resultado);
    }
}
