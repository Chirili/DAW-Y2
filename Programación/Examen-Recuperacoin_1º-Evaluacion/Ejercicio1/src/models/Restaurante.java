/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Restaurante {

    private double chocos;
    private double papas;

    //Constructor parametrizado
    public Restaurante(double p, double ch) {
        this.papas = p;
        this.chocos = ch;
    }
    
    public void setChocos(double ch){
        this.chocos = ch;
    }
    public void setPapas(double p){
        this.papas = p;
    }

    /**
     * Aniade chocos
     *
     * @param x
     */
    public void addChocos(double x) {
        this.chocos += x;
    }

    /**
     * Aniade papas
     *
     * @param x
     */
    public void addPapas(double x) {
        this.papas = x;
    }

    /**
     * Muestra la cantidad de comensales que pueden comer con la cantidad de
     * chocos y papas que hay en el almacen
     *
     * @return
     */
    public int getComensales() {
        int numComensales = 0;
        double chocosDisponibles = this.chocos;
        double papasDisponibles = this.papas;
        do {
            if (chocosDisponibles >= 0.5 && papasDisponibles >= 1) {
                numComensales += 3;
                chocosDisponibles -= 0.5;
                papasDisponibles -= 1;
                if (chocosDisponibles < 0.5 || papasDisponibles < 1) {
                    break;
                }
            }
        } while (chocosDisponibles >= 0.5 || papasDisponibles >= 1);
        return numComensales;
    }

    //Muestra la cantidad de kilos de cocos que hay
    public void showChocos() {
        System.out.println("Esta es la cantidad de kilos de chocos en el almacen: " + this.chocos);
    }

    //Muestra la cantidad de kilos de papas que hay en el almacen
    public void showPapas() {
        System.out.println("Esta es la cantidad de kilos de papas en el almacen: " + this.papas);
    }

}
