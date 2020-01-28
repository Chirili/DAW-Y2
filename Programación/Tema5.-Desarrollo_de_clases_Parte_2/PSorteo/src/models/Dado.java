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
public class Dado extends Sorteo {
    
    public int lanzar(){    
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }
    
}
