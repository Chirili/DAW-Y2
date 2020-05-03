/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pserializacion;

import java.io.File;
import models.MiObjectOutputStream;
import models.Vehiculo;
import Utils.Utils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File(System.getProperty("user.dir") + "\\vehiculos.ddr");
       
        try {

            Vehiculo vehiculo = crearVehiculo();
            //Si existe el fichero, añadimos el objeto con MiObjectOutputStream, sino lo hacemos con el original
            if (fichero.exists()) {
                MiObjectOutputStream myObjectStream = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                myObjectStream.writeObject(vehiculo);
                myObjectStream.close();
            } else {
                ObjectOutputStream ObjectOStream = new ObjectOutputStream(new FileOutputStream(fichero));
                ObjectOStream.writeObject(vehiculo);
                ObjectOStream.close();
            }

            ObjectInputStream ObjectIStream = new ObjectInputStream(new FileInputStream(fichero));
            muestraDatos(ObjectIStream);

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("fin");
        } catch (IOException e) {
            
        }
    }
    
    public static Vehiculo  crearVehiculo(){
        String marca,matricula,modelo;
        double deposito;
    
        System.out.print("Introduce la matricula del vehiculo: ");
        matricula = Utils.getString();
        System.out.print("Introduce la marca del vehiculo");
        marca  = Utils.getString();
        System.out.print("Introduce el modelo del vehiculo");
        modelo = Utils.getString();
        System.out.print("Introduce la cantidad del vehiculo");
        deposito = Utils.getDouble();
        
        return new Vehiculo(marca,matricula, deposito,modelo);
    }
        public static void muestraDatos(ObjectInputStream ObjectIStream) throws IOException, ClassNotFoundException {
 
        while(true){
            Vehiculo ref=(Vehiculo)ObjectIStream.readObject();
            System.out.println("Vehiculo tiene la matricula: "+ ref.getMatricula()+", su marca es: "+ref.getMarca()+" y su modelo es: "+ref.getModelo());
        }
    }
 
}
