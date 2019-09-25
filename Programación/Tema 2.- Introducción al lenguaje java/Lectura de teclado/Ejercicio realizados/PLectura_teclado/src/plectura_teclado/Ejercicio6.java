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
public class Ejercicio6 {
    public static void areaTriangulo(){
        System.out.println("Calculo del area de un triangulo: ");
        double base;
        double altura;
        double resultado;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Elige la base del triangulo: ");
        base = sn.nextDouble();
        System.out.print("Elige la altura del triangulo: ");
        altura = sn.nextDouble();
        
        resultado = (base * altura)/2;
        System.out.println("El area del triangulo a partir de la base "+base+" y la altura "+altura+" es el siguiente: "+resultado);
    }
}
