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
public class Persona {

    private String nif;
    private String nombre;
    private String apellidos;
    private boolean casado;
    private boolean hijos;
    private int num_hijos;

    public Persona() {
        this.nif = "";
        this.nombre = "";
        this.apellidos = "";
        this.casado = false;
        this.hijos = false;
        this.num_hijos = 0;
    }

    public Persona(String nif, String nombre, String apellidos, boolean casado, boolean hijos, int num_hijos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.casado = casado;
        this.hijos = hijos;
        this.num_hijos = num_hijos;
    }

    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        System.out.println("NIF del empleado: " + this.getNif());
        System.out.println("Nombre del empleado: " + this.getNombre());
        System.out.println("Apellidos del empleado: " + this.getApellidos());
        if (this.isCasado() == true) {
            System.out.println("Esta casado.");
        } else {
            System.out.println("No esta casado.");
        }
        if (this.isHijos() == true) {
            return "Tiene " + this.getNum_hijos() + " de hijos";
        } else {
            return "No tiene hijos";
        }
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isHijos() {
        return hijos;
    }

    public void setHijos(boolean hijos) {
        this.hijos = hijos;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

}
