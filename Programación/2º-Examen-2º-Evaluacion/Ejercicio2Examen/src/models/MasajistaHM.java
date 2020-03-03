/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import models.interfaces.IntegranteInterface;

/**
 *
 * @author usuario
 */
public class MasajistaHM extends SeleccionFutbolHM implements IntegranteInterface {

    private String titulacion;
    private int aniosExperiencia;

    //Constructor por defecto
    public MasajistaHM() {
        super();
        this.titulacion = "";
        this.aniosExperiencia = 0;
    }

    //Constructor parametrizado uno
    public MasajistaHM(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    //Constructor parametrizado dos
    public MasajistaHM(String titulacion, int aniosExperiencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    //Metodo encargado de capturar los datos del masajista
    public void capturarMasajistaHM() {
        Utils uts = new Utils();
        super.capturarSeleccion();
        System.out.print("Introduce la titulacion: ");
        this.titulacion = uts.getString();
        System.out.print("Introduce los anios de experiencia: ");
        this.aniosExperiencia = uts.getInt();
    }

    /**
     * Metodos de la interface
     */
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
        return super.toString() + "\nDatos del masajista: \n"
                + "Titulacion: " + this.titulacion
                + "Anios de experciencia: " + this.aniosExperiencia;
    }

    /**
     * Getters y setters
     * @return 
     */
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
}
