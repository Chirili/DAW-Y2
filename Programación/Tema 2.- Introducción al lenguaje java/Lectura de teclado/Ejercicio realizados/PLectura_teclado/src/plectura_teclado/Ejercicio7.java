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
public class Ejercicio7 {
    public static void totalFactura(){
        
        System.out.println("Calculo del total de una factura");
        double baseImponible;
        double total;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige la base imponible de la factura: ");
        baseImponible = sn.nextDouble();
        
        total = baseImponible * 1.21;
        System.out.println("El total de la factura a partir de la base imponible "+baseImponible+" es el siguiente: "+total);
    }
}
