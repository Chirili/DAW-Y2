/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.salario.tipos;

import models.salario.SalariosPaises;

/**
 *
 * @author usuario
 */
public class SalariosUE extends SalariosPaises {

    private static final int IMPUESTO_FIJO = 2;

    private double puntos;
    boolean UE;

    //Constructor por defecto
    public SalariosUE() {
        super();
        this.UE = true;
        this.puntos = 0;
    }

    //Metodo encargado de capturar los datos del padre
    public void capturarSalariosUE() {
        super.capturarSalariosPaises();
    }

    /**
     * Metodo encargado de calcular el sueldo neto
     * @return de un dato de tipo double que es el sueldo neto
     */
    @Override
    public double calcularSueldoNeto() {
        this.puntos += super.trabajador.getNumHijos();
        if (super.trabajador.isIsCasado()) {
            this.puntos += 1;
        }
        return super.calcularSueldoBruto() - ((super.SALDO_BASE * (this.IMPUESTO_FIJO - (this.puntos / 10))) / 100);
    }

    @Override
    public String toString() {
        return "Datos del trabajador Europeo: \n"
                + "Sueldo neto: " + this.calcularSueldoNeto()
                + "\nSueldo bruto: " + this.calcularSueldoBruto() + "\n" + super.trabajador.toString() + "\n" + super.moneda.toString();
    }

    /**
     * Getters y setters
     * @return 
     */
    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public boolean isUE() {
        return UE;
    }

    public void setUE(boolean UE) {
        this.UE = UE;
    }
    
}
