/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author usuario
 */
public class Ejercicio1 implements Iejercicios{
    
    Utils uts = new Utils();
    
//    public void toExecute(){
//        String str = diceSum();
//        System.out.print(str);
//    }
    
    public void toExecute(){
        
        int sum=0,number;
        
        for (int i = 0; i <= 2; i++){
            
            number = (int) (Math.random()*6)+1;
            sum += number;
            System.out.println(number);
            
        }
        
        System.out.println("La tirar de los 3 dados ha dado como resultado la suma de: "+ sum);
    }
}
