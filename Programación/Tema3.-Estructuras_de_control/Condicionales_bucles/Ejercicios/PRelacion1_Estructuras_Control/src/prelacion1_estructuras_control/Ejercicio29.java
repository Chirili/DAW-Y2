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
public class Ejercicio29 implements Iejercicios{
    public void toExecute(){
        String str = sumTenNumbers();
        System.out.print(str);
    }
    
    public String sumTenNumbers(){
        
        int result = 0;
        for(int i = 1; i <=10; i++){
            result += i;
        }
        
        System.out.println("Resultado de la suma de los numeros del 1 al 10: "+result);
        return "\n";
    }
}
