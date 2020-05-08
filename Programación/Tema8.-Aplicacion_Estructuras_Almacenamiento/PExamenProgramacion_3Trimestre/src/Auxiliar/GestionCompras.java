/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Excepciones.NoHayClientes;
import Utils.Utils;
import enums.*;
import java.awt.AWTException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import models.*;
import models.productos.Producto;

import models.productos.tipos.*;

/**
 *
 * @author Andres
 */
public class GestionCompras implements Serializable {

    private static final long serialVersionUID = 6343788812528761581L;

    private HashMap<String, Cliente> comprasClientes;

    //Constructor por defecto
    public GestionCompras() {
        this.comprasClientes = new HashMap<>();
    }

    //Constructor parametrizado
    public GestionCompras(HashMap<String, Cliente> compraClientes) {
        this.comprasClientes = compraClientes;
    }

    //Metodo que realiza compras capturando los datos de distintos metodos
    public void realizarCompra() throws AWTException {
        String dni;

        Utils.clearScreen();
        System.out.println("Datos del cliente:");
        do {
            System.out.print("Introduce tu dni: ");
            dni = Utils.getString();
        } while (!Utils.checkDNI(dni));

        dni = dni.replace(dni.substring(8), dni.substring(8).toUpperCase());

        if (comprasClientes.containsKey(dni)) {
            System.out.println("¡Bienvenido de nuevo " + comprasClientes.get(dni).getNombre() + "!");
            System.out.println("Elige una de las siguientes opciones: ");
            Compra nuevaCompra = crearCompra();
            añadirCompraCliente(dni, nuevaCompra);
        } else {
            System.out.println("!Bienvenido nuevo usuario¡");
            Cliente client = crearCliente(dni);
            Compra nuevaCompra = crearCompra();
            client.añadirCompra(nuevaCompra);
            añadirCliente(dni, client);
        }
    }

    //Metodo encargado de calcular el precio en funcion de la eleccion del usuario
    public void calcularPrecio() throws NoHayClientes, AWTException {
        Utils.clearScreen();
        int dineroRecaudado = 0;
        String findModelo;

        if (comprasClientes.isEmpty()) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }

        if (tabletSmartphoneModelChoice() == 1) {
            findModelo = elegirSmartphone();
        } else {
            findModelo = elegirTablet();
        }

        ArrayList<Cliente> clientes = new ArrayList();
        clientes.addAll(this.comprasClientes.values());

