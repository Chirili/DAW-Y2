/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.productos.tipos;

import java.io.Serializable;
import models.productos.Producto;

/**
 *
 * @author Andres
 */
public class Tablet extends Producto implements Serializable{

    private static final long serialVersionUID = 749794077791079870L;

    private boolean hasIConnection;

    //Constructor por defecto
    public Tablet() {
        super();
        this.hasIConnection = false;
    }

    //Constructor parametrizado
    public Tablet(boolean hasIConnection) {
        super();
        this.hasIConnection = hasIConnection;
    }

    /**
     * Constructor parametrizado con los parametros del padre
     *
     * @param hasIConnection
     * @param precio
     * @param color
     * @param modelo
     * @param proveedor
     */
    public Tablet(boolean hasIConnection, double precio, String color, String modelo, String proveedor) {
        super(precio, color, modelo, proveedor,"Tablet");
        this.hasIConnection = hasIConnection;
    }

    @Override
    public String toString() {
        return "______________________________\n"+"Tablet: "+super.toString()
                + "\nConexion a internet: " + ((this.isHasIConnection()) ? "Tiene Conexion." : "No tiene Conexion.")+
                "\n______________________________\n";
    }

    /**
     * Getters y setters de Tablet
     *
     * @return
     */
    public boolean isHasIConnection() {
        return hasIConnection;
    }

    public void setHasIConnection(boolean hasIConnection) {
        this.hasIConnection = hasIConnection;
    }

}
