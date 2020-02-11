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
public class Equipo extends Aparato {

    private int cantidadCds;

    //Constructor por defecto
    public Equipo() {
        this.cantidadCds = 0;
    }

    //Metodo encagardo de capturar toda la informacion relacionada con el equipo
    public void capturarEquipo() {
        Utils uts = new Utils();

        super.capturarAparato();
        System.out.print("Introduce la cantidad de CDs del equipo de sonido: ");

        this.cantidadCds = uts.getInt();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de CDs: " + this.cantidadCds;
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
