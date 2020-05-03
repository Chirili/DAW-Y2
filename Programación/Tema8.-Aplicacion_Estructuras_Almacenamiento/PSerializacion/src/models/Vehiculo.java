/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Vehiculo implements Serializable{

    private static final long serialVersionUID = -7681853240645568924L;
    
    private String marca;
    private String matricula;
    transient private double deposito;
    private String modelo;
    

    public Vehiculo(String marca, String matricula, double deposito, String modelo){
        this.marca = marca;
        this.matricula = matricula;
        this.deposito = deposito;
        this.modelo = modelo;
    }
 /**
  * Getters y setters de Vehiculo
  * @return 
  */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
