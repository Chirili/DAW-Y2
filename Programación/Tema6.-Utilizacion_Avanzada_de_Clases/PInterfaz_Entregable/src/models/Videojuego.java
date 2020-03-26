/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Interfaces.IEntregable;

/**
 *
 * @author Andres
 */
public class Videojuego {

    private String titulo;
    private int horasEstimadas;
    private boolean isEntregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.isEntregado = false;
        this.compania = "";
        this.genero = "";
    }

    public Videojuego(int horasEstimadas, String titulo) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.isEntregado = false;
        this.compania = "";
        this.genero = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.isEntregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Datos del videojuego"
                + "\nTitulo del juego: " + this.titulo
                + "\nHoras estimadas de juego: " + this.horasEstimadas
                + "\nGenero del juego: " + this.genero
                + "\nCompania del juego: " + this.compania
                + "\nEstado del juego: " + (this.isEntregado == true ? "Entregado" : "No entregado");
    }

    /**
     * Getters y setters de Videojuego
     *
     * @return
     */
    public boolean getIsEntregado() {
        return isEntregado;
    }

    public void setIsEntregado(boolean isEntregado) {
        this.isEntregado = isEntregado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
