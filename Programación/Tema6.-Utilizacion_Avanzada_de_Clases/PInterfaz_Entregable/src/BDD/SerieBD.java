/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import Interfaces.BDD;
import java.util.Collection;
import java.util.HashMap;
import models.Serie;

/**
 *
 * @author Andres
 */

//He preferido usar el HashMap porque me resulta mas facil actualizar los datos con el mismo.
//Despues en el controlador desvuelvo la collecion y lo meto en un array list
public class SerieBD implements BDD {

    HashMap<Integer, Serie> series = new HashMap<Integer, Serie>();

    public void insertSerieToBD(Object s) {
        series.put((series.size()) + 1, (Serie) s);
    }

    public void updateSerieToDB(int k, Object s) {
        series.put(k, (Serie) s);
    }

    public Serie selectSerieFromDB(int k) {
         return series.get(k);   
    }

    @Override
    public Collection<Serie> listSerieFromDB() {
        return series.values();
    }

}
