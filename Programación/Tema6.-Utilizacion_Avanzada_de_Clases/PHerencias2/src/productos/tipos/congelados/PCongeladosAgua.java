/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.tipos.congelados;

import productos.tipos.ProductosCongelados;

/**
 *
 * @author usuario
 */
public class PCongeladosAgua extends ProductosCongelados {

    private int gramosSal;

    public PCongeladosAgua(int gramosSal, String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.gramosSal = gramosSal;
    }

    public PCongeladosAgua(int gramosSal, String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
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

}
