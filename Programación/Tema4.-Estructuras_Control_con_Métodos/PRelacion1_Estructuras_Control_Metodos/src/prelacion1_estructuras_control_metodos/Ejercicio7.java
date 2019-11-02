/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

/**
 * Realiza un programa que muestre por pantalla los números del 1 al 100 sin mostrar
 * aquellos números múltiplos de 5
 * @author usuario
 */
public class Ejercicio7 {
    public void multiplesOfFive(){
        /*
        * Entramos al bucle y dentro del bucle si el numero es multiplo de 5 no se muesstro y si no
        * lo es se muestra por pantalla.
        */
        for(int i = 0; i <= 100; i++){
            if (i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}
