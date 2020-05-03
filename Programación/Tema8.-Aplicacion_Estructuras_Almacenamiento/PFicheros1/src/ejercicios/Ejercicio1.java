/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class Ejercicio1 {

    public static void ejecutar() {
        //Guardo la ruta donde se está ejecutando este programa para despues concatenarle el nombre del fichero txt
        final String filePath = System.getProperty("user.dir");
        final String nomFichero = filePath + "\\ejercicio1.txt";
        try (FileReader fr = new FileReader(nomFichero)) {

            int valor = fr.read();
            while (valor != -1) {
                //Si el caracter es un espacio no lo escribe
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Error vuelve a intentarlo");
        }
    }
}
