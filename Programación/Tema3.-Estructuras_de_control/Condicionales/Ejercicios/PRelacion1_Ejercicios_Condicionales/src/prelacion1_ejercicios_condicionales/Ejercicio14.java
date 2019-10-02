/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

/**
 *
 * @author usuario
 */
public class Ejercicio14 implements Iejercicios {
    
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = number();
        System.out.print(str);
    }
    
    public String number(){
        
        int choice;
        
        System.out.print("Elige un numero: ");
        choice = uts.getInt();
        
        if((choice % 2) == 0){
            System.out.println("El numero introducido es par");
                if((choice % 5)== 0){
                    System.out.println("El numero introducido tambien divisible entre 5.");
                }
        }else{
            System.out.println("El numero introducido es impar");
        }
        
        return "";
    }
}
