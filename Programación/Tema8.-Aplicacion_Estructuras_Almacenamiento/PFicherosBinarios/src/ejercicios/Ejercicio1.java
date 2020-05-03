/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import Utils.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Andres
 */
public class Ejercicio1 {
    public void ejecutar() throws IOException{
        System.out.print("Introduce la ruta del primer fichero binario: ");
        String ficheroOrigen = Utils.getString();
        System.out.print("Introduce la ruta del segundo fichero binario: ");
        String ficheroDestino = Utils.getString();
        
        try(FileInputStream fileIStream = new FileInputStream(ficheroOrigen);
                FileOutputStream fileOStream=new FileOutputStream(ficheroDestino)){
            byte bytesFichero[]=new byte[fileIStream.available()];
 
                //Copia todos los bytes del fichero al array
                fileIStream.read(bytesFichero);
 
                //Escribe todos los bytes en el fichero de destino
                fileOStream.write(bytesFichero);
        }catch(IOException ex){
            System.out.println("Error al copiar los ficheros vuelve a intentarlo...");
        }
    }
}
