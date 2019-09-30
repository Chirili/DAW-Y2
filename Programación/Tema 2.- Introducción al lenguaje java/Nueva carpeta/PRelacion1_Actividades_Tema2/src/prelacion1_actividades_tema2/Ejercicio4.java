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
public class Ejercicio4 implements Ejercicio{
        utils uts = new utils();
        
        
       public void toExecute() {
        String ej4 = studentPercent();
        System.out.println(ej4);
    }
        
    public String studentPercent(){
        
            System.out.println("Porcentaje de niños y niñas de un colegio:  ");
            
            //Declaracion de variables
            int numero_niños, numero_niñas, porcentaje_niñas,porcentaje_niños;
            
            //Recogida de datos para la variable numero_niños
            System.out.print("Introduce el numero de niños del colegio: ");
            numero_niños = uts.getInt();
            
            //Recogida de datos para la variable numero_niñas
            System.out.print("Introduce el numero de niñas del colegio: ");
            numero_niñas = uts.getInt();
            
            // Operaciones con las variables
            porcentaje_niños = numero_niños*100/(numero_niños+numero_niñas);
            porcentaje_niñas = 100 - porcentaje_niños;
            
            return "Porcentaje de niños:  "+porcentaje_niños+"%.\n"+ "Porcentaje de niñas: "+porcentaje_niñas+"%";
        }
}
