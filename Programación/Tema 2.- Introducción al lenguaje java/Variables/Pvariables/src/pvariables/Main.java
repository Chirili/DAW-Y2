/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvariables;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
/**
 *
 * @author usuario
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        System.out.println("Ejercicio1: ");
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.Operaciones();
        System.out.println("");
        
        System.out.println("Ejercicio2: ");
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.Nombre();
        System.out.println("");
        
        System.out.println("Ejercicio3: ");
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.Datos();
        System.out.println("");
        
        System.out.println("Ejercicio4: ");
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.eurosPesetas();
        System.out.println("");
        
        System.out.println("Ejercicio5: ");
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.pesetasEuros();
        System.out.println("");
        
        System.out.println("Ejercicio6: ");
        Ejercicio6 ej6 = new Ejercicio6();
        ej6.iva();
    System.exit(0);
    }
    
    
}
