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
public class Ejercicio26 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
     String str = printTenNumbersWhile();
     System.out.print(str);
    }
    
    public String printTenNumbersWhile(){
        
        System.out.println("Impresion por pantalla con bucle while de numeros del 1 al 10 y al reves: ");
        
        int i1=1,i2=10;
        while(i1 <=10){
            System.out.print(i1+" ");
            i1++;
        }
        
        System.out.println();
        
        while(i2 >= 1){
            System.out.print(i2+" ");
            i2--;
        }
        return "\n";
    }
}
