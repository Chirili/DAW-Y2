/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import models.interfaces.DeportistaInterface;
import models.interfaces.IntegranteInterface;

/**
 *
 * @author usuario
 */
public class EntrenadorHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface {

    private int idFederacion;

    //Constructor por defecto
    public EntrenadorHM(){
        super();
        this.idFederacion = 0;
    }
    //Constructor parametrizado uno
    public EntrenadorHM(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    //Constructor parametrizado dos
    public EntrenadorHM(int idFederacion, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    //Metodo encargado de capturar los datos del entrenador
    public void capturarEntrenadorHM(){
        Utils uts = new Utils();
        super.capturarSeleccion();
        System.out.print("Introduce el id de la federacion: ");
        this.idFederacion = uts.getInt();
    }
    
    /**
     * Metodos implementados de las interface
     */
    @Override
    public void entrenar() {
        System.out.println("Entrenando...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando el partido...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrandome...");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nDatos del entrenador: \n"+
                "Id de federacion: "+this.idFederacion;
    }

    
    /**
     * Getters y setters
     * @return 
     */
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
}
