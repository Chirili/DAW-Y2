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
public abstract class ProductosCongelados extends Productos {

    private String fechaEnvasado;
    private String paisOrigen;
    private int temperaturaMantenimiento;

    public ProductosCongelados(String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public ProductosCongelados(String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    /**
     * Getters y setters de la clase ProductosCongelados
     * @return 
     */
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    
    

}
