/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Andres
 */
public class Potenciar {
    
    /**
     * Eleva el primer parametro al segundo y devuelve un resultado.
     * @param base
     * @param exponente
     * @return 
     */

    public int potenciar(int base, int exponente) {
        int potencia;

        potencia = (int) Math.pow(base, exponente);
        return potencia;
    }
    
    
}
