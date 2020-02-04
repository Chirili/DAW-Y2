/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos.congelados;

import java.time.LocalDate;
import productos.tipos.ProductosCongelados;

/**
 *
 * @author usuario
 */
public class PCongeladosAgua extends ProductosCongelados {

    private int gramosSal;

    //Constructor parametrizado, con los parametros del constructor padre
    public PCongeladosAgua(int gramosSal, LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.gramosSal = gramosSal;
    }
     //Constructor parametrizado, con los parametros del constructor padre y del abuelo
    public PCongeladosAgua(int gramosSal, LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, LocalDate fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.gramosSal = gramosSal;
    }

    /**
     * Getters y setters de la clase PCongeladosAgua
     * @return 
     */
    public int getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(int gramosSal) {
        this.gramosSal = gramosSal;
    }

    @Override
    public String toString() {
        return super.toString()+"\nGramos de sal: "+this.gramosSal;
    }

    
}
