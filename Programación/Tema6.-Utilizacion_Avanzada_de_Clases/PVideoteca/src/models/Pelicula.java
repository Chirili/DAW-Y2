/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public class Pelicula {

    private String nombrePelicula;
    private String director;
    private String tematica;
    private int duracion;
    private boolean disponible;
    private int cod_pelicula;

    //Constructor por defecto de Pelicula
    public void Pelicula() {
        this.nombrePelicula = "";
        this.director = "";
        this.tematica = "";
        this.duracion = 0;
        this.disponible = true;
        this.cod_pelicula = generateCode();
    }

    //Constructor parametrizado de Pelicula
    public Pelicula(String nombrePelicula, String director, String tematica, int duracion) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.tematica = tematica;
        this.duracion = duracion;
        this.disponible = true;
        this.cod_pelicula = generateCode();
    }

    //Metodo encargado de generar un codigo aleatorio
    private int generateCode() {
        return (int) (Math.random() * 1000);
    }

    @Override
    public String toString() {
        return "Nombre de la pelicula: "+this.getNombrePelicula()+
                "\nNombre del director de la pelicula: "+this.getDirector()+
                "\nTematica de la pelicula: "+this.getTematica()+
                "\nDuracion de la pelicula: "+this.getDuracion()+
                "\nDisponibilidad de la pelicula: "+((this.isDisponible()) ? "Esta disponible":"No esta disponible")+
                "\nCodigo de la pelicula: "+this.getCod_pelicula();
    }

    
    /**
     * Getters y setters de Pelicula
     *
     * @return
     */
    public int getCod_pelicula() {
        return cod_pelicula;
    }

    public void setCod_pelicula(int cod_pelicula) {
        this.cod_pelicula = cod_pelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
