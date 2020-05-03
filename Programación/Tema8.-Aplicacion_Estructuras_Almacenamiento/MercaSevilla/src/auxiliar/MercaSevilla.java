/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import Utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import models.Productos.Producto;
import models.Productos.Tipos.*;
import models.PuestoEnum;
import models.Venta;
import models.cliente.Cliente;

/**
 *
 * @author Andres
 */
public class MercaSevilla {

    ArrayList<Venta> ventas;

    //Constructor por defecto
    public MercaSevilla() {
        this.ventas = new ArrayList();
    }

    public void comprarProducto(Utils uts) {
        Venta aVenta = crearVenta(uts);

        añadirVentas(aVenta);
    }

    private void añadirVentas(Venta venta) {
        if (this.ventas.stream().anyMatch(vent -> vent.getClient().getDNI().equalsIgnoreCase(venta.getClient().getDNI()))) {
            for (int i = 0; i < ventas.size(); i++) {
                if (this.ventas.get(i).getClient().getDNI().equalsIgnoreCase(venta.getClient().getDNI()) && this.ventas.get(i).getIdentificadorPuesto() == venta.getIdentificadorPuesto()) {
                    this.ventas.get(i).getClient().añadirProductos(venta.getClient().getProductos().get(0));
                } else {
                    this.ventas.add(venta);
                }
            }
        } else {
            this.ventas.add(venta);
        }
    }

    public void mostrarDatosCliente(Utils uts) {
        int puestoAVer = getPuestoVenta(uts);
        String dni;
        System.out.print("Introduce el nif del cliente que quieres ver: ");
        dni = uts.getString();
        for (int i = 0; i < ventas.size(); i++) {
            if (this.ventas.get(i).getIdentificadorPuesto() == puestoAVer && this.ventas.get(i).getClient().getDNI().equalsIgnoreCase(dni)) {
                for (int j = 0; j < this.ventas.get(i).getClient().getProductos().size(); j++) {
                    switch (puestoAVer) {
                        case 1:
                            Fruta fr = (Fruta) this.ventas.get(i).getClient().getProductos().get(j);
                            System.out.println(fr.showProduct());
                            break;
                        case 2:
                            Pescado pes = (Pescado) this.ventas.get(i).getClient().getProductos().get(j);
                            System.out.println(pes.showProduct());
                            break;
                        case 3:
                            Carne car = (Carne) this.ventas.get(i).getClient().getProductos().get(j);
                            System.out.println(car.showProduct());
                            break;
                    }

                }
            }
        }
    }

    private Producto crearProducto(Utils uts, int puestoVenta) {
        String nombre;
        double precio;

        System.out.print("Escribe el nombre del producto: ");
        nombre = uts.getString();

        do {
            System.out.print("Escribe el precio del producto: ");
            precio = uts.getDouble();
        } while (precio <= 0);

        switch (puestoVenta) {
            case 1:
                return crearFruta(nombre, "Fruta", precio);
            case 2:
                return crearCarne(nombre, "Carne", precio);
            case 3:
                return crearPescado(nombre, "Pescado", precio);
            default:
                System.out.println("No se pudo crear el producto");
                return null;
        }
    }

    private Pescado crearPescado(String nombre, String categoria, double precio) {
        return new Pescado(nombre, precio, categoria);
    }

    private Carne crearCarne(String nombre, String categoria, double precio) {
        return new Carne(nombre, precio, categoria);
    }

    private Fruta crearFruta(String nombre, String categoria, double precio) {
        return new Fruta(nombre, precio, categoria);
    }

    /**
     * Se encarga de crear ventas
     *
     * @param uts
     * @return
     */
    public Venta crearVenta(Utils uts) {

        int puestoVenta = getPuestoVenta(uts);
        Venta newVenta = new Venta(puestoVenta, crearCliente(uts, puestoVenta));

        return newVenta;
    }

    private Cliente crearCliente(Utils uts, int puestoVenta) {
        String nombre = "";
        String clientDNI = takeDNI(uts);

        if (!this.ventas.stream().anyMatch(dni -> dni.getClient().getDNI().equalsIgnoreCase(clientDNI))) {
            System.out.print("Por favor introduce tu nombre: ");
            nombre = uts.getString();
        }
        
        Cliente clienteNuevo = new Cliente(nombre, clientDNI);
        
        System.out.println("__________________________");
        System.out.println("Datos del producto: ");
        
        clienteNuevo.añadirProductos(crearProducto(uts, puestoVenta));

        return clienteNuevo;
    }

    /**
     * Recoge por teclado la eleccion del puesto de venta del usuario y devuelve
     * el identificado correspondiente a ese puesto
     *
     * @param uts
     * @return
     */
    private int getPuestoVenta(Utils uts) {
        int choice;

        System.out.println("Selecciona el puesto en el que quieres comprar:");

        for (int i = 0; i < PuestoEnum.values().length; i++) {
            System.out.println((i + 1) + ". " + PuestoEnum.values()[i].getNombre() + ".");
        }

        do {
            System.out.print("Eleccion: ");
            choice = uts.getInt();
        } while (choice > PuestoEnum.values().length || choice <= 0);

        return (choice);
    }

    /**
     * Comprueba que el DNI del usuario está correctamente formado
     *
     * @param uts
     * @return
     */
    private String takeDNI(Utils uts) {
        String dni;

        do {
            System.out.print("Por favor introduce tu DNI: ");
            dni = uts.getString();
        } while (!uts.checkDNI(dni));

        return dni;
    }
}
