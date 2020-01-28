/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * @author Andres
 */
public abstract class Pez implements Cloneable {

    private String nombre;
    private static int numpeces;

    public Pez() {
        this.nombre = "";
        añadirPeces();
    }

    public Pez(String nombre) {
        this.nombre = nombre;
        añadirPeces();
    }

    public Pez(Pez p){
        this.nombre = p.getNombre();
        añadirPeces();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pez other = (Pez) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = (Pez) super.clone();
            añadirPeces();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirPeces(){
        this.numpeces += 1;
    }

    public int getNumPeces() {
        return this.numpeces;
    }
    public String getNombre() {
        return this.nombre;
    }
}
