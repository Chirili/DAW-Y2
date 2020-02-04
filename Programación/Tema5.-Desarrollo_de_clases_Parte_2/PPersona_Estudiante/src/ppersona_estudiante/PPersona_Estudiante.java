/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersona_estudiante;
import models.*;
/**
 *
 * @author Andres
 */
public class PPersona_Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(12345678,123456);
        Estudiante e2 = new Estudiante();
        e2.capturarPersona();
        e2.capturarEstudiante();
        
        System.out.println("Datos del estudiante 1: ");
        System.out.println(e1);
        System.out.println("Datos del estudiante introducido por teclado: ");
        System.out.println(e2);
    }
    
}
