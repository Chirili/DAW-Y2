/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Interfaces.IEntregable;
import models.Videojuego;
import BDD.VideojuegoBD;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class VideojuegoController implements IEntregable {

    private Videojuego vid1;
    private VideojuegoBD vidBD;

    public VideojuegoController() {
        this.vid1 = new Videojuego();
        this.vidBD = new VideojuegoBD();
    }

    /**
     * Implementacion de los metodos de la interfaz IEntregable
     */

    public void addSerie(String titulo, String compania, int horasEstimadas, String genero) {
        Videojuego newVideojuego = new Videojuego(titulo, horasEstimadas, genero, compania);
        this.vidBD.insertSerieToBD(newVideojuego);
    }

    public void updateVideoGame(String titulo, String creador, int numeroTemporadas, String genero, int key) {
        Videojuego newSerie = new Videojuego(titulo, numeroTemporadas, genero, creador);
        this.vidBD.updateSerieToDB(key, newSerie);
    }

    public int numberOfVideoGames() {
        ArrayList<Videojuego> series = new ArrayList<Videojuego>(vidBD.listSerieFromDB());
        return series.size();
    }

    public void findSerieByKey(int key) {
        System.out.println(key);
        System.out.println(vidBD.selectSerieFromDB(key).toString());
    }

    public void findVideojuegos() {
        int count = 1;
        ArrayList<Videojuego> videojuegos = new ArrayList(vidBD.listSerieFromDB());
        for (Videojuego vdj : videojuegos) {
            System.out.println(vdj.getTitulo());
        }
    }

    @Override
    public void entregar() {
        this.vid1.setIsEntregado(true);
    }

    @Override
    public void devolver() {
        this.vid1.setIsEntregado(false);
    }

    @Override
    public boolean getIsEntregado() {
        return this.vid1.getIsEntregado();
    }

    @Override
    public void compareTo(Object v) {
        Videojuego vid2 = (Videojuego) v;
        if (this.vid1.getHorasEstimadas() == vid2.getHorasEstimadas()) {
            System.out.println("Las series tienen el mismo numero de temporadas");
        } else {
            System.out.println("Las series no tienen el mismo numero de temporadas");
        }
    }
}
