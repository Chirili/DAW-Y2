/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_ejercicios_condicionales;

import java.awt.AWTException;
import java.util.HashMap;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Andrés
 */
public class Main extends Application {
    Utils uts = new Utils();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage PrimaryStage) throws AWTException{
        
        int choice;
        
        HashMap <Integer, Iejecicios> ejercicios = new HashMap<>();
        
        Ejercicio1 ej1 = new Ejercicio1();
        Ejercicio2 ej2 = new Ejercicio2();
        Ejercicio3 ej3 = new Ejercicio3();
        Ejercicio4 ej4 = new Ejercicio4();
        Ejercicio5 ej5 = new Ejercicio5();
        
        ejercicios.put(1, ej1);
        ejercicios.put(2, ej2);
        ejercicios.put(3, ej3);
        ejercicios.put(4, ej4);
        ejercicios.put(5, ej5);
        
        
        
         do{
                
                System.out.print("Elige el numero de ejercicio entre el 1 y el 20 para mostrar o pulsa 0 para salir: ");
                choice = uts.getInt();
                uts.clearScreen();
                
                if (choice != 0 && choice < 21){
                    
                    ejercicios.get(choice).toExecute();
                    String choice2;
                    String eb = "0";
                    
                    do{
                        
                    System.out.print("Pulsa s para ver el siguiente ejercicio, a para ver el ejercicio anterior o 0 para volver a la elección de ejercicios: ");
                    choice2 = uts.getString();
                    uts.clearScreen();
                        if(choice2.equalsIgnoreCase("s") && choice < 21){
                            
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
