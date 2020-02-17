/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author usuario
 */
public abstract class Aparato {

    private boolean decuentoAplicado = false;
    private int voltaje;
    private double precio;

    //Constructor por defecto
    public Aparato() {
        this.voltaje = 0;
        this.precio = 0;
    }

    public void capturarAparato() {
        Utils uts = new Utils();
        String choice;

        do {
            System.out.print("Introduzca el voltaje del aparato: ");
            this.voltaje = uts.getInt();
        } while (this.voltaje <= 0);
        do {
            System.out.print("Introduzca el precio del aparato: ");
            this.precio = uts.getInt();
        } while (this.precio <= 0);
    }

    public double calcularDesc(double descuento) {
        this.decuentoAplicado = true;
        return this.precio -= this.precio * descuento / 100;
    }

    @Override
    public String toString() {
        return "Precio del aparato: " + this.precio + "\nVoltaje del aparato: " + this.voltaje;
    }

    /**
     * Getters y setters de la clase Aparato
     *
     * @return
     */
    public boolean isDecuentoAplicado() {
        return decuentoAplicado;
    }

    public void setDecuentoAplicado(boolean decuentoAplicado) {
        this.decuentoAplicado = decuentoAplicado;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
