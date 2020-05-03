/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public class Tablet extends Producto {

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
        super(precio, color, modelo, proveedor);
        this.hasIConnection = hasIConnection;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nConexion a internet" + ((this.isHasIConnection()) ? "Tiene Conexion a internet" : "No tiene Conexion a internet");
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
