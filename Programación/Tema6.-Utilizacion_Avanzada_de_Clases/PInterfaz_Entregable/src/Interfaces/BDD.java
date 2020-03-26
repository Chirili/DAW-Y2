/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Collection;
/**
 *
 * @author Andres
 */
public interface BDD {
   public void insertSerieToBD(Object o);
   public void updateSerieToDB(int k, Object o);
   public Object selectSerieFromDB(int k);
   public Collection listSerieFromDB();
}
