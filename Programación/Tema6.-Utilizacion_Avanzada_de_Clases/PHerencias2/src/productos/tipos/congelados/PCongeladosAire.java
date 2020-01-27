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
public class PCongeladosAire extends ProductosCongelados {

    private int pNitrogeno;
    private int pOxigeno;
    private int pDioxidoCarbono;
    private int pVaporAgua;

    public PCongeladosAire(int pNitrogeno, int pOxigeno, int pDioxidoCarbono, int pVaporAgua, String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.pNitrogeno = pNitrogeno;
        this.pOxigeno = pOxigeno;
        this.pDioxidoCarbono = pDioxidoCarbono;
        this.pVaporAgua = pVaporAgua;
    }

    public PCongeladosAire(int pNitrogeno, int pOxigeno, int pDioxidoCarbono, int pVaporAgua, String fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.pNitrogeno = pNitrogeno;
        this.pOxigeno = pOxigeno;
        this.pDioxidoCarbono = pDioxidoCarbono;
        this.pVaporAgua = pVaporAgua;
    }

    /**
     * Getters y setters de la clase PCongeladosAire
     * @return 
     */
    public int getpNitrogeno() {
        return pNitrogeno;
    }

    public void setpNitrogeno(int pNitrogeno) {
        this.pNitrogeno = pNitrogeno;
    }

    public int getpOxigeno() {
        return pOxigeno;
    }

    public void setpOxigeno(int pOxigeno) {
        this.pOxigeno = pOxigeno;
    }

    public int getpDioxidoCarbono() {
        return pDioxidoCarbono;
    }

    public void setpDioxidoCarbono(int pDioxidoCarbono) {
        this.pDioxidoCarbono = pDioxidoCarbono;
    }

    public int getpVaporAgua() {
        return pVaporAgua;
    }

    public void setpVaporAgua(int pVaporAgua) {
        this.pVaporAgua = pVaporAgua;
    }

    
}
