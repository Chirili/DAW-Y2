/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.productos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Andres
 */
public abstract class Producto implements Serializable{

    private static int codigo = 0;
    private static final long serialVersionUID = 168411687910311958L;

    private double precio;
    private String fecha;
    private String color;
    private String modelo;
    private String clase_producto;
    private String proveedor;
    private String codigoGenerado = "";

    //Constructor por defecto
    public Producto() {
        this.precio = 0;
        this.fecha = String.valueOf(LocalDate.now());
        this.color = "";
        this.clase_producto = "";
        this.modelo = "";
        this.proveedor = "";
        this.codigoGenerado = generarCod();
    }

    //Constructor parametrizado
    public Producto(double precio, String color, String modelo, String proveedor, String claseProducto) {
        this.precio = precio;
        this.fecha = String.valueOf(LocalDate.now());
        this.color = color;
        this.modelo = modelo;
        this.clase_producto = claseProducto;
        this.proveedor = proveedor;
        this.codigoGenerado = generarCod();
    }

    //Metodo encargado de incrementar el codigo estatico y de llamar al metodo checkColor
    private void incrementCod() {
        Producto.codigo++;
        checkColor();
    }

    //Comprueba si el color introducido es Blanco, si lo es incrementa el precio en 5
    private void checkColor() {
        incrementCod();
        if (this.color.equalsIgnoreCase("Blanco")) {
            this.precio += 5;
        }
    }

    //Metodo encargado de generar un codigo especifico para cada producto
    private String generarCod() {
        return Producto.codigo + "- " + this.getModelo() + "-" + this.getFecha();
    }

    @Override
    public String toString() {
        return this.getModelo()
                + "\nProveedor: " + this.getProveedor()
                +"\nPrecio: " + this.getPrecio()
                + "\nFecha: " + this.getFecha()
                + "\nColor: " + this.getColor();
                
                
    }

    /**
     * Getters y setters de Producto
     *
     * @return
     */
    public String getClase_producto() {
        return clase_producto;
    }

    public void setClase_producto(String clase_producto) {
        this.clase_producto = clase_producto;
    }

    public String getCodigoGenerado() {
        return codigoGenerado;
    }

    public void setCodigoGenerado(String codigoGenerado) {
        this.codigoGenerado = codigoGenerado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Producto.codigo = codigo;
    }

}
