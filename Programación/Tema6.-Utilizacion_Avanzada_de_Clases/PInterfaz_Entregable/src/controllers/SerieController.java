/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import BDD.SerieBD;
import Interfaces.IEntregable;
import java.util.ArrayList;
import java.util.Collections;
import models.Serie;

/**
 *
 * @author Andres
 */
public class SerieController implements IEntregable{
    Serie ser1;
    private SerieBD serbd;

    
    public SerieController(){
        this.ser1 = new Serie();
        this.serbd = new SerieBD();
    }
    
      /**
     * Implementacion de los metodos de la interfaz IEntregable
     */
    public void addSerie(String titulo, String creador, int numeroTemporadas, String genero){
        Serie newSerie = new Serie(titulo, creador, numeroTemporadas, genero);
        this.serbd.insertSerieToBD(newSerie);
    }
    
     public void updateSerie(String titulo, String creador, int numeroTemporadas, String genero, int key){
        Serie newSerie = new Serie(titulo, creador, numeroTemporadas, genero);
        this.serbd.updateSerieToDB(key,newSerie);
    }
    public void findSeries(){
        int count = 1;
        ArrayList<Serie> series = new ArrayList<Serie>(serbd.listSerieFromDB());
        for(Serie ser :series ){
            System.out.println(count+". "+ser.getTitulo());
            count++;
        }
    }
    public int numberOfSeries(){
        ArrayList<Serie> series = new ArrayList<Serie>(serbd.listSerieFromDB());
        return series.size();
    }
    public void findSerieByKey(int key){
        System.out.println(key);
        System.out.println(serbd.selectSerieFromDB(key).toString());
    }
    @Override
    public void entregar() {
        this.ser1.setIsEntregado(true);
    }

    @Override
    public void devolver() {
        this.ser1.setIsEntregado(false);
    }

    @Override
    public boolean getIsEntregado() {
        return this.ser1.getIsEntregado();
    }

    @Override
    public void compareTo(Object s) {
        Serie ser2 = (Serie)s;
        if(this.ser1.getNumeroTemporadas() == ser2.getNumeroTemporadas()){
            System.out.println("Las series tienen el mismo numero de temporadas");
        }else{
            System.out.println("Las series no tienen el mismo numero de temporadas");
        }
    }
}
