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
public class Equipo extends Aparato {

    private int cantidadCds;

    //Constructor por defecto de Equipo
    public Equipo() {
        this.cantidadCds = 0;
    }

    //Metodo encargado de capturar los datos relaciones con el Equipo y el Aparato
    public void capturar() {
        Utils uts = new Utils();

        super.capturar();
        do {
            System.out.print("Introduce la cantidad de CDs del equipo: ");
            this.setCantidadCds(uts.getInt());
        } while (this.cantidadCds < 0);
    }

    @Override
    public String toString() {
        return "Datos del equipo: " + "\nCantidad de CDs: " + this.getCantidadCds() + "\n" + super.toString();
    }

    /**
     * Getters y setters de Equipo
     *
     * @return
     */
    public int getCantidadCds() {
        return cantidadCds;
    }

    public void setCantidadCds(int cantidadCds) {
        this.cantidadCds = cantidadCds;
    }

}
