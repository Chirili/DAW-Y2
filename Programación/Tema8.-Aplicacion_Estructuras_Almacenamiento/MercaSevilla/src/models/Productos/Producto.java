/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Productos;

/**
 *
 * @author Andres
 */
public abstract class Producto {

    private String categoria;
    private double precio;
    private String nombre;

    public Producto() {
        this.categoria = "";
        this.precio = 0;
    }

    public Producto(String categoria, double precio) {
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto(String nombre, double precio,String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public abstract String showProduct();

    @Override
    public String toString() {
        return "El producto " + this.getNombre() + ""
                + " con codigo: ";
    }

    /**
     * Getters y setters de Producto
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
