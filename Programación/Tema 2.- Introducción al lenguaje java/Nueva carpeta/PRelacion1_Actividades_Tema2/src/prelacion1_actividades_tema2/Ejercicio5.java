/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
public class Ejercicio5 implements Ejercicio{
    
    public void toExecute(){
        String ej5 = sphereRadio();
        System.out.print(ej5);
    }
    
    public String sphereRadio(){
            System.out.println("Calculo de superficie y volumen de esperfa:  ");
        
            //Declaracion de las variables
            double radio,superficie,volumen;
            
            //Recogida de datos para la variable radio
            System.out.print("Elige el radio de la esfera: ");
            radio = getDouble();
            
            //Operaciones de las variables
            superficie = 4 * Math.PI * Math.pow(radio, 2);
            volumen = (4/3) * Math.PI * Math.pow(radio, 3);
            
            
            return "El radio de la esfera elegido es el siguiente:  "+ radio + "\n La superficie de la esfera es la siguiente: " + superficie + "\n Volumen de la esfera es la siguiente:  "+ volumen;
        }
    public static double getDouble(){
        Scanner gd = new Scanner(System.in);
        return gd.nextDouble();
    }
}
