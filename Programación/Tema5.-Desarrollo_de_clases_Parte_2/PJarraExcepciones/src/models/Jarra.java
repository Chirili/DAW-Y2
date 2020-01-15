/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Jarra {

    private int cantidad;
    private int capacidad;

    public Jarra(int capacidadInicial) throws JarraException {
        if (capacidadInicial <= 0) {
            throw new JarraException("Error, capacidad incorrecta.");
        }
        capacidad = capacidadInicial;
        cantidad = 0;
    }

    public void llena() {
        this.cantidad = this.capacidad;
    }

    public void llenaDesde(Jarra j) {
        this.cantidad += j.getCantidad();
    }

    public void vacia() {
        this.cantidad = 0;
    }

    @Override
    public String toString() {
        return "Capacidad de la jarra: " + this.capacidad + "\nCantidad de la jarra: " + this.cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
