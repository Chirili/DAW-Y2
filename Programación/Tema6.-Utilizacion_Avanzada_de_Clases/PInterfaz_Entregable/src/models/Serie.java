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
public class Serie{

    private String titulo;
    private int numeroTemporadas;
    private boolean isEntregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.isEntregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.isEntregado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador, int numeroTemporadas, String genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.isEntregado = false;
    }

    @Override
    public String toString() {
        return "Titulo de la serie: " + this.titulo
                + "\nNumero de temporadas: " + this.numeroTemporadas
                + "\nNombre del creador: " + this.creador
                + "\nGenero de la serie: " + this.genero
                + "\nEstado de la serie: " + (this.isEntregado == true ? "Entregado" : "No entregado");
    }

    /**
     * Getters y setter de la clase Series
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
