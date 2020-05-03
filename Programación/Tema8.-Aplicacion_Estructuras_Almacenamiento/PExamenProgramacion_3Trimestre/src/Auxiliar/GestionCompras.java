/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Excepciones.NoHayClientes;
import Utils.Utils;
<<<<<<< HEAD
import enums.*;
import java.awt.AWTException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import models.*;
import models.productos.Producto;
import models.productos.tipos.*;
=======
import enums.Color;
import enums.SmartphoneEnum;
import enums.TabletEnum;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import models.Cliente;
import models.Compra;
import models.Producto;
import models.Smartphone;
import models.Tablet;
>>>>>>> 0e7f65b... Added some exercises and  java projects

/**
 *
 * @author Andres
 */
<<<<<<< HEAD
public class GestionCompras implements Serializable {

    private static final long serialVersionUID = 6343788812528761581L;

=======
public class GestionCompras {

    private double Smartphones;
    private double Tablets;
    private ArrayList<Integer> historico;
>>>>>>> 0e7f65b... Added some exercises and  java projects
    private HashMap<String, Cliente> comprasClientes;

    //Constructor por defecto
    public GestionCompras() {
<<<<<<< HEAD
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
=======
        this.comprasClientes = new HashMap<String, Cliente>();
        this.historico = new ArrayList<Integer>();
    }

    //Metodo encargado de realizar la compra y de llamar a los metodo correspondientes
    public void realizarCompra(Utils uts) throws AWTException {
        int clientChoice = clientChoice(uts);
        String dni;

        System.out.println(clientChoice);
        uts.clearScreen();
        do {
            System.out.print("Introduce tu dni: ");
            dni = uts.getString();
        } while (!uts.checkDNI(dni));

        Compra nuevaCompra = crearCompra(clientChoice, uts);
        if (comprasClientes.containsKey(dni)) {
            añadirCompraCliente(dni, nuevaCompra);
        } else {
            Cliente client = crearCliente(uts, dni);
            client.añadirCompra(nuevaCompra);
            añadirCliente(dni, client);
        }
        if (!historico.contains(1)) {
            historico.add(1);
        } else if (!historico.contains(2)) {
            historico.add(2);
        }

    }

    //Metodo encargado de aumentar el precio de los atributos estaticos y de mostrarlos por pantalla
    public void calcularPrecio(Utils uts) throws NoHayClientes {
        int clientChoice = clientChoice(uts);
        if (comprasClientes.isEmpty()) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }
        if (!historico.contains(clientChoice)) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.addAll(this.comprasClientes.values());
        for (int i = 0; i < clientes.size(); i++) {
            for (int j = 0; j < clientes.get(i).getCompras().size(); j++) {
                for (int u = 0; u < clientes.get(i).getCompras().get(j).getProductos().size(); u++) {
                    if (clientes.get(i).getCompras().get(j).getProductos().get(u) instanceof Smartphone) {
                        Smartphone sc = (Smartphone) clientes.get(i).getCompras().get(j).getProductos().get(u);
                        this.Smartphones += sc.getPrecio();
                    } else {
                        Tablet tc = (Tablet) clientes.get(i).getCompras().get(j).getProductos().get(u);
                        this.Tablets += tc.getPrecio();
                    }

                }
            }
        }
        if (clientChoice == 1) {
            System.out.println("Precio total de los smartphones: " + this.Smartphones);
        } else {
            System.out.println("Precio total de las tablets: " + this.Tablets);
        }
    }

