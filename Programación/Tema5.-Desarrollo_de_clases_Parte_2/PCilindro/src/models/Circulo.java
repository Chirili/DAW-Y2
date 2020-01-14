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
public class Circulo {
    private double radio;
    private Punto centro;
    
    public Circulo(){
        this.radio = 0;
        this.centro = new Punto();
    }
    public Circulo(Punto c, double r){ 
        this.radio = r;
        this.centro = c;
    }
    
    public void traslada(double a, double b){
        this.centro.traslada(a, b);
    }

    @Override
    public String toString() {
        return "Valor del radio: " + this.radio+"\n" + "\nPosicion del centro: " + this.centro;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
}
