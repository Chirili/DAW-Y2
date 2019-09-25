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
public class Ejercicio10 {
        public static void conversionMB(){
            double mb;
            double resultado;
            
            Scanner sn = new Scanner(System.in);
            System.out.print("Elige la cantidad de MegaBytes a covertir en KiloBytes: ");
            mb = sn.nextDouble();
            
            resultado = mb * 1024;
            System.out.println("La cantidad de MegaBytes seleccionados "+mb+ " convertidos a Kilobytes serian lo siguiente: "+resultado);
    }
}
