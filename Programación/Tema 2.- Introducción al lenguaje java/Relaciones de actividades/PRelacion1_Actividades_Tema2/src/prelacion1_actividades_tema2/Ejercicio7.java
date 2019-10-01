/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
public class Ejercicio7 implements Ejercicio{
    
    utils uts = new utils();
    
    public void toExecute(){
            String str = hoursCalc();
            System.out.print(str);
    }
    public String hoursCalc(){
            System.out.println("Cantidad de horas, dias y semanas de un total de horas:  ");
            
            //Declaracion de variables
            int horas,dias,semanas,total;
    
             System.out.print("Escribe el numero total de horas: ");
             total = uts.getInt();
             
             semanas = total / (24*7);
             dias = total % (24*7) / 24;
             horas = total % 24;
             
             return "Semanas: " + semanas + "\n Dias: " + dias + "\n Horas: "+ horas + "\n";

        }
}
