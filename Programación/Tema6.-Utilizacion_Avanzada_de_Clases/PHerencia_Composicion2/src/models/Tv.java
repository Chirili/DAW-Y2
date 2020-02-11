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
public class Tv extends Aparato {

    private double size;

    public Tv() {
        this.size = 0;
    }

    public void capturarTv() {
        Utils uts = new Utils();

        super.capturarAparato();

        do {
            System.out.print("Dime el tamanio del TV: ");
            this.size = uts.getDouble();
        } while (this.size <= 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamanio del TV: " + this.size;
    }

    /**
     * Getters y setters de la Tv
     *
     * @return
     */
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

}
