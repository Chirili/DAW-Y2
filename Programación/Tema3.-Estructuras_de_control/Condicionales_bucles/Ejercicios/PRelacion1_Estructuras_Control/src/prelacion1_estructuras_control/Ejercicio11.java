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
public class Ejercicio11 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = aBCalcs();
        System.out.print(str);
    }
    
    public String aBCalcs(){
        
        int a,b,rest,division;
        
        System.out.print("Introduce el valor de la variable a: ");
        a = uts.getInt();
        
        System.out.print("Introduce el valor de la variable b: ");
        b = uts.getInt();
        
        division = a  / b;
        rest = a /  (a / b);
        
        System.out.println("El resultado de la división de a entre b es igual a: "+division);
        System.out.println("El resultado de la división de a entre el resto de a entre b es igual a: "+rest);
        
        return "\n";
    }
    
    
}
