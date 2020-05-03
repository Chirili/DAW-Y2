/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particulos_tienda;

import Utils.Utils;
import exepciones.NoDisponibleException;
import exepciones.NoExisteException;
import models.Articulo;
import models.Tienda;

/**
 *
 * @author Andres
 */
public class TestTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoExisteException, NoDisponibleException {
        int choice = 0;
        Utils uts = new Utils();

        System.out.print("Porfavor introduce el nombre de la tienda: ");
        String nombre = uts.getString();
        Tienda td = new Tienda(nombre);
        do {
            System.out.println("_________________________________________");
            System.out.println("Bienvenid@ al programa gestion de " + td.getNombre() + ":");
            System.out.println("Que deseas hacer: ");
            System.out.println("1. Insertar articulo.");
            System.out.println("2. Buscar articulo.");
            System.out.println("3. Vender articulo.");
            System.out.println("4. Unidades articulo.");
            System.out.println("0. Salir.");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
            switch (choice) {
                case 1:
                    td.insertArticulo(crearArticulo());
                    break;
                case 2:
                    String artName;
                    System.out.print("Introduce el nombre del articulo que quieres buscar: ");
                    artName = uts.getString();
                    try {
                        System.out.println(td.findArticulo(artName).toString());
                    } catch (NoExisteException ex) {
                        System.out.println("El articulo que esta intentando buscar no existe...");
                    }
                    break;
                case 3:
                    int cantidad;
                    System.out.print("Introduce el nombre del articulo que quieres vender: ");
                    nombre = uts.getString();
                    if (td.existArticle(nombre)) {
                        System.out.println("Articulo encontrado:");
                        do {
                            System.out.print("Escribe la cantidad de este articulo que quieres vender: ");
                            cantidad = uts.getInt();
                            if (cantidad <= 0) {
                                System.out.println("No se puede introduce 0 o menos que 0 cantidades");
                            }
                            System.out.println("Precio total de la venta: " + td.vende(nombre, cantidad));
                        } while (cantidad <= 0);
                    } else {
                        System.out.println("No existe el articulo...");
                    }
                    break;
                case 4:
                    System.out.print("Dime el minimo de unidades para buscar: ");
                    cantidad = uts.getInt();
                    td.escribePedido(cantidad);
                    break;
            }
        } while (choice != 0);
    }

    public static Articulo crearArticulo() {
        Utils uts = new Utils();
        String nombre;
        int cantidad;
        double precio;
        System.out.print("Escribe el nombre del articulo: ");
        nombre = uts.getString();
        do {
            System.out.print("Escribe la cantidad de este articulo que quieres añadir: ");
            cantidad = uts.getInt();
            if (cantidad <= 0) {
                System.out.println("No se puede introduce 0 o menos que 0 cantidades");
            }
        } while (cantidad <= 0);
        System.out.print("Escribe el precio del articulo: ");
        precio = uts.getDouble();

        Articulo art = new Articulo(nombre, cantidad, precio);
        return art;
    }
}
