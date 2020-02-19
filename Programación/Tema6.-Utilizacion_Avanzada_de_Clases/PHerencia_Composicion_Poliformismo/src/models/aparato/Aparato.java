/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.aparato;

import Utils.Utils;

/**
 *
 * @author usuario
 */
public abstract class Aparato {

    private double precio;
    private int voltaje;

    public Aparato() {
        this.precio = 0;
        this.voltaje = 0;
    }

    public Aparato(int precio, int voltaje) {
        this.precio = precio;
        this.voltaje = voltaje;
    }

    public void capturar() {
        Utils uts = new Utils();
        do {
            System.out.println("Introduce el precio del aparato: ");
            setPrecio(uts.getDouble());
        } while (this.precio <= 0);
        do {
            System.out.println("Introduce el voltaje del aparato: ");
            setVoltaje(uts.getInt());
        } while (this.voltaje <= 0);
    }

    @Override
    public String toString() {
        return "Precio del aparato: "+this.precio+
                "Voltaje del aparato"+this.voltaje;
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
