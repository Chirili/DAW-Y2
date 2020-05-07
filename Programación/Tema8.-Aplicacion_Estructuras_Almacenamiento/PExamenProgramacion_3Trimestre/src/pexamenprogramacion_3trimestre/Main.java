/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pexamenprogramacion_3trimestre;

import Auxiliar.GestionCompras;
import Excepciones.NoHayClientes;
import Utils.Utils;
import java.awt.AWTException;
import java.io.File;
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
    public static void main(String[] args) throws AWTException, NoHayClientes, IOException, FileNotFoundException, ClassNotFoundException {
        Utils uts = new Utils();
        int choice;
        File dataFile = new File("ProgramData.dat");
        GestionCompras gc = loadData(dataFile);

        do {
            System.out.println("Bienvenid@ al programa de gestion smartphones y tablets: ");
            System.out.println("1. Vender producto.");
            System.out.println("2. Mostrar los productos de un cliente.");
            System.out.println("3. Dado un producto, mostrar suma que han supuesto todas las ventas de dicho producto.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    gc.realizarCompra();
                    break;
                case 2:
                    try {
                        gc.mostrarProductosCliente();
                    } catch (NoHayClientes ex) {
                        System.out.println("Tienes que vender productos para poder mostrarlos");
                    }
                    break;
                case 3:
                    try {
                        gc.calcularPrecio();
                    } catch (NoHayClientes ex) {
                        System.out.println("Tienes que vender productos para ver los precios...");
                    }
                    break;
                case 0:
                    try (ObjectOutputStream OOStream = new ObjectOutputStream(new FileOutputStream(dataFile))) {
                        OOStream.writeObject(gc);
                    }
                    break;
            }
        } while (choice != 0);
    }

    //Metodo para cargar el fichero de datos si existe
    public static GestionCompras loadData(File dataFile) throws FileNotFoundException, IOException, ClassNotFoundException {

        try (ObjectInputStream OIStream = new ObjectInputStream(new FileInputStream(dataFile));) {
            GestionCompras gestionData = (GestionCompras) OIStream.readObject();
            return gestionData;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
        }
        return new GestionCompras();
    }
}
