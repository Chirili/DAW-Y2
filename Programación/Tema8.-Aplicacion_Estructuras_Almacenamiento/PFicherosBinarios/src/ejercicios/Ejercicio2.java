/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import Utils.Utils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class Ejercicio2 {

    public void ejecutar() throws FileNotFoundException, IOException {
        int numeros;
        String path;
        File fichero;
        do {
            System.out.print("Introduce el numero de numero aleatorios a crear: ");
            numeros = Utils.getInt();
        } while (numeros <= 0);
        do {

            System.out.println("Introduce la ruta para crear el fichero: ");
            path = Utils.getString();
            fichero = new File(path);
        } while (!fichero.exists());
        crearFichero(numeros, fichero);
    }

    private void crearFichero(int numeros, File fichero) throws IOException {

        try (DataInputStream fileIStream = new DataInputStream(new FileInputStream(fichero));
                DataOutputStream fileOStream = new DataOutputStream(new FileOutputStream(fichero, true))) {

            for (int i = 0; i < numeros; i++) {
                int numero = (int) (Math.random() * 101);
                fileOStream.writeInt(numero);
            }
            
            fileOStream.flush();
            leerFicheroBinario(fileIStream);
        } catch (IOException ex) {
            System.out.println("Error inesperado, vuelve a intentarlo...");
        }
    }

    private void leerFicheroBinario(DataInputStream fileIStream) throws IOException {
        while (true) {
            System.out.println(fileIStream.readInt());
        }
    }
}
