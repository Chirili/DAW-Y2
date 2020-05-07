/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import models.Cliente;
import models.Compra;
import models.productos.Producto;
import models.productos.tipos.Smartphone;
import models.productos.tipos.Tablet;

/**
 *
 * @author Andres
 */
public class GestionArchivos {
    public static void crearTXT(Cliente client) throws IOException{
        File fichero = new File("Datos_"+client.getNombre()+"_"+String.valueOf(LocalDate.now()+".txt"));
        String text = "";
        for(Compra compr: client.getCompras()){
            for(Producto product: compr.getProductos()){
                    if(product instanceof Smartphone){
                        Smartphone s = (Smartphone) product;
                        text += s.toString();
                    }else{
                        Tablet t = (Tablet) product;
                        text += t.toString();
                    }
            }
        }
        escribirFichero(fichero, text);
        System.out.println("Copia guardada en la siguiente ruta: "+fichero.getAbsolutePath());
    }
    private static void escribirFichero(File fichero, String text) throws IOException{
       try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));){
            bw.write(text);
            bw.flush();
        }catch(IOException ex){
            System.out.println("Ha ocurrido un error al escribir el fichero, intentalo de nuevo...");
        }
    }
}
