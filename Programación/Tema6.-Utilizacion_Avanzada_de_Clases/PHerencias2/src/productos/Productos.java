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

    //Constructor por defecto de Productos
    public Productos() {
        this.fechaCaducidad = LocalDate.of(1,1,1);
        this.numeroLote = 0;
    }

    //Constructor parametrizado de Productos
    public Productos(LocalDate fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    /**
     * Getters y setters de la clase Productos
     * @return 
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public String toString() {
        return "Fecha de caducidad del producto: "+ this.fechaCaducidad + "\nNumero de lote del producto: "+this.numeroLote;
    }

    
}
