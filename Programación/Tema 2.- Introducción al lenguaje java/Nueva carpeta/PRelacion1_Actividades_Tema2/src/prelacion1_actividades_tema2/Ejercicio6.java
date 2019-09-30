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
public class Ejercicio6 implements Ejercicio{
    
    utils uts = new utils();
    
    public void toExecute(){
        String ej6 = imsCalc();
        System.out.print("ej6");
    }
    
    public String imsCalc(){
            System.out.println("Calculo del IMS:  ");
            
            //Declaracion de variables
            double peso,altura,ims;
            
            //Recogida de datos de la variable peso
            System.out.print("Elige el peso: ");
            peso =uts. getDouble();
            
            //Recogida de datos de la variable altura
            System.out.print("Elige la altura: ");
            altura = uts.getDouble();
            
            //Operaciones con las variables
            ims = peso/Math.pow(altura, 2);
            
            System.out.println("Su ims total es de:  "+ims);
            
            if (ims >= 18 && ims <= 25) {
                return "Su IMS es saludable ";
            }else {
                return "Su IMS no es saludable ";
            }
            
        }
}
