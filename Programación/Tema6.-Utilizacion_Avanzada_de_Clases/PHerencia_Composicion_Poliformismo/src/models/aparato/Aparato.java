/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.aparato;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public abstract class Aparato {

    private double precio;
    private int voltaje;

    //Constructor por defecto de Aparato
    public Aparato() {
        this.precio = 0;
        this.voltaje = 0;
    }

    //Constructor parametrizado de Aparato
    public Aparato(int precio, int voltaje) {
        this.precio = precio;
        this.voltaje = voltaje;
    }

    //Metodo encargado de capturar todos los datos relacionados con el aparato
    public void capturar() {
        Utils uts = new Utils();
        do {
            System.out.print("Introduce el precio del aparato: ");
            setPrecio(uts.getDouble());
        } while (this.precio <= 0);
        do {
            System.out.print("Introduce el voltaje del aparato: ");
            setVoltaje(uts.getInt());
        } while (this.voltaje <= 0);
    }

    /**
     * Metodo encargado de calcular el descuento del aparato
     *
     * @param desc
     * @return devuelve un dato de tipo double que es el descuento que se le
     * aplicara al aparato
     */
    public double calcularDesc(double desc) {
        return (this.precio * desc) / 100;
    }

    @Override
    public String toString() {
        return "Precio del aparato: " + this.precio
                + "\nVoltaje del aparato: " + this.voltaje;
    }

    /**
     * Getters y setters de los atributos de Aparato
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

}
