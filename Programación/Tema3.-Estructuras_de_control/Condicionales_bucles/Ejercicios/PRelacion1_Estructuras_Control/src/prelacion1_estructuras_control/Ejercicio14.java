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
public class Ejercicio14 implements Iejercicios{
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = calcArea();
        System.out.print(str);
    }
    
    public String calcArea(){
        
        double length, width;
        
        System.out.print("Introduce la longitud de la habitacion: ");
        length = uts.getDouble();
        
        System.out.print("Introduce la anchura de la habitacion: ");
        width = uts.getDouble();
        
        
        
        
        return "\n";
    }
    
}
