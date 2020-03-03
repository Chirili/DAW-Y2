/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.salario;

import models.persona.Persona;
import models.moneda.Moneda;

/**
 *
 * @author usuario
 */
public abstract class SalariosPaises {

    protected static final double SALDO_BASE = 600;

    protected String nombrePais;
    protected Persona trabajador;
    protected Moneda moneda;

    //Constructor por defecto
    public SalariosPaises() {
        this.nombrePais = "";
        this.trabajador = new Persona();
        this.moneda = new Moneda();
    }

    //Constructor parametrizado
    public SalariosPaises(String nombrePais, Persona trabajador, Moneda moneda) {
        this.nombrePais = nombrePais;
        this.trabajador = trabajador;
        this.moneda = moneda;
    }

    //Constructor copia
    public SalariosPaises(SalariosPaises sp) {
        this.nombrePais = sp.getNombrePais();
        this.trabajador = sp.getTrabajador();
        this.moneda = sp.getMoneda();
    }
    
    //Metodo encargado de capturar los datos del trabajador y de la moneda
    public void capturarSalariosPaises(){
        trabajador.capturarPersona();
        moneda.capturarNombreMoneda();
    }

    /**
     * Metodo encargado de multiplicar el sueldo base por el valor de la moneda
     *
     * @return de un dato de tipo double que es el sueldo bruto del trabajador
     */
    public double calcularSueldoBruto() {
        return (this.SALDO_BASE / this.getMoneda().getValor());
    }

    //Metodo abstractor que se implementara en los hijos
    public abstract double calcularSueldoNeto();

    /**
     * Getters y setters de salariosPaises
     *
     * @return
     */
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Persona getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Persona trabajador) {
        this.trabajador = trabajador;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
