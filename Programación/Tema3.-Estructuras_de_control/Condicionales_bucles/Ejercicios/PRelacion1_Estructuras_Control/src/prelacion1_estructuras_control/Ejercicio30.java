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
public class Ejercicio30 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = questionLoop();
        System.out.print(str);
    }
    
    public String questionLoop(){
        
        String choice = "";
        
        do {
            System.out.print("¿Desea continuar S/N?: ");
            choice = uts.getString();
            
        }while(!"n".equalsIgnoreCase(choice));
        
        return "\n";
    }
}
