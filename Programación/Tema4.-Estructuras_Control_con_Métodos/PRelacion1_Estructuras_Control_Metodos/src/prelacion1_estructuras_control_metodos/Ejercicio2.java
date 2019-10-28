/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {
    private int count,i;
    
    public void printPairNumbers(){
        //Bucle for para pintar por pantalla el valor de la variable i
        for (i=0;count <5;i+=2){
            //Condiciona la impresion por pantalla del 0
            if(i != 0){
            count++;
            System.out.println(i);
            }
        }
    }
}
