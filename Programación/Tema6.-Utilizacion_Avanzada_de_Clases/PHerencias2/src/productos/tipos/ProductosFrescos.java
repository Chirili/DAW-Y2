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
public class ProductosFrescos extends Productos {

    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos() {
        this.fechaEnvasado = "";
        this.paisOrigen = "";
    }

    public ProductosFrescos(String fechaEnvasado, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProductosFrescos(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    /**
     * Getters y setters de la clase ProductosFrescos
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

}
