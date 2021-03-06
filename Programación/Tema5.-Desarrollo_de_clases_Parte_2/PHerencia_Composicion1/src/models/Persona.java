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

    private int identidad;
    private String nombreCompleto;

    //Constructor por defecto
    public Persona() {
        this.identidad = 0;
        this.nombreCompleto = "";
    }

    //Metodo encargado de capturar toda la informacion relacionada con la persona
    public void capturarPersona() {
        Utils uts = new Utils();

        System.out.print("Dime la identidad de la persona: ");
        this.identidad = uts.getInt();
        do {
            System.out.print("Dime el nombre completo de la persona: ");
            this.nombreCompleto = uts.getString();
        } while (this.nombreCompleto.length() > 60);
    }

    @Override
    public String toString() {
        return "Nombre de completo de la persona: " + this.nombreCompleto
                + "\nNumero de identidad de la persona: " + this.identidad;
    }

    /**
     * Getters y setters de la clase Persona
     *
     * @return
     */
    public void setPersona(int identidad, String nombreCompleto) {
        this.identidad = identidad;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
