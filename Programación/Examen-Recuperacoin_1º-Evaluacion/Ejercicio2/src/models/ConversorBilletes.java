/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public class ConversorBilletes {

    private int euros;

    //Constructor por defecto
    public ConversorBilletes() {
        this.euros = 0;
    }

    //Constructor parametrizado
    public ConversorBilletes(int e) {
        this.euros = e;
    }

    /**
     * Coge el atributo euros y va restandole en funcion del billete que se use.
     */
    public void convertirBilletes() {
        int bQ = 0, bD = 0, bC = 0, bCin = 0, bDi = 0, bv = 0, bCinco = 0;
        do {
            if (this.euros >= 500) {
                bQ += 1;
                this.euros -= 500;
            } else if (this.euros >= 200) {
                bD += 1;
                this.euros -= 200;
            } else if (this.euros >= 100) {
                bC += 1;
                this.euros -= 100;
            } else if (this.euros >= 50) {
                bCin += 1;
                this.euros -= 50;
            } else if (this.euros >= 20) {
                bv += 1;
                this.euros -= 20;
            } else if (this.euros >= 10) {
                bDi += 1;
                this.euros -= 10;
            } else if (this.euros >= 5) {
                bCinco += 0;
                this.euros -= 5;
            } else if (this.euros < 5) {
                System.out.println("Terminada la conversion de billetes...");
                break;
            }
        } while (this.euros > 0);
        pintarBilletes(bQ, bD, bC, bCin, bv, bDi, bCinco);
    }

    /**
     * Pinta por pantalla la cantidad de billetes que se han usado en la
     * conversion, recibiendo por parametros el numero de ellos
     *
     * @param bq
     * @param bd
     * @param bc
     * @param bcin
     * @param bv
     * @param bdi
     * @param bcinco
     */
    public void pintarBilletes(int bq, int bd, int bc, int bcin, int bv, int bdi, int bcinco) {
        if (bq > 0) {
            System.out.println("Cantidad de billetes de 500 euros: " + bq);
        }
        if (bd > 0) {
            System.out.println("Cantidad de billetes de 200 euros: " + bd);
        }
        if (bc > 0) {
            System.out.println("Cantidad de billetes de 100 euros: " + bc);
        }
        if (bcin > 0) {
            System.out.println("Cantidad de billetes de 50 euros: " + bcin);
        }
        if (bv > 0) {
            System.out.println("Cantidad de billetes de 20 euros: " + bv);
        }
        if (bdi > 0) {
            System.out.println("Cantidad de billetes de 10 euros: " + bdi);
        }
        if (bcinco > 0) {
            System.out.println("Cantidad de billetes de 5 euros: " + bcinco);
        }
        if (this.euros > 0) {
            System.out.println("Han sobrado " + this.euros + " euros.");
        } else {
            System.out.println("Vaya no ha sobrado nada.");
        }
        this.euros = 0;
    }

    /**
     * Getters y setters de ConversorBilletes
     *
     * @param e
     */
    public void setEuros(int e) {
        this.euros = e;
    }

    public int getEuros() {
        return this.euros;
    }
}
