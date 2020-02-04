/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos;

import java.time.LocalDate;
import productos.Productos;
import productos.Productos;

/**
 *
 * @author usuario
 */
public class ProductosRefrigerados extends Productos {

    private int codigoSupervision;
    private LocalDate fechaEnvasado;
    private int temperaturaMantenimiento;
    private String paisOrigen;

    //Constructor por defecto de ProductosRefrigerados
    public ProductosRefrigerados() {
        this.codigoSupervision = 0;
        this.fechaEnvasado = LocalDate.of(1,1,1);
        this.temperaturaMantenimiento = 0;
        this.paisOrigen = "";
    }

    //Constructor parametrizado de ProductosRefrigerados
    public ProductosRefrigerados(int codigoSupervision, LocalDate fechaEnvasado, int temperaturaMantenimiento, String paisOrigen) {
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

     //Constructor parametrizado, con los parametros del constructor padre
    public ProductosRefrigerados(int codigoSupervision, LocalDate fechaEnvasado, int temperaturaMantenimiento, String paisOrigen, LocalDate fechaCaducidad, int numeroLote) {
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

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
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

    @Override
    public String toString() {
        return super.toString()+"\nCodigo de supervision: "+this.codigoSupervision+
                "\nFecha de envasado: "+this.fechaEnvasado+
                "\nTemperatura de mantenimiento del producto(º): "+this.temperaturaMantenimiento+
                "\nPais de origen del producto: "+this.paisOrigen;
    }

}
