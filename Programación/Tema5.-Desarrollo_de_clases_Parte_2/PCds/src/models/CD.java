/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.StringTokenizer;

/**
 *
 * @author Andres
 */
public class CD {
    private Cancion canciones[];
    
    public CD(){
        this.canciones = new Cancion[0];
    }
    
    public CD(int cCanciones){
        this.canciones = new Cancion[cCanciones];
    }

    /**
     * Getters y setters
     * @return 
     */
    public int numeroCanciones(){
        int contador = 0;
        for(Cancion c : canciones){
            if(c != null){
                contador ++;
            }
        }
        return contador;
    }
    public Cancion[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }
    
    public void grabarCancion(int posicion, Cancion c){
        canciones[(posicion)] = c;
    }
    public Cancion getCancionFrom(int posicion){
        return canciones[posicion];
    }
    public void setCancionesFinal(Cancion c){
        canciones[(canciones.length -1)] = c;
    }
    public void deleteCancion(int posicion){
        canciones[posicion] = null;
    }
}
