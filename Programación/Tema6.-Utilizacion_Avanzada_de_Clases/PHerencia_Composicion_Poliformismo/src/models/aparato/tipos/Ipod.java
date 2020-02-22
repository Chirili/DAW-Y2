/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.aparato.tipos;

import Utils.Utils;
import models.aparato.Aparato;

/**
 *
 * @author usuario
 */
public class Ipod extends Aparato {

    private double capacidad;

    //Constructor por defecto de Ipod
    public Ipod() {
        this.capacidad = 0;
    }

    //Metodo encargado de capturar los datos de Ipod y de Aparato
    public void capturar() {
        Utils uts = new Utils();

        super.capturar();
        do {
            System.out.print("Introduce la capacidad del IPod: ");
            this.setCapacidad(uts.getInt());
        } while (this.capacidad < 0);
    }

    @Override
    public String toString() {
        return "Datos del IPod: " + "\nCapacidad del IPod: " + this.getCapacidad() + "\n" + super.toString();
    }

    /**
     * Getters y setters de Ipod
     *
     * @return
     */
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

}
