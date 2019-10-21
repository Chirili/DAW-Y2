/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio5 implements Iejercicios{
    public void toExecute(){
        String str = randomNumbers();
        System.out.print(str);
    }
    
    public String randomNumbers(){
         for(int i =1; i <= 50; i++){
            System.out.print((int) (Math.random()*100)+99+  " ");
            
        };
        
        return "\n";
    }
}
