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
public class Ejercicio36 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = doWhileLoop();
        System.out.print(str);
    }
    
    public String doWhileLoop(){
        /*
        * Muestra por pantalla el contenido de la variable J el cual es 8, que despues de pasar por el bucle es 9.
        * Entra al bucle y sale de el ya que la condicion es para un numero negativo e i siempre es positivo aqui
        */
        int i=0;
        int j=8;
        do {
            i++;
            j++;
        } while (i<=-1);
        
        System.out.println(j);
        
        return "\n";
    }
}
