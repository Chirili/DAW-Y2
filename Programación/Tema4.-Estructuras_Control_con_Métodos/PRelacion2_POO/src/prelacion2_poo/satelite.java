package prelacion2_poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    satelite(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    satelite() {
        meridiano = paralelo = distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo " + paralelo + " Meridiano " + meridiano + " a una distancia de la tierra de " + distancia_tierra + " Kilómetros");
    }
}
