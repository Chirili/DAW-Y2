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
public class Test {

    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public void Operaciones(double numero1, double numero2) {
        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);
    }

    public void suma(double numero1, double numero2) {
        Double suma = new Double(numero1 + numero2);
        this.suma = suma.intValue();
    }

    public void resta(double numero1, double numero2) {
        Double resta = new Double(numero1 - numero2);
        this.resta = resta.intValue();
    }

    public void multiplicacion(double numero1, double numero2) {
        Double multiplicacion = new Double(numero1 * numero2);
        this.multiplicacion = multiplicacion.intValue();
    }

    public void division(double numero1, double numero2) {
        try {
            Double division = new Double(numero1 / numero2);
            this.division = division.intValue();
        } catch (ArithmeticException e) {
            System.out.print("No se puede dividir entre 0");
        }
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

}