    //Metodo encargado de mostrar los productos de un cliente a elegir
    public void mostrarProductosCliente(Utils uts) throws NoHayClientes, AWTException {
        int clientChoice;
>>>>>>> 0e7f65b... Added some exercises and  java projects
        if (comprasClientes.isEmpty()) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }

<<<<<<< HEAD
=======
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.addAll(this.comprasClientes.values());
>>>>>>> 0e7f65b... Added some exercises and  java projects
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNombre());
        }
        do {
<<<<<<< HEAD
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
=======
            System.out.println("Selecciona un cliente: ");
            clientChoice = uts.getInt();

        } while (clientChoice < 0 || (clientChoice - 1) > clientes.size());
        uts.clearScreen();
        System.out.println(clientes.get(clientChoice - 1).toString());
        System.out.println("Productos comprados:");
        for (int j = 0; j < clientes.get(clientChoice - 1).getCompras().size(); j++) {
            for (int u = 0; u < clientes.get(clientChoice - 1).getCompras().get(j).getProductos().size(); u++) {
                if (clientes.get(clientChoice - 1).getCompras().get(j).getProductos().get(u) instanceof Smartphone) {
                    Smartphone sc = (Smartphone) clientes.get(clientChoice - 1).getCompras().get(j).getProductos().get(u);
                    System.out.println(sc.toString());
                } else {
                    Tablet tc = (Tablet) clientes.get(clientChoice - 1).getCompras().get(j).getProductos().get(u);
                    System.out.println(tc.toString());
                }
                System.out.println("___________________________________________________");
            }
        }
    }

    /**
     * Añade compras a un cliente que ya existe
     * @param dni
     * @param c 
     */
    private void añadirCompraCliente(String dni, Compra c) {
        comprasClientes.get(dni).añadirCompra(c);
    }

    /**
     * Añade un cliente nuevo
     * @param dni
     * @param cli 
     */
    public void añadirCliente(String dni, Cliente cli) {
        comprasClientes.put(dni, cli);
    }

    /**
     * Crea un cliente y devulve un objeto de tipo Cliente
     * @param uts
     * @param dni
     * @return 
     */
    private Cliente crearCliente(Utils uts, String dni) {
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre = uts.getString();

        return new Cliente(nombre, dni);
    }

    /**
     * Crea una compra, llama a los metodos correspondientes y devuelve un objeto de tipo Compra
     * @param clientChoice
     * @param uts
     * @return 
     */
    private Compra crearCompra(int clientChoice, Utils uts) {
        String eleccion;
        Compra cpr = new Compra("Tablet");
        switch (clientChoice) {
            case 1:
                do {
                    cpr.addProducto(crearSmartphone(uts));
                    System.out.print("¿Quieres seguir comprando? Escribe no para salir, cualquier otra cosa para continuar: ");
                    eleccion = uts.getString();
                } while (!eleccion.equalsIgnoreCase("no"));
                return cpr;
            case 2:
                do {
                    cpr.addProducto(crearTablet(uts));
                    System.out.print("¿Quieres seguir comprando? Escribe no para salir, cualquier otra cosa para continuar: ");
                    eleccion = uts.getString();
                } while (!eleccion.equalsIgnoreCase("no"));
                return cpr;
            default:
                System.out.println("Error al realizar compra.");
                return null;
        }
    }

    /**
     * Crea y devuelve un objeto de tipo Smartphone
     * @param uts
     * @return 
     */
    private Smartphone crearSmartphone(Utils uts) {
        int sc, battery;
        String color;
        String nfcChoice;

        System.out.println("Selecciona uno de los siguiente smartphones para comprarlo: ");

        for (int i = 0; i < SmartphoneEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + SmartphoneEnum.values()[i].getModelo());
        }

        do {
            System.out.print("Selecciona una opcion: ");
            sc = uts.getInt();
        } while (sc <= 0 || sc > SmartphoneEnum.values().length);
        color = seleccionarColor(uts);
        System.out.println("¿Tiene NFC? Escribe si o no(si se escribe cualquier otra cosa se entendera como NO): ");
        nfcChoice = uts.getString();
        do {
            System.out.print("Dime el tamaño de la bateria: ");
            battery = uts.getInt();
        } while (battery <= 0);
        return new Smartphone((nfcChoice.equalsIgnoreCase("si")) ? true : false, battery, SmartphoneEnum.values()[sc - 1].getPrecio(), color, SmartphoneEnum.values()[sc - 1].getModelo(), SmartphoneEnum.values()[sc - 1].getProveedor());
    }

    /**
     * Selecciona un color del enum y devuelve un String con dicho color
     * @param uts
     * @return 
     */
    private String seleccionarColor(Utils uts) {
        int colorChoice;
>>>>>>> 0e7f65b... Added some exercises and  java projects
        for (int i = 0; i < Color.values().length; i++) {
            System.out.println((i + 1) + ". " + Color.values()[i].getColor());
        }
        do {
            System.out.print("Selecciona una opcion del menu: ");
<<<<<<< HEAD
            colorChoice = Utils.getInt();
=======
            colorChoice = uts.getInt();
>>>>>>> 0e7f65b... Added some exercises and  java projects
        } while (colorChoice <= 0 || colorChoice > Color.values().length);
        return Color.values()[colorChoice - 1].getColor();
    }

    /**
<<<<<<< HEAD
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
=======
     * Crea y devuelve una tablet
     * @param uts
     * @return 
     */
    private Tablet crearTablet(Utils uts) {
        int tc;
        String color;
        String connection;

        System.out.println("Selecciona uno de los siguiente smartphones para comprarlo: ");

        for (int i = 0; i < SmartphoneEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + SmartphoneEnum.values()[i].getModelo());
        }

        do {
            System.out.print("Selecciona una opcion: ");
            tc = uts.getInt();
        } while (tc <= 0 || tc > SmartphoneEnum.values().length);
        color = seleccionarColor(uts);
        System.out.println("¿Tiene conexion a internet? Escribe si o no(si se escribe cualquier otra cosa se entendera como NO): ");
        connection = uts.getString();
        return new Tablet((connection.equalsIgnoreCase("si")) ? true : false, TabletEnum.values()[tc - 1].getPrecio(), color, TabletEnum.values()[tc - 1].getModelo(), TabletEnum.values()[tc - 1].getProveedor());
    }

    /**
     * Devuelve la opcion de si el usuario quiere comprar tablets o smartphones
     * @param uts
     * @return 
     */
    private int clientChoice(Utils uts) {
>>>>>>> 0e7f65b... Added some exercises and  java projects
        int choice;
        do {
            System.out.println("¿Que deseas comprar?");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.print("Eleccion: ");
<<<<<<< HEAD
            choice = Utils.getInt();
        } while (choice != 1 && choice != 2);
        return (choice == 1) ? 1 : 2;
=======
            choice = uts.getInt();
        } while (choice != 1 && choice != 2);

        return ((choice == 1) ? 1 : 2);
>>>>>>> 0e7f65b... Added some exercises and  java projects
    }
}
