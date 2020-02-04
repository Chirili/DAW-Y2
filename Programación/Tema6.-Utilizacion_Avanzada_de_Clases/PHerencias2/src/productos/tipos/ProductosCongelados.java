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
public abstract class ProductosCongelados extends Productos {

    private LocalDate fechaEnvasado;
    private String paisOrigen;
    private int temperaturaMantenimiento;

    //Constructor parametrizado de ProductosCongelados
    public ProductosCongelados(LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    //Constructor parametrizado, con los parametros del constructor padre
    public ProductosCongelados(LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, LocalDate fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    /**
     * Getters y setters de la clase ProductosCongelados
     * @return 
     */
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
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

    @Override
    public String toString() {
        return super.toString()+"\nFecha de envasado: "+this.fechaEnvasado+"\nPais de origen: "+this.paisOrigen+"\nTemperatura de mantenimiento: "+this.temperaturaMantenimiento;
    }
    
    

}
