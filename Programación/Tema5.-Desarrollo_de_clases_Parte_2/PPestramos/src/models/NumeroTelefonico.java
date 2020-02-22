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
public class NumeroTelefonico {

    private String codigoArea;
    private String extension;
    private String intercambio;
    private String linea;

    //Constructor por defecto de NumeroTelefonico
    public NumeroTelefonico() {
        this.codigoArea = "";
        this.extension = "";
        this.intercambio = "";
        this.linea = "";
    }

    //Metodo encargado de capturar los datos relacionado con el NumeroTelefonico
    public void capturar() {
        Utils uts = new Utils();
        System.out.print("Introduce el codigo de Area del numero de telefono: ");
        this.codigoArea = uts.getString();
        System.out.print("Introduce la extension del numero de telefono: ");
        this.extension = uts.getString();
        System.out.print("Introduce el intercambio del numero de telefono: ");
        this.intercambio = uts.getString();
        System.out.print("Introduce la linea del numero de telefono: ");
        this.linea = uts.getString();
    }

    @Override
    public String toString() {
        return "Datos del numero de telefono: \n"
                + "\nCodigo de area: " + this.codigoArea
                + "\nExtension: " + this.extension
                + "\nIntercambio: " + this.intercambio
                + "\nLinea: " + this.linea;
    }

    /**
     * Getters y setters de NumeroTelefonico
     *
     * @return
     */
    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getIntercambio() {
        return intercambio;
    }

    public void setIntercambio(String intercambio) {
        this.intercambio = intercambio;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

}
