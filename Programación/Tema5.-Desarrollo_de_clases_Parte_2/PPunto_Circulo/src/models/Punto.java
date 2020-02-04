/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author Andres
 */
public abstract class Punto {

    protected int x;
    protected int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void capturarPunto() {
        Utils uts = new Utils();
        
        System.out.print("Dime el valor de x: ");
        estableceX(uts.getInt());
        
        System.out.print("Dime el valor de y: ");
        estableceY(uts.getInt());
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public int obtieneX() {
        return x;
    }

    public void estableceX(int x) {
        this.x = x;
    }

    public int obtieneY() {
        return y;
    }

    public void estableceY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Valor de x: "+this.x+"\nValor de y: "+this.y;
    }

}
