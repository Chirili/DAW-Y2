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
public class Ejercicio1 implements Iejercicios{
   
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = positiveNegativeNumbers();
        System.out.print(str);
    }
    
    public String positiveNegativeNumbers(){
        
        double nchoice;
        
        System.out.print("Elige un numero para que pueda decirte si es negativo o positivo: ");

        nchoice = uts.getDouble();

        if (nchoice > 0) {
            System.out.println("El numero introducido " + nchoice + " es un numero positivo.");

        } else if (nchoice < 0) {
            System.out.println("El numero introducido " + nchoice + " es un numero negativo.");
        } else {
            System.out.println("El numero introducido no es valido.");
        }
        
        return "\n";
    }
}
