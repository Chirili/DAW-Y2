/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import Utils.Utils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class Ejercicio2 {

    public void ejecutar() throws IOException {
        String absolutePathToFile;
        String fileName, text;

        System.out.println("Disco en el que se encuentra ejecutando el programa: " + String.valueOf(System.getProperty("user.dir")).substring(0, 2));
        System.out.print("Introduce la ruta en la que quieres guardar el fichero(Separalos con guiones, tampoco hace falta que introduzcas el nombre del disco: directorio1-directorio2): ");
        String path = Utils.getString();

        absolutePathToFile = String.valueOf(System.getProperty("user.dir").substring(0, 2)) + "\\" + path.replace('-', '\\');

        System.out.print("Introduce el nombre del fichero sin el .txt: ");
        fileName = Utils.getString();
        System.out.print("Introduce el texto a introducir en el fichero: ");
        text = Utils.getString();
        absolutePathToFile += "\\"+fileName + ".txt";
        createFile(absolutePathToFile, invertString(text));
    }

    //Convierte mayusculas en minusculas
    private String invertString(String text) {
        String textInverted = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                textInverted += String.valueOf(text.charAt(i)).toUpperCase();
            } else {
                textInverted += String.valueOf(text.charAt(i)).toLowerCase();
            }
        }
        return textInverted;
    }

    //Crea los ficheros
    private void createFile(String path, String text) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path));){
            bw.write(text);
            bw.flush();
        }catch(IOException ex){
            System.out.println("Ha ocurrido un error al escribir el fichero, intentalo de nuevo...");
        }
    }
}
