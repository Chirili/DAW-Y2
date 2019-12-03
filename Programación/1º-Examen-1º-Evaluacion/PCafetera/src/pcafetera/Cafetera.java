/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcafetera;

/**
 *
 * @author usuario
 */
public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;


    Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = 1000;
        this.capacidadActual = capacidadMaxima;
    }

    Cafetera(int capacidadMaxima, int capacidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera(){
        this.capacidadActual = this.capacidadMaxima;
    }
    public void vaciarCafetera(){
        this.capacidadActual = 0;
    }
    public void agregarCafe(int cafe){
        this.capacidadActual += cafe;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}
