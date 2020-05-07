/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import models.productos.Producto;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Compra implements Serializable{

    private static int codCompra = 1;
    private static final long serialVersionUID = -1781182213535852645L;

    private ArrayList<Producto> productos;

    //Constructor por defecto
    public Compra() {
        this.productos = new ArrayList<Producto>();
        incrementCodCompra();
    }
    
    //Constructor parametrizado
    public Compra(ArrayList<Producto> products){
        this.productos = products;
        incrementCodCompra();
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    

}
