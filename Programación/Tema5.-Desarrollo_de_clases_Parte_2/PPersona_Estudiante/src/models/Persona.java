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
public abstract class Persona {

    protected int identidad;

    public Persona() {

    }
    public Persona(int identidad){
        this.identidad = identidad;
    }
    
    public void capturarPersona(){
        Utils uts = new Utils();
        System.out.print("Introduce el numero de indentidad de persona: ");
        establecerPersona(uts.getInt());
    }

    
    /**
     * Getters y setters de la clase Persona
     *
     * @return
     */
    public int obtenerIdentidad() {
        return identidad;
    }

    public void establecerPersona(int identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Numero de indentidad de la persona: "+this.identidad;
    }
    

}
