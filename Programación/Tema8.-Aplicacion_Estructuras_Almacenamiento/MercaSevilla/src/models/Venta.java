/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.PuestoEnum;
import models.cliente.Cliente;

/**
 *
 * @author Andres
 */
public class Venta {

    private int identificadorPuesto;
    private Cliente client;

    //Constructor por defecto
    public Venta() {
        this.identificadorPuesto = 0;
        this.client = new Cliente();
    }

    //Constructor parametrizado
    public Venta(int identificadoDePuesto, Cliente client) {
        this.identificadorPuesto = identificadoDePuesto;
        this.client = client;
    }

    /**
     * Getters y setters de Venta
     *
     * @return
     */
    public int getIdentificadorPuesto() {
        return identificadorPuesto;
    }

    public void setIdentificadorPuesto(int identificadorPuesto) {
        this.identificadorPuesto = identificadorPuesto;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

}
