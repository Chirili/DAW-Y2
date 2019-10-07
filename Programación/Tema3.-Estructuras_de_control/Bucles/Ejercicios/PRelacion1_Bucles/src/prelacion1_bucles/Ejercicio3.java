/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author Andrés
 */
public class Ejercicio3 implements Iejercicios{
    public void toExecute(){
        String str = multiplesOfFiveD();
        System.out.print(str);
    }
    public String multiplesOfFiveD(){
        
        System.out.print("Multiplos de 5 entre el 1 y el 100 con do while:");
        
        int i = 0;
        
        do {
            System.out.println(i);
            i+=5;
        }while(i <= 100);
        
        return "\n";
    }
}
