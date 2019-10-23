/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Ejercicio24 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        try {
            String str = operations();
            System.out.print(str);
        } catch (AWTException ex) {
            Logger.getLogger(Ejercicio24.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String operations() throws AWTException{
        
        double fnumber=0,snumber=0,sum,rem,div,mul,result=0;
        String choice;
        
        do {
            System.out.print("Calculadora java, introduce el primer numero: ");
            fnumber = uts.getDouble();
            uts.clearScreen();
            do {
                
                System.out.println("Resultado actual: "+result);
                System.out.println("Que operacion quieres realizar: ");
                System.out.print("S) Suma R) Resta P) Multiplicacion D) Division E) Salir: ");
                choice = uts.getString();
                    
            }while(!"e".equalsIgnoreCase(choice));
            
    
        }while (!"e".equalsIgnoreCase(choice));
        
        return "\n";
    }
}
