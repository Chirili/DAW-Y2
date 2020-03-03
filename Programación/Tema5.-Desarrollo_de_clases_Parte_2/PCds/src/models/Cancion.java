/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import Utils.Utils;
/**
 *
 * @author Andres
 */
public class Cancion {

    private String nombre;
    private double duracion;

    //Constructor por defecto
    public Cancion() {
        this.nombre = "";
        this.duracion = 0;
    }

    //Constructor parametrizado
    public Cancion(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public void capturar(){
        Utils uts = new Utils();
        System.out.print("Dime el nombre de la cancion: ");
        this.nombre = uts.getString();
        System.out.print("Dime la duracion de la cancion: ");
        this.duracion = uts.getInt();
    }

    @Override
    public String toString() {
        return "Nombre de la cancion: "+this.getNombre()+"\nDuracion de la cancion: "+this.getDuracion();
    }
    
    

    /**
     * Getters y setters
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    
}
