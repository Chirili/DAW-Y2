/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import models.Pelicula;

/**
 *
 * @author Andres
 */
public class Almacen {

    private static int filmCode = 1354;
    private static final int CAPACIDAD_MAXIMA = 100;
    private ArrayList<Pelicula> peliculas;

    private int capacidad;

    //Constructor por defecto de Almacen
    public Almacen() {
        this.capacidad = CAPACIDAD_MAXIMA;
        this.peliculas = new ArrayList<Pelicula>();
    }

    //Metodo encargado de añadir peliculas al Almacen.
    public void addFilm(Pelicula p) {
        this.peliculas.add(this.insertCodeToFilm(p));
        filmCode++;
    }

    //Metodo encargado de asignar el codigo al usuario
    private Pelicula insertCodeToFilm(Pelicula p){
        String newCode;
        newCode = String.valueOf(p.getCod_pelicula())+String.valueOf(filmCode);
        p.setCod_pelicula(Integer.parseInt(newCode));
        return p;
    };
    
    /**
     * Getters y setters de Almacen
     * @return 
     */
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
