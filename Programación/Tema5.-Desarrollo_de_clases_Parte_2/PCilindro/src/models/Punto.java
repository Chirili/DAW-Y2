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
public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    public Punto(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public double distanciaAbscisa(Punto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(p.x-this.x,2));
        return distancia;
    }

    public void traslada(double a, double b){
        this.x += a;
        this.y += b;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Posicion de x: " + this.x + "\nPosicion de y: " + this.y;
    }
    
}
