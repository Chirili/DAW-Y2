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
public class Circulo extends Punto {

    private static final double PI = 3.14;
    private double radio;

    //Constructor parametrizado
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    //Constructor copia
    public Circulo(Punto p) {
        super(p);
        this.radio = 0;
    }

    //Metodo encargado de capturar los datos relacionados con el circulo
    public void capturarCirculo() {
        Utils uts = new Utils();
        System.out.print("Dime el valor del radio del circulo: ");
        this.radio = uts.getDouble();
    }

    /**
     * Getters y setters de circulo
     *
     * @return
     */
    public double obtenerDiametro() {
        return this.radio * 2;
    }

    public double obtenerCircunferencia() {
        return obtenerDiametro() * PI;
    }

    public double obtenerArea() {
        return Math.pow(radio, 2) * PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValor del radio del circulo: " + this.radio
                + "\nDiametro del circulo: " + obtenerDiametro()
                + "\nValor de la circunferencia: " + obtenerCircunferencia()
                + "\nValor del area del ciruclo: " + obtenerArea();
    }

}
