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
public class Ejercicio5 {
    public static void pesetasEuros(){
        double euros = 166.387;
        double pesetas = 50000;
        double resultado;
        
        resultado = (double) pesetas / euros;
        
        System.out.println("El resultado de la conversion de 50.000 pesetas a euros es la siguiente: "+resultado);
    }
}
