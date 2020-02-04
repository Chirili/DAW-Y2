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
public class ProductosFrescos extends Productos {

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    //Constructor por defecto de ProductosFrescos
    public ProductosFrescos() {
        this.fechaEnvasado = LocalDate.of(1, 1, 1);
        this.paisOrigen = "";
    }

     //Constructor parametrizado de ProductosFrescos
    public ProductosFrescos(LocalDate fechaEnvasado, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

     //Constructor parametrizado, con los parametros del constructor padre
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

    @Override
    public String toString() {
        return super.toString()+"\nFecha de envasado del producto: "+this.fechaEnvasado+"\nPais de origen del producto: "+this.paisOrigen;
    }

    
}
