/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public class PC {

    private int memoria;

    //Constructor por defecto
    public PC() {

    }

    //Metodo encargado de capturar los datos necesarios del PC
    public void capturar() {
        Utils uts = new Utils();
        System.out.print("Dime la cantidad de memoria del equipo: ");
        setMemoria(uts.getInt());
    }

    /**
     * Metodo set de memoria
     *
     * @param memoria
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return this.memoria;
    }

    @Override
    public String toString() {
        return "La cantidad de memoria del PC es de: " + this.memoria;
    }

}
