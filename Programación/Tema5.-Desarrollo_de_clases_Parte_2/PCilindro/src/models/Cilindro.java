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
public class Cilindro {

    private double altura;
    private Circulo base;

    public Cilindro() {
        this.altura = 0;
        this.base = new Circulo();
    }

    public Cilindro(Circulo b, double h) {
        this.altura = h;
        this.base = b;
    }

    public void traslada(double a, double b) {
        this.base.traslada(a, b);
    }

    @Override
    public String toString() {
        return "Altura del cilindro: "+this.altura+"\n"+"\nValor de la base del cilindro: "+this.base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

}
