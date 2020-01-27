/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos;

import productos.Productos;
import productos.Productos;

/**
 *
 * @author usuario
 */
public class ProductosRefrigerados extends Productos {

    private int codigoSupervision;
    private String fechaEnvasado;
    private int temperaturaMantenimiento;
    private String paisOrigen;

    public ProductosRefrigerados() {
        this.codigoSupervision = 0;
        this.fechaEnvasado = "";
        this.temperaturaMantenimiento = 0;
        this.paisOrigen = "";
    }

    public ProductosRefrigerados(int codigoSupervision, String fechaEnvasado, int temperaturaMantenimiento, String paisOrigen) {
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public ProductosRefrigerados(int codigoSupervision, String fechaEnvasado, int temperaturaMantenimiento, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    /**
     * Getters y setters de la clase ProductosRefrigerados
     *
     * @return
     */
    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

}