        for (Cliente client : clientes) {
            for (Compra compr : client.getCompras()) {
                for (Producto product : compr.getProductos()) {
                    if (product.getModelo().equalsIgnoreCase(findModelo)) {
                        dineroRecaudado += product.getPrecio();
                    }
                }
            }
        }
        System.out.println("____________________________________________");
        System.out.println("Cantidad de dinero gracias a " + findModelo + ": " + dineroRecaudado);
        System.out.println("____________________________________________");
    }

    //Metodo que muestra los productos que tiene los clientes
    public void mostrarProductosCliente() throws NoHayClientes, AWTException, IOException {
        int clientChoice;
        ArrayList<Cliente> clientes = new ArrayList();

        clientes.addAll(this.comprasClientes.values());
        if (comprasClientes.isEmpty()) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNombre());
        }
        do {
            System.out.print("Selecciona un cliente: ");
            clientChoice = Utils.getInt();

        } while (clientChoice < 0 || (clientChoice - 1) > clientes.size());
        Utils.clearScreen();
        System.out.println(clientes.get(clientChoice - 1).toString());
        System.out.println("Productos comprados:");

        for (Cliente client : clientes) {
            for (Compra compr : client.getCompras()) {
                if (client.getDni().equalsIgnoreCase(clientes.get(clientChoice - 1).getDni())) {
                    compr.getProductos().stream().filter(prod -> prod instanceof Smartphone)
                            .map(prod -> (Smartphone) prod)
                            .map(Producto::toString)
                            .forEach(System.out::print);

                    compr.getProductos().stream().filter(prod -> prod instanceof Tablet)
                            .map(prod -> (Tablet) prod)
                            .map(Producto::toString)
                            .forEach(System.out::println);
                }
            }
        }
        crearFichero(clientes.get(clientChoice-1));
    }

    //Metodo encargado de crear un fichero si el usuario quiere, recibe un cliente por parametro
    private void crearFichero(Cliente c) throws IOException {
        String createFile;
        do {
            System.out.print("¿Quieres guardar una copia de esta información?Escribe si o no: ");
            createFile = Utils.getString();
        } while (!createFile.equalsIgnoreCase("no") && !createFile.equalsIgnoreCase("si"));

        if (createFile.equalsIgnoreCase(createFile)) {
            GestionArchivos.crearTXT(c);
        }
    }

    /**
     * Metodo encargado de crear compras en funcion de la eleccion del usuario
     *
     * @param clientChoice
     * @param uts
     * @return de un objeto Compra
     */
    private Compra crearCompra() {
        String modeloProducto = "";
        String eleccion, msg = "¿Quieres seguir comprando? Escribe no para salir, cualquier otra cosa para continuar: ";
        Compra compra = new Compra();

        if (tabletSmartphoneModelChoice() == 1) {
            do {
                modeloProducto = elegirSmartphone();
                compra.addProducto(crearSmartphone(modeloProducto));
                System.out.print(msg);
                eleccion = Utils.getString();
            } while (!eleccion.equalsIgnoreCase("no"));
            return compra;
        } else {
            do {
                modeloProducto = elegirTablet();
                compra.addProducto(crearTablet(modeloProducto));
                System.out.print(msg);
                eleccion = Utils.getString();
            } while (!eleccion.equalsIgnoreCase("no"));

            return compra;
        }
    }

    /**
     * Metodo encargado de crear una tablet con las caracteristicas elegidas por
     * el usuario
     *
     * @param uts
     * @return de un objecto Tablet con las caracteristicas elegidas por el
     * usuario
     */
    private Tablet crearTablet(String modeloTablet) {
        String color;
        String connection;

        TabletEnum tabletElegida = TabletEnum.stream().filter(tablet -> tablet.getModelo().equalsIgnoreCase(modeloTablet)).findAny().get();

        color = seleccionarColor();

        System.out.println("¿Tiene conexion a internet? Escribe si o no(si se escribe cualquier otra cosa se entendera como NO): ");
        connection = Utils.getString();

        return new Tablet((connection.equalsIgnoreCase("si")), tabletElegida.getPrecio(), color, tabletElegida.getModelo(), tabletElegida.getProveedor());
    }

    /**
     * Metodo encargado de crear un Smartphone con las caracteristicas elegidas
     * por el usuario
     *
     * @param uts
     * @return de un objecto Smartphone con las caracteristicas elegidas por el
     * usuario
     */
    private Smartphone crearSmartphone(String modeloSmartPhone) {
        int battery;
        String color;
        String nfcChoice;

        SmartphoneEnum tabletElegida = SmartphoneEnum.stream().filter(tablet -> tablet.getModelo().equalsIgnoreCase(modeloSmartPhone)).findAny().get();

        color = seleccionarColor();

        System.out.print("¿Tiene NFC? Escribe si o no(si se escribe cualquier otra cosa se entendera como NO): ");
        nfcChoice = Utils.getString();

        do {
            System.out.print("Dime el tamaño de la bateria: ");
            battery = Utils.getInt();
        } while (battery <= 0);

        return new Smartphone((nfcChoice.equalsIgnoreCase("si")), battery, tabletElegida.getPrecio(), color, tabletElegida.getModelo(), tabletElegida.getProveedor());
    }

    /**
     * Pinta las opciones del enum de colores
     *
     * @param uts
     * @return de un String con el nombre del color
     */
    private String seleccionarColor() {
        int colorChoice;
        System.out.println("Selecciona uno de los siguientes colores disponibles: ");
        for (int i = 0; i < Color.values().length; i++) {
            System.out.println((i + 1) + ". " + Color.values()[i].getColor());
        }
        do {
            System.out.print("Selecciona una opcion del menu: ");
            colorChoice = Utils.getInt();
        } while (colorChoice <= 0 || colorChoice > Color.values().length);
        return Color.values()[colorChoice - 1].getColor();
    }

    /**
     * Añade compras a un cliente ya existente
     *
     * @param dni
     * @param c
     */
    private void añadirCompraCliente(String dni, Compra c) {
        comprasClientes.get(dni).añadirCompra(c);
    }

    /**
     * Añade un cliente nuevo
     *
     * @param dni
     * @param cli
     */
    public void añadirCliente(String dni, Cliente cli) {
        comprasClientes.put(dni, cli);
    }

    /**
     * Recoge y crea un Cliente en funcion de los datos introducidos
     *
     * @param dni
     * @return de un objecto Cliente con sus datos correspondientes
     */
    private Cliente crearCliente(String dni) {
        String nombre;
        System.out.print("Porfavor, dime tu nombre: ");
        nombre = Utils.getString();

        return new Cliente(nombre, dni);
    }

    /**
     * Pinta por pantalla las tablets del enum de tablet en un menu
     *
     * @return de un String con el Modelo de la tablet elegida
     */
    public String elegirTablet() {
        int tabletChoice;
        for (int i = 0; i < TabletEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + TabletEnum.values()[i].getModelo() + "/" + TabletEnum.values()[i].getProveedor() + "/ " + TabletEnum.values()[i].getPrecio() + " euros");
        }
        do {
            System.out.print("¿Cual quieres?Introduce un numero: ");
            tabletChoice = Utils.getInt();
        } while (tabletChoice <= 0 && tabletChoice > TabletEnum.values().length);

        return TabletEnum.values()[tabletChoice - 1].getModelo();
    }

    /**
     * Pinta por pantalla los Smartphone del enum de Smartphone en un menu
     *
     * @return de un String con el Modelo de Smartphone elegido
     */
    public String elegirSmartphone() {
        int smartphoneChoice;

        for (int i = 0; i < SmartphoneEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + SmartphoneEnum.values()[i].getModelo() + "/" + SmartphoneEnum.values()[i].getProveedor() + "/ " + SmartphoneEnum.values()[i].getPrecio() + " euros");
        }
        do {
            System.out.print("¿Cual quieres?Introduce un numero: ");
            smartphoneChoice = Utils.getInt();
        } while (smartphoneChoice <= 0 && smartphoneChoice > TabletEnum.values().length);

        return SmartphoneEnum.values()[smartphoneChoice - 1].getModelo();
    }

    /**
     * Pinta por pantalla un menu simple
     *
     * @return de un Int el cual es la eleccion del usuario
     */
    private int tabletSmartphoneModelChoice() {
        int choice;
        do {
            System.out.println("¿Que deseas comprar?");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.print("Eleccion: ");
            choice = Utils.getInt();
        } while (choice != 1 && choice != 2);
        return (choice == 1) ? 1 : 2;
    }
}
