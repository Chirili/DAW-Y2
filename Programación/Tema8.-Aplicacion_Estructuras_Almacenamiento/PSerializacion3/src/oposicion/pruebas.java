/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oposicion;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class pruebas implements Serializable{
    
    private static final long serialVersionUID = -7814120711475712937L;
    
    private String calificacion;
    private String nombre;

    public pruebas() {
        this.nombre = "";
        this.calificacion = "";
    }

    @Override
    public String toString() {
        return "prueba: "+this.getNombre()+"calificacion de "+this.getNombre()+": "+this.getCalificacion();
    }

    
    public pruebas(String calificacion, String nombre) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

}
