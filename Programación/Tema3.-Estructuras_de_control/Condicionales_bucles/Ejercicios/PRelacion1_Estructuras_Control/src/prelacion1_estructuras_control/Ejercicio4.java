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
public class Ejercicio4 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = calcNumber();
        System.out.print(str);
    }
    
    public String calcNumber(){
        
        double fnchoice,snchoice;
        
        System.out.println("Introduce el valor de dos numeros para realizar su suma, resta, multiplicacion y division");
        System.out.print("Elige el valor del primer numero: ");
        fnchoice = uts.getDouble();
        
        System.out.print("Elige el valor del segundo numero: ");
        snchoice = uts.getDouble();
        
        System.out .println("La suma de los dos numero introducidos es igual a: "+(fnchoice+snchoice));
        System.out .println("La resta de los dos numero introducidos es igual a: "+(fnchoice-snchoice));
        System.out .println("La multiplicacion de los dos numero introducidos es igual a: "+fnchoice*snchoice);
        System.out .println("La division de los dos numero introducidos es igual a: "+fnchoice/snchoice);
        return "\n";
    }
}
