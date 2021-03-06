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
public class Estudiante extends Persona {
    private int nroCuenta;
    public Estudiante(){
        
    }
    public Estudiante(int identidad,int nroCuenta){
        super(identidad);
        this.nroCuenta = nroCuenta;
    }
    public void capturarEstudiante(){
        Utils uts = new Utils();
        System.out.print("Introduce el numero de cuenta del estudiante: ");
        establecerEstudiante(uts.getInt());
    }

    /**
     * Getters y setters de la clase Estudiante
     * @return 
     */
    public int obtenerNroCuenta() {
        return nroCuenta;
    }

    public void establecerEstudiante(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNumero de cuenta del Estudiante: "+this.nroCuenta;
    }
    
}
    

