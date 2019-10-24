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
public class Ejercicio37 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = lowerCaseCharacters();
        System.out.print(str);
    }
    
    public String lowerCaseCharacters(){
        
        System.out.println("Impresion por pantalla de todos los caracteres en minuscula: ");
        
        for(int i = 97; i <= 122;i++){
            char letters = (char) i;
            System.out.print(letters+ " ");
        }
        
        return "\n";
    }
}
