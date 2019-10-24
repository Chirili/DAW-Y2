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
public class Ejercicio27 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = printTenNumbersDoWhile();
        System.out.print(str);
    }
    
    public String printTenNumbersDoWhile(){
        
        System.out.println("Impresion por pantalla con bucle do while de numeros del 1 al 10 y al reves: ");
        
        int i1= 1;
        int i2 = 10;
        
        do {
            System.out.print(i1 + " ");
            i1++;
        }while(i1 <= 10);
        
        System.out.println();
        
        do{
            System.out.print(i2+ " ");
            i2--;
        }while(i2 >=1);
        return "\n";
    }
}
