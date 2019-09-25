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
public class Ejercicio5 {
    public static void areaRectangulo(){
        
        System.out.println("Calculo del area del rectangulo: ");
        
        double base;
        double altura;
        double resultado;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige la base del rectangulo: ");
        base = sn.nextDouble();
        System.out.print("Elige la altura del rectangulo: ");
        altura = sn.nextDouble();
        
        resultado = base * altura;
        System.out.println("El calculo del area del rectangulo realizado con la base "+base+" y la altura "+altura+" da como resultado el siguiente area: "+resultado);
    }
}
