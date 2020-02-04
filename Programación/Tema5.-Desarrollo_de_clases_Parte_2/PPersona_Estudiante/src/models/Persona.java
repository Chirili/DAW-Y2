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
public abstract class Persona {

    protected int identidad;

     // Consutrctor por defecto de Persona
    public Persona() {
        this.identidad = 0;
    }

    /**
     * Constructor parametrizado de Persona que recibe el numero de identidad
     * por parametro
     *
     * @param identidad
     */
    public Persona(int identidad) {
        this.identidad = identidad;
    }

    /**
     * He asociado el atributo numero de identidad como el DNI de la persona asi
     * que lo he condicionado un poco
     */
    public void capturarPersona() {
        Utils uts = new Utils();
        do {
            System.out.print("Introduce el numero de indentidad de persona: ");
            establecerPersona(uts.getInt());
            if (String.valueOf(this.identidad).length() > 8) {
                System.out.println("Introduce 8 digitos o menos, los cuales corresponden a tu numero de identidad.");
            }
        } while (String.valueOf(this.identidad).length() > 8);

    }

    /**
     * Getters y setters de la clase Persona
     *
     * @return
     */
    public int obtenerIdentidad() {
        return identidad;
    }

    public void establecerPersona(int identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Numero de indentidad de la persona: " + this.identidad;
    }

}
