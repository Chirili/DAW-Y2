/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;

/**
 *
 * @author usuario
 */
public class SeleccionFutbolHM {

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor por defecto
    public SeleccionFutbolHM() {
        this.id = generarIdentificador();
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    //Constructor parametrizado
    public SeleccionFutbolHM(String nombre, String apellidos, int edad) {
        this.id = generarIdentificador();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Metodo encargado de capturar los datos de la seleccion
    public void capturarSeleccion() {
        Utils uts = new Utils();
        System.out.print("Introduce el nombre de la seleccion: ");
        this.nombre = uts.getString();
        System.out.print("Introduce los apellidos de la seleccion: ");
        this.apellidos = uts.getString();
        System.out.print("Introduce la edad de la sleeccion: ");
        this.edad = uts.getInt();
    }

    //Metodo encargado de generar un identificador para cada usuario
    public int generarIdentificador() {
        return (int) (Math.random() * 1000000);
    }

    @Override
    public String toString() {
        return "Datos de la seleccion: \n"+
                "Nombre de la seleccion: "+this.nombre+
                "\nApellidos de la seleccion: "+this.apellidos+
                "\nEdad de la seleccion: "+this.edad;
    }

    /**
     * Getters y setters
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
