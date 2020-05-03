/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
public abstract class Persona {
    private String nombre;
    private String DNI;
    
    Persona(){
        this.nombre = "";
        this.DNI = "";
    }
    Persona(String nombre, String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
}
