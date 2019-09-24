/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvariables;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {
    public static void iva(){
        int base = 1500;
        double iva = 1.21;
        double resultado;
        
        resultado = (double) base*iva;
        System.out.println("El resultado del calculo de la base imponible 1500 es: "+resultado);
    }
}
