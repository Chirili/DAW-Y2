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
public class PCongeladosNitrogeno extends ProductosCongelados{

    private String metodoCongelacion;
    private int tiempoExposicion;

    //Constructor parametrizado, con los parametros del constructor padre
    public PCongeladosNitrogeno(String metodoCongelacion, int tiempoExposicion, LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    //Constructor parametrizado, con los parametros del constructor padre y del abuelo
    public PCongeladosNitrogeno(String metodoCongelacion, int tiempoExposicion, LocalDate fechaEnvasado, String paisOrigen, int temperaturaMantenimiento, LocalDate fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaMantenimiento, fechaCaducidad, numeroLote);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    /**
     * Getters y setters de PCongeladosNitrogeno
     * @return 
     */
    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMetodo de congelacion empleado: "+this.metodoCongelacion+
                "\nTiempo de exposicion(segs): "+this.tiempoExposicion;
    }
    
    
    
}
