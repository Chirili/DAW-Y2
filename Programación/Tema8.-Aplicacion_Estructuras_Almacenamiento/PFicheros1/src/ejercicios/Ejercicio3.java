/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import Utils.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class Ejercicio3 {

    public void ejecutar() throws FileNotFoundException, IOException {
        System.out.println("Ruta del fichero 1: ");
        File fichero1 = filePath();
        System.out.println("Ruta del fichero 2: ");
        File fichero2 = filePath();
        System.out.println("Ruta en la que se quiere guardar el fichero: ");
        String savePath = pathToSave();
        File ficheroDestino = new File(savePath +"\\"+ fichero1.getName().substring(0, fichero1.getName().length()-4) + "_" + fichero2.getName().substring(0, fichero2.getName().length()-4)+".txt");

        mergeFiles(fichero1, fichero2, ficheroDestino);
    }

    //Se encarga de unir los ficheros
    public void mergeFiles(File fichero1, File fichero2, File destino) throws IOException {
        String choice = "";
        try (BufferedReader bfr1 = new BufferedReader(new FileReader(fichero1));
                BufferedReader bfr2 = new BufferedReader(new FileReader(fichero2));) {

            if (destino.exists()) {
                System.out.print("Ya existe el fichero de destino ¿Deseas sobreescribirlo?Escribe si o no: ");
                choice = Utils.getString();
            }
            if (choice.equalsIgnoreCase("si")) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
                copiarFicheros(bw, bfr1);
                copiarFicheros(bw, bfr2);
            }

        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error inesperado vuelve a intentarlo");
        }
    }
    //Copia el contenido de los ficheros en otro
    public void copiarFicheros(BufferedWriter bw, BufferedReader br) throws IOException {
        String linea = br.readLine();
        while (linea != null) {

            bw.write(linea);

            linea = br.readLine();
        }
        bw.flush();
    }
    //Recoge la ruta en la que se guarda el fichero
    public String pathToSave() {
        String path;
        File folder;
        do {
            System.out.print("Introduce la ruta en la que quieres guardar el fichero(separando directorios por guiones: directorio1-directorio2-directorio3): ");
            path = Utils.getString();
            path = String.valueOf(System.getProperty("user.dir")).substring(0, 2) + "\\" + path.replace('-', '\\');
            folder = new File(path);
            if (!folder.exists()) {
                System.out.println("El directorio introducido no existe intentalo de nuevo...");
            } else {
                if (!folder.isDirectory()) {
                    System.out.println("Eso no es un directorio intentalo de nuevo...");
                }
            }
        } while (!folder.exists() && !folder.isDirectory());
        return path;
    }
    //Recoge la ruta de ficheros
    public File filePath() throws FileNotFoundException {
        String path;
        File fileCreated;

        do {
            System.out.println("Disco en el que se encuentra ejecutando el programa: " + String.valueOf(System.getProperty("user.dir")).substring(0, 2));
            System.out.print("Introduce la ruta del fichero(Separalos con guiones, al final pon el nombre del fichero nada mas, directorio1-directorio2-fichero): ");
            path = Utils.getString();
            path = String.valueOf(System.getProperty("user.dir").substring(0, 2)) + "\\" + path.replace('-', '\\') + ".txt";
            fileCreated = new File(path);
        } while (!fileCreated.exists() || !fileCreated.isFile());

        return fileCreated;
    }
}
