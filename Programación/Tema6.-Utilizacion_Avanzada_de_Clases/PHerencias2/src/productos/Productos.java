/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public abstract class Productos {

    private LocalDate fechaCaducidad;
    private int numeroLote;

    public Productos() {
        this.fechaCaducidad = LocalDate.of(1, 1, 1);
        this.numeroLote = 0;
    }

    public Productos(LocalDate l, int numeroLote) {
        this.fechaCaducidad = l;
        this.numeroLote = numeroLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate l) {
        this.fechaCaducidad = l;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

}
