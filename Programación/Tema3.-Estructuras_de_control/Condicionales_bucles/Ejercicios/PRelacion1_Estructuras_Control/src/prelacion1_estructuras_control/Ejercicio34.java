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
public class Ejercicio34 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = forLoop();
        System.out.print(str);
    }
    
    public String forLoop(){
        /*
        * Este bucle muestra por pantalla el contenido de la variable J el cual es 1 y pasa a 5 cuando termina el bucle
        * Debido a que el bucle se ejecuta 4 y conforme se ejecuta se va incrementando el valor de la variable J
        */
        int j=1;
        for (int i= -13; i<=-10; i++) {
            j++;
        }
        System.out.println(j);
        
        
        return "\n";
    }
}
