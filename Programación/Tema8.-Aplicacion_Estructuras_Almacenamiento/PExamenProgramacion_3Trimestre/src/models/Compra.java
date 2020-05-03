/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Compra {

    private static int codCompra = 1;
    private String clase_producto;
    private ArrayList<Producto> productos;

    //Constructor por defecto
    public Compra() {
        this.clase_producto = "";
        this.productos = new ArrayList<Producto>();
        incrementCodCompra();
    }

    
    //Constructor parametrizado
    public Compra(String clase_producto){
        this.clase_producto = clase_producto;
        this.productos = new ArrayList<Producto>();
    }
    
    //Metodo encargado de incrementar el atributo estatico
    private void incrementCodCompra() {
        Compra.codCompra++;
    }

    //Metodo encargado de añadir productos al arraylist de productos
    public void addProducto(Producto pro) {
        this.productos.add(pro);
    }

    /**
     * Getters y setters de compra
     * @return 
     */
    public static int getCodCompra() {
        return codCompra;
    }

    public static void setCodCompra(int codCompra) {
        Compra.codCompra = codCompra;
    }

    public String getClase_producto() {
        return clase_producto;
    }

    public void setClase_producto(String clase_producto) {
        this.clase_producto = clase_producto;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    

}
