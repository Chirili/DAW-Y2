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
public class SalariosDinamarca extends SalariosPaises {

    private static final double IMPUESTO_FIJO = 1.5;
    private boolean nacionalizado;

    //constructor por defecto
    public SalariosDinamarca() {
        super();
        this.nacionalizado = false;
    }

    //Metodo encargado de capturar los datos del padre
    public void capturarSalariosDinamarca() {
        super.capturarSalariosPaises();
    }

    /**
     * Metodo encargado de calcular el sueldo neto y devolverlo
     * @return 
     */
    @Override
    public double calcularSueldoNeto() {
        if (nacionalizado) {
            return super.calcularSueldoBruto() - ((super.SALDO_BASE * (this.IMPUESTO_FIJO - 0.2)) / 100);
        } else {
            return super.calcularSueldoBruto() - ((super.SALDO_BASE * this.IMPUESTO_FIJO) / 100);
        }
    }

    @Override
    public String toString() {
                return "Datos del trabajador Danes: \n"+
                "Sueldo neto: "+this.calcularSueldoNeto()+
                "\nSueldo bruto: "+this.calcularSueldoBruto()+"\n"+super.trabajador.toString()+"\n"+super.moneda.toString();
    }

    /**
     * Getters y setters de SalariosDinamarca
     * @return 
     */
    public boolean isNacionalizado() {
        return nacionalizado;
    }

    public void setNacionalizado(boolean nacionalizado) {
        this.nacionalizado = nacionalizado;
    }
    
    

}
