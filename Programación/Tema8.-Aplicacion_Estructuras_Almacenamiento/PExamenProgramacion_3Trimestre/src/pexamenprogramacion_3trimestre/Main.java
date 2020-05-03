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

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, NoHayClientes {
        Utils uts = new Utils();
        int choice;
        GestionCompras gc = new GestionCompras();
        do {
            System.out.println("Bienvenid@ al programa de gestion smartphones y tablets: ");
            System.out.println("1. Vender producto.");
            System.out.println("2. Mostrar los productos de un cliente.");
            System.out.println("3. Dado un producto, mostrar suma que han supuesto todas las ventas de dicho producto.");
            System.out.println("0. Vender producto.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    gc.realizarCompra(uts);
                    break;
                case 2:
                    try {
                        gc.mostrarProductosCliente(uts);
                    } catch (NoHayClientes ex) {
                        System.out.println("Tienes que vender productos para poder mostrarlos");
                    }
                    break;
                case 3:
                    try {
                        gc.calcularPrecio(uts);
                    } catch (NoHayClientes ex) {
                        System.out.println("Tienes que vender productos para ver los precios...");
                    }
                    break;
            }
        } while (choice != 0);
    }
}
