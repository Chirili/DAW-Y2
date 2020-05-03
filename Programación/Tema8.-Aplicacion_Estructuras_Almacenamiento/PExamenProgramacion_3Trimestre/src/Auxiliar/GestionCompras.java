/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Excepciones.NoHayClientes;
import Utils.Utils;
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

/**
 *
 * @author Andres
 */
public class GestionCompras {

    private double Smartphones;
    private double Tablets;
    private ArrayList<Integer> historico;
    private HashMap<String, Cliente> comprasClientes;

    //Constructor por defecto
    public GestionCompras() {
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
        if (comprasClientes.isEmpty()) {
            throw new NoHayClientes("Vende productos como cliente y podras verlos...");
        }

        ArrayList<Cliente> clientes = new ArrayList();
        clientes.addAll(this.comprasClientes.values());
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNombre());
        }
        do {
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
        for (int i = 0; i < Color.values().length; i++) {
            System.out.println((i + 1) + ". " + Color.values()[i].getColor());
        }
        do {
            System.out.print("Selecciona una opcion del menu: ");
            colorChoice = uts.getInt();
        } while (colorChoice <= 0 || colorChoice > Color.values().length);
        return Color.values()[colorChoice - 1].getColor();
    }

    /**
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
        int choice;
        do {
            System.out.println("¿Que deseas comprar?");
            System.out.println("1. Smartphone");
            System.out.println("2. Tablet");
            System.out.print("Eleccion: ");
            choice = uts.getInt();
        } while (choice != 1 && choice != 2);

        return ((choice == 1) ? 1 : 2);
    }
}
