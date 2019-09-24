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
public class Ejercicio3 {
    public static void conversorPesetas(){
        double pesetas;
        double euros = 166.387;
        double result;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige la cantidad de pesetas a convertir: ");
        pesetas = sn.nextInt();
        
        result = pesetas / euros;
        
        System.out.println("La cantidad de pesetas introducida "+pesetas+" su conversion a euros es la siguiente: "+resultado);
        
    }
}
