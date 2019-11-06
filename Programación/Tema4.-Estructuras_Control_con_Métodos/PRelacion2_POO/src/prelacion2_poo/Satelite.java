package prelacion2_poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * La siguiente clase tiene problemas de compilación:
 *
 * @author Andres
 */
public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    Satelite(double m, double p, double d) {
        this.meridiano = m;
        this.paralelo = p;
        this.distancia_tierra = d;
    }

    Satelite() {
        this.meridiano = this.paralelo = this.distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        this.meridiano = m;
        this.paralelo = p;
        this.distancia_tierra = d;
    }

    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo " + this.paralelo + " Meridiano " + this.meridiano + " a una distancia de la tierra de " + this.distancia_tierra + " Kilómetros");
    }
}
