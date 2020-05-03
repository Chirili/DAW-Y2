/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercasevilla;

import Utils.Utils;
import auxiliar.MercaSevilla;
import models.Venta;
import java.util.ArrayList;
import java.util.HashMap;
import models.PuestoEnum;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Utils uts = new Utils();
        MercaSevilla mercasev = new MercaSevilla();
        do {
            System.out.println("______________________________________________________");
            System.out.println("Bienvenid@ al programa de gestion de MercaSevilla, elige una de las siguientes opciones: ");
            System.out.println("1. Comprar producto");
            System.out.println("2. Mostrar los productos de un cliente en un puesto.");
            System.out.println("3. Mostrar el número de ventas realizadas en un puesto y el total de sus ganancias.");
            System.out.println("4. Mostrar el total que se ha gastado un cliente");
            System.out.println("0.salir");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    mercasev.comprarProducto(uts);
                    break;
                case 2:
                    mercasev.mostrarDatosCliente(uts);
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (choice != 0);
    }
}
