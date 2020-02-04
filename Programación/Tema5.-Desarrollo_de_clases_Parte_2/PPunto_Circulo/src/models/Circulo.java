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

    /**
     * Consutrctor parametrizado de Circulo que recibe por parametro los valores
     * de x e y, aparte del radio.
     *
     * @param x
     * @param y
     * @param radio
     */
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public void capturarCiruclo() {
        Utils uts = new Utils();

        super.capturarPunto();
        System.out.print("Dame el valor del radio del circulo: ");
        setRadio(uts.getDouble());
    }

    //Metodo encargado de calcular el diametro del circulo
    public double obtenerDiametro() {
        return this.radio * 2;
    }

    //Metodo encargado de calcular la circunferencia
    public double obtenerCircunferencia() {
        return obtenerDiametro() * PI;
    }

    //Metodo encargado de calcular area
    public double obtenerArea() {
        return Math.pow(radio, 2) * PI;
    }

    /**
     * Getters y setters de circulo
     *
     * @return
     */
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
