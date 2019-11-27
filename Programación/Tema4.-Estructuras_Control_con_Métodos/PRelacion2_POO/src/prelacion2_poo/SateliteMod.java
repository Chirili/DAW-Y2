/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelacion2_poo;

/**
 *
 * @author Andres
 */
public class SateliteMod {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    /*
    *   Constructor de satelite que recibe por parametros 3 valores e inicializa las propiedades
    */
    SateliteMod(double m, double p, double d) {
        this.meridiano = m;
        this.paralelo = p;
        this.distancia_tierra = d;
    }

    
    /*
    *   Constructor de la clase SateliteMod que inicializa las propiedades de la clase
    */
    SateliteMod() {
        this.meridiano = this.paralelo = this.distancia_tierra = 0;
    }

    /*
    * Metodo añadido que recibe un valor por parametro y actualiza la propiedad distancia_tierra con su valor.
    */
    public void variaAltura(double desplazamiento) {
        this.distancia_tierra = desplazamiento;
    }
    
    /*
    * Metodo booleano que devuelve false si la propiedad distancia_tierra es igual que 0, lo que significa que el satelite está en tierra
    * y true en caso contrario
    */
    public boolean enOrbita() {
        if (distancia_tierra == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void variaPosicion(double variap, double variam){
        this.meridiano = variam;
        this.paralelo = variap;
    }
    
    public void setPosicion(double m, double p, double d) {
        this.meridiano = m;
        this.paralelo = p;
        this.distancia_tierra = d;
    }

    /*
    * Imprime por pantalla la posicion del satelite
    */
    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo " + this.paralelo + " Meridiano " + this.meridiano + " a una distancia de la tierra de " + this.distancia_tierra + " Kilómetros");
    }
}
