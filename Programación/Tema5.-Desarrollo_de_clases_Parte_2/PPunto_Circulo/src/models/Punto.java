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
public class Punto {

    protected int x;
    protected int y;

    //Constructor por defecto
    public Punto() {

    }

    //Constructor parametrizado
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructor copia
    public Punto(Punto p) {
        this.x = p.x;
        this.y = p.y;
    }

    //Metodo encargado de capturar los datos relacionados con el punto
    public void capturarPunto() {
        Utils uts = new Utils();

        System.out.print("Dime el valor de x: ");
        setX(uts.getInt());

        System.out.print("Dime el valor de y: ");
        setY(uts.getInt());
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Valor de x: " + this.x + "\nValor de y: " + this.y;
    }

}
