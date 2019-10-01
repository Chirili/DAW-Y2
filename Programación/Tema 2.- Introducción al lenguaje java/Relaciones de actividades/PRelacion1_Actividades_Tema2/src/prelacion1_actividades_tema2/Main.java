/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Andrés
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws AWTException{
        
            utils uts = new utils();
            
            //Declaracion de las variables
            int choice;
            
            //Declaracion del hashmap
            HashMap <Integer , Ejercicio> ejercicios = new HashMap<>();
            
            /*
            * Instancia de las clases
            */
            Ejercicio1 ej1 = new Ejercicio1();
            Ejercicio2 ej2 = new Ejercicio2();
            Ejercicio3 ej3 = new Ejercicio3();
            Ejercicio4 ej4 = new Ejercicio4();
            Ejercicio5 ej5 = new Ejercicio5();
            Ejercicio6 ej6 = new Ejercicio6();
            Ejercicio7  ej7 = new Ejercicio7();
            
            /*
            * Añadiendo los objetos al hashmap
            */
            ejercicios.put(1, ej1);
            ejercicios.put(2, ej2);
            ejercicios.put(3, ej3);
            ejercicios.put(4, ej4);
            ejercicios.put(5, ej5);
            ejercicios.put(6, ej6);
            ejercicios.put(7, ej7);
            
            //Ejercicio e1 = ejercicios.get(1);
            do{
                
                System.out.print("Elige el numero de ejercicio entre el 1 y el 7 para mostrar o pulsa 0 para salir: ");
                choice = uts.getInt();
                uts.clearScreen();
                
                if (choice != 0 && choice < 8){
                    
                    ejercicios.get(choice).toExecute();
                    String choice2;
                    String eb = "0";
                    
                    do{
                        
                    System.out.print("Pulsa s para ver el siguiente ejercicio, a para ver el ejercicio anterior o 0 para volver a la elección de ejercicios: ");
                    choice2 = uts.getString();
                    uts.clearScreen();
                        if(choice2.equalsIgnoreCase("s") && choice < 8){
                            
                            choice ++;
                            ejercicios.get(choice).toExecute();
                            
                        }else if(choice2.equalsIgnoreCase("a") && choice > 1){
                            
                            choice --;
                            ejercicios.get(choice).toExecute();
                            
                        }else {
                            
                            System.out.println("Numero elegido incorrecto intentalo de nuevo.");
                            
                        }
                    }while(!choice2.equals(eb));
                    
                }
            }while(choice != 0);
            
            System.exit(0);
        }
}
