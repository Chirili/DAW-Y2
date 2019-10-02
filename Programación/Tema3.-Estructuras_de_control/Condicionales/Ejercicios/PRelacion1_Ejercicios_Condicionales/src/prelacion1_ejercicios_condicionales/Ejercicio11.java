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
public class Ejercicio11 implements Iejercicios{
    
    Utils uts = new Utils();
    
    public void toExecute(){
        String str = nightHours();
        System.out.print(str);
    }
    
    public String nightHours(){
        
        int hour,min,totalsecs,night;
        
        System.out.print("Elige la hora: ");
        hour = uts.getInt();
        
        System.out.print("Elige el minuto: ");
        min = uts.getInt();
        
        totalsecs = (hour * 3600) + (min * 60);
        night = (24*3600) - totalsecs;
        
        System.out.println("La cantidad de segundos hasta medianoche son los siguientes: "+night);
        return "\n";
    }
}
