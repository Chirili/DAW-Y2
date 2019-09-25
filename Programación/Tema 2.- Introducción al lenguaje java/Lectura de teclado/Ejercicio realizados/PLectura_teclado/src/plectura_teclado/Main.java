/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plectura_teclado;

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
        ej1.numerosMuliplicados();
        
        System.out.println("Ejercicio2: ");
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.conversorPesetas();
        
        System.out.println("Ejercicio3: ");
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.conversorPesetas();
        
        System.out.println("Ejercicio4: ");
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.Operations();
        
        System.out.println("Ejercicio5: ");
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.areaRectangulo();
        
        System.out.println("Ejercicio6: ");
        Ejercicio6 ej6 = new Ejercicio6();
        ej6.areaTriangulo();
        
        System.out.println("Ejercicio7: ");
        Ejercicio7 ej7 = new Ejercicio7();
        ej7.totalFactura();
        
        System.out.println("Ejercicio8: ");
        Ejercicio8 ej8 = new Ejercicio8();
        ej8.salarioSemanal();
        
        System.out.println("Ejercicio9: ");
        Ejercicio9 ej9 = new Ejercicio9();
        ej9.volumenCono();
        
        System.out.println("Ejercicio10: ");
        Ejercicio10 ej10 = new Ejercicio10();
        ej10.conversionMB();
        
        System.out.println("Ejercicio11: ");
        Ejercicio11 ej11 = new Ejercicio11();
        ej11.conversionKB();
        
        System.exit(0);
    }
}
