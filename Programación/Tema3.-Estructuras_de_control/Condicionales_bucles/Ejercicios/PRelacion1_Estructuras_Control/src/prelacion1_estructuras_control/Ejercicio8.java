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
public class Ejercicio8 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = calcNumbers();
        System.out.print(str);
    }
    
    public String calcNumbers(){
        
        double nchoice,pow,raiz;
        
        System.out.println("Elige el valor de un numero y se calculara su raiz y potencia siempre que sea mayor que 0: ");
        System.out.print("Elige el valor del numero: ");
        
        nchoice = uts.getDouble();
        
        if (nchoice <= 0 ){
            System.out.println("Error: no se puede realizar la operacion.");
        }else {
            pow = Math.pow(nchoice, nchoice);
            raiz = Math.sqrt(nchoice);
            
            System.out.println("Del numero introducido "+nchoice+" la raiz cuadrada es "+raiz+" y la potencia es "+pow);
        }
        
        return "\n";
    }
}
