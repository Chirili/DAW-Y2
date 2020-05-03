/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author Andres
 */
public abstract class Producto {
    private double precio;
    private String fecha;
    private String color;
    private String modelo;
    private String proveedor;
    private static int codigo=0;
    private String codigoGenerado = "";
    
    public Producto(){
        this.precio = 0;
        this.fecha = String.valueOf(LocalDate.now());
        this.color = "";
        this.modelo = "";
        this.proveedor = "";
        incrementCod();
        generarCod();
    }
    public Producto(double precio, String color, String modelo, String proveedor){
        this.precio = precio;
         this.fecha = String.valueOf(LocalDate.now());
        this.color = color;
        this.modelo = modelo;
        this.proveedor = proveedor;
        incrementCod();
        generarCod();
    }
    
    private void incrementCod(){
        Producto.codigo++;
        checkColor();
    }
    
    private void checkColor(){
        if(this.color.equalsIgnoreCase("Blanco")){
            this.precio += 5;
        }
    }
    private String generarCod(){
        return Producto.codigo+"- "+this.getModelo()+"-"+this.getFecha();
    }

    @Override
    public String toString() {
        return "Precio: "+this.getPrecio()+
                "\nFecha: "+this.getFecha()+
                "\nColor: "+this.getColor()+
                "\nModelo: "+this.getModelo()+
                "\nProveedor: "+this.getProveedor();
    }

    
    /**
     * Getters y setters de Producto
     * @return 
     */
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
