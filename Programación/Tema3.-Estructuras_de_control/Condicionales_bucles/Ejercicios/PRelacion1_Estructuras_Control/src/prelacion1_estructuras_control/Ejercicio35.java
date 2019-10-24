/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

/**
 *
 * @author Andres
 */
public class Ejercicio35 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
     String str = whileLoop();
     System.out.print(str);
    }
    
    public String whileLoop(){
        /*
        * Aqui solo se muestra por pantalla el valor de la variable J, pasa el bucle ya que la condicion no se cumple
        * i siempre va valer 0 por lo tanto el bucle no se ejecuta
        */
        int i=0;
        int j=6;
        while (i<0) {
            i++;
            j++;
        }
        System.out.println(j);
        
        return "\n";
    }
}
