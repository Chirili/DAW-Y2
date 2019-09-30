/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion1_actividades_tema2;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
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
    public void start(Stage primaryStage){
        
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
            System.out.print("Elige el ejercicio a mostrar:  ");
            choice = uts.getInt();
            
            ejercicios.get(choice).toExecute();

        }

}
