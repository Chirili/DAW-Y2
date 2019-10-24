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
public class Ejercicio28 implements Iejercicios{
    public void toExecute(){
        String str = multiplesOfFive();
        System.out.print(str);
    }
    
    public String multiplesOfFive(){
        
        for (int i = 5;i <= 100; i+=5 ){
            System.out.println(i);
        }
        
        return "\n";
    }
}
