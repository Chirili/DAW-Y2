/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_numeroaleatorios;

/**
 *
 * @author Andres
 */
public class Ejercicio14 implements Iejercicios{
    Utils uts = new Utils();
    public void toExecute(){
        String str = mindGame();
        System.out.println(str);
    }
    
    public String mindGame(){
        
        int attempts = 5,
              rnumber,
             minNumber=0,
             maxNumber=100,
             isDifferent;
        boolean success = false;
        
        System.out.println("Tienes que pensar en un numero entre el 1 y el 100. Yo tendre que adivinarlo en 5 intentos.");
        
        do {
           rnumber = (int)(Math.random()*(maxNumber-minNumber)+minNumber);
           System.out.println("¿El numero que estas pensando es el "+ rnumber+"?");
           System.out.println("¿El numero que estas pesando es mayor, menor o es el correcto?");
           System.out.print("Inserta 1) Si es mayor, 2) Si es menor o 3) si es igual: ");
           isDifferent = uts.getInt();
           
           attempts --;
           
           if (attempts > 0){
               switch(isDifferent){
                   case 1:
                       minNumber = rnumber + 1;
                       break;
                   case 2:
                       maxNumber = rnumber - 1;
                       break;
                   case 3:
                       success = true;
                       System.out.println("¡He acertado el numero!");
                       break;
               }
           }
           
        }while(!success && (attempts > 0));
        
        if(!success){
            System.out.println("No he conseguido acertarlo esta vez, no te preocupes la proxima vez será distinto");
        }
        
        
        return "\n";
    }
}
