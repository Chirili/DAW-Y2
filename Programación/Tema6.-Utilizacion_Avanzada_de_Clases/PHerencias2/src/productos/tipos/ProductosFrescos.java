/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos;

import java.time.LocalDate;
import java.time.Month;
import productos.Productos;
import productos.Productos;

/**
 *
 * @author usuario
 */
public class ProductosFrescos extends Productos {

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos() {
        this.fechaEnvasado = LocalDate.of(1,1, 1);
        this.paisOrigen = "";
    }

    public ProductosFrescos(LocalDate fechaEnvasado, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProductosFrescos(LocalDate fechaEnvasado, String paisOrigen, LocalDate fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    /**
     * Getters y setters de la clase ProductosFrescos
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

}
