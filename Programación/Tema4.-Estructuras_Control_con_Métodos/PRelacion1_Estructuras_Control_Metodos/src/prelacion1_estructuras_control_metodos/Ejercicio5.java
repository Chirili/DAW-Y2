/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_estructuras_control_metodos;

/**
 * Se desea conocer el lucky number(número de la suerte) de cualquier persona.
 * @author Andres
 */
public class Ejercicio5 {
    private int sDigits,dig1,dig2,dig3,dig4,lNumber,result,nLength;
    
    public void calcLuckyNumber(int day, int month, int year){
        
        sDigits = day+month+year;
        
        dig1 = sDigits%10;
        sDigits = sDigits/10;
        dig2 = sDigits%10;
        sDigits = sDigits/10;
        dig3 = sDigits % 10;
        dig4 = sDigits/10;
        
        lNumber = dig1+dig2+dig3+dig4;
        
        dig1 = 0;
        dig2 = 0;
        nLength = (int) (Math.log10(lNumber) + 1);
        if(nLength == 1){
            dig1 = lNumber;
            System.out.println("Tu numero de la suerte es: "+dig1);
        }else{
         dig1 = lNumber % 10;
         lNumber = lNumber / 10;
         dig2 = lNumber % 10;
         
         result = dig1+dig2;
        System.out.println("Tu numero de la suerte es: "+ result);
        }
    }
}
