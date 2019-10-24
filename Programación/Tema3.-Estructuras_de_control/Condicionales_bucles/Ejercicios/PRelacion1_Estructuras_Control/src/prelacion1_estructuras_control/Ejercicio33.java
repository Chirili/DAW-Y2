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
public class Ejercicio33 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = pairOddsNumbers();
        System.out.print(str);
    }
    
    public String pairOddsNumbers(){
        
        double osum=0,oavg=0,psum=0,pavg=0;
        
        for (int i = 0; i <= 200; i+=2){
            psum += i;
            pavg ++;
        }
        for(int i = 1; i <= 200; i+=2){
            osum += i;
            oavg ++;
        }
        
        System.out.println("La suma de todos los numeros pares es igual a: "+psum+" y la media de los mismos es igual a: "+(psum/pavg));
        System.out.println("La suma de todos los numeros pares es igual a: "+osum+" y la media de los mismos es igual a: "+(osum/oavg));
        return "\n";
    }
}
