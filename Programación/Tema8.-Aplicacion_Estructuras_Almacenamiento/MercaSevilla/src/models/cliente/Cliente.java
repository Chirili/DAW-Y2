/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.cliente;

import java.util.ArrayList;
import models.Persona;
import models.Productos.Producto;

/**
 *
 * @author Andres
 */
public class Cliente {

    private String nombre;
    private String DNI;
    private ArrayList<Producto> productos;

    //Constructor por defecto
    public Cliente() {
        this.nombre = "";
        this.DNI = "";
        this.productos = new ArrayList();
    }

    //Constructor parametrizado
    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.productos = new ArrayList();
    }

    /**
     * Metodo encargado de añadir Producto al arraylist de productos
     *
     * @param product
     */
    public void añadirProductos(Producto product) {
        productos.add(product);
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

}
