/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapato;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils uts = new Utils();
        int modelo, talla;

        System.out.println("Hola, buenas bienvenido al programa encargado de gestionar las compras de zapatos: ");
        do {
            System.out.println("Elige uno de los siguientes modelos:");
            System.out.println("1.- Modelo Ejecutivo.");
            System.out.println("2.- Modelo Premier.");
            System.out.println("3.- Modelo Emperador.");
            System.out.print("Eleccion: ");
            modelo = uts.getInt();
        } while (modelo < 1 || modelo > 3);
        do {
            System.out.println("Ahora vamos a elegir la talla, estas son las que tenemos disponibles:");
            System.out.println("1.- Talla 39.");
            System.out.println("2.- Talla 40.");
            System.out.println("3.- Talla 41.");
            System.out.print("Eleccion:");
            talla = uts.getInt();
        } while (modelo < 1 || modelo > 3);

        
    }

}
