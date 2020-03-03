/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import models.interfaces.DeportistaInterface;
import models.interfaces.IntegranteInterface;

/**
 *
 * @author usuario
 */
public class FutbolistaHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface {

    private int dorsal;
    private String demarcacion;

    //Constructor por defecto
    public FutbolistaHM() {
        super();
        this.dorsal = 0;
        this.demarcacion = "";
    }

    //Constructor parametrizado uno
    public FutbolistaHM(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //Constructor parametrizado dos
    public FutbolistaHM(int dorsal, String demarcacion, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //Metodo encargado de capturar los datos relacionados con el futbolista
    public void capturarFutbolistaHM() {
        Utils uts = new Utils();
        super.capturarSeleccion();
        System.out.print("Introduce numero dorsal: ");
        this.dorsal = uts.getInt();
        System.out.print("Introduce la demarcacion: ");
        this.demarcacion = uts.getString();
    }

    /**
     * Metodos implementados de la interface
     */
    @Override
    public void entrenar() {
        System.out.println("Entrenando...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando el partido...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrandome...");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando...");
    }

    @Override
    public String toString() {
        return super.toString()+"Datos del futbolista: \n"+
                "Dorsal: "+this.dorsal+
                "\nDemarcacion: "+this.demarcacion;
    }

    /**
     * Getters y setters
     * @return 
     */
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
}
