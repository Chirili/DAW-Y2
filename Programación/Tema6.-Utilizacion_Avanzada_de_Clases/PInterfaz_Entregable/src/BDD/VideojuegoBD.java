/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import Interfaces.BDD;
import java.util.Collection;
import java.util.HashMap;
import models.Videojuego;

/**
 *
 * @author Andres
 */
public class VideojuegoBD implements BDD{
    
        HashMap<Integer, Videojuego> videojuegos = new HashMap<Integer, Videojuego>();

    public void insertSerieToBD(Object s) {
        videojuegos.put((videojuegos.size()) + 1, (Videojuego) s);
    }

    public void updateSerieToDB(int k, Object s) {
        videojuegos.put(k, (Videojuego) s);
    }

    public Videojuego selectSerieFromDB(int k) {
        return videojuegos.get(k);   
    }

    @Override
    public Collection<Videojuego> listSerieFromDB() {
        return videojuegos.values();
    }
}
