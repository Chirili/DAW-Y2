/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.aparato.tipos;

import models.aparato.Aparato;
import Utils.Utils;
import models.aparato.Aparato;

/**
 *
 * @author usuario
 */
public class Tv extends Aparato {

    private double tamanio;

    //Constructor por defecto de Tv
    public Tv() {
        this.tamanio = 0;
    }

    //Metodo encargado de capturar los datos encargados de Tv y de Aparato
    public void capturar() {
        Utils uts = new Utils();

        super.capturar();
        do {
            System.out.print("Introduce el tamanio del Televisor: ");
            this.setTamanio(uts.getInt());
        } while (this.tamanio < 0);
    }

    @Override
    public String toString() {
        return "Datos del Televisor: " + "\nTamanio del televisor: " + this.getTamanio() + "\n" + super.toString();
    }

    /**
     * Getters y setters de Tv
     *
     * @return
     */
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
