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
public class PCongeladosNitrogeno extends ProductosCongelados {

    private String metodoCongelacion;
    private int tiempoExposicion;

    public PCongeladosNitrogeno(String metodoCongelacion, int tiempoExposicion) {
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

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

}
