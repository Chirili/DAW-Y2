/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_opcional;

/**
 *
 * @author Andrés
 */
public class Ejercicio11 implements Iejercicios{
    Utils uts  = new Utils();
    
    public void toExecute(){
        String str = Young();
        System.out.print(str);
    }
    public String Young(){
        int study_lvl,years,income;
        boolean jasp = false;
        
        System.out.print("Elige un numero entero para tu nivel de estudios: ");
        study_lvl = uts.getInt();
        
        System.out.print("Elige un numero entero para tu edad: ");
        years = uts.getInt();
        
        System.out.print("Elige la cantidad de ingresos con un numero entero:  ");
        income = uts.getInt();
        
        if(years <= 28 && study_lvl > 3 || years < 30 && income > 28000){
            jasp = true;
        }else {
            jasp = false;
        }
        
        return "\n";
    }
}
