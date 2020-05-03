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
public class Cliente {

    private String nombre;
    private String dni;
    private static int cod = 1;
    private ArrayList<Compra> compras;

    //Constructor por defecto
    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.compras = new ArrayList();
        incrementCod();
    }

    /**
     * Constructor parametrizado
     *
     * @param nombre
     * @param dni
     */
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.compras = new ArrayList();
        incrementCod();
    }

    //Metodo encargado de incrementar el atributo estatico
    private void incrementCod() {
        Cliente.cod++;
    }

    //Metodo encargado de añadir compras
    public void añadirCompra(Compra compr) {
        this.compras.add(compr);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\nDNI: " + this.getDni()
                + "\nCodigo de cliente: " + this.getCod();
    }

    /**
     * Getters y setters de Cliente
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCod() {
        return cod;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

}
