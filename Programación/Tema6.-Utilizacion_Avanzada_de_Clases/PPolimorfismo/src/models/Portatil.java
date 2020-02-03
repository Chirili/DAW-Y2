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
public class Portatil extends PC {

    private double duracionBat;

    public Portatil() {
        super();
        super.capturar();
        capturar();
    }

    @Override
    public void capturar() {
        Utils uts = new Utils();
        System.out.print("Dime la duracion del bat del portatil: ");
        setDuracionBat(uts.getDouble());
    }

    public void setDuracionBat(double duracionBat) {
        this.duracionBat = duracionBat;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDuracion del bat del portatil: "+this.duracionBat;
    }
    
}
