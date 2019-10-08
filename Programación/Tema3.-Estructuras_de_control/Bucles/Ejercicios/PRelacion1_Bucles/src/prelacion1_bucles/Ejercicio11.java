/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_bucles;

/**
 *
 * @author usuario
 */
public class Ejercicio11 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = Maths();
        System.out.print(str);
    }
    public String Maths(){
        
        double choice,tpow,twpow;
        
        System.out.println("Mostrar el cuadrado y el cubo de lo numero siguientes al numero introducido: ");
       choice = uts.getDouble();
        for (int i = 0; i <= 5; i++){
            tpow = Math.pow(choice, 3);
            twpow = Math.pow(choice,2);
            choice += 1;
            
            System.out.println("Numero: "+choice+", al cuadrado: "+twpow+", al cubo: "+tpow);
        }
        
        return "\n";
    }
}
