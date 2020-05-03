/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exepciones.NoDisponibleException;

/**
 *
 * @author Andres
 */
public class Articulo {

    private String nombre;
    private int cantidad;
    private double precio;

    //Constructor por defecto de Articulo
    public Articulo() {
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    //Constructor parametrizado de Articulo
    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void vende(int num) throws NoDisponibleException {
        if (this.getCantidad() > num) {
            this.cantidad -= num;
        } else {
            throw new NoDisponibleException("No se encuentra disponible esa cantidad de Articulos.");
        }
    }

    @Override
    public String toString() {
        return "Nombre del articulo: " + this.getNombre()
                + "\nPrecio del articulo: " + this.getPrecio()
                + "\nCantidad de unidades del articulo: " + this.getCantidad();
    }

    /**
     * Getters de Articulo
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

}
