/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos;

import java.time.LocalDate;
import productos.Productos;

/**
 *
 * @author usuario
 */
public abstract class ProductosCongelados extends Productos {

    private LocalDate fechaEnvasado;
    private String paisOrigen;
    private int temperaturaMantenimiento;

    /**
     * Getters y setters de la clase ProductosCongelados
     *
     * @return
     */
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate l) {
        this.fechaEnvasado = l;
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
