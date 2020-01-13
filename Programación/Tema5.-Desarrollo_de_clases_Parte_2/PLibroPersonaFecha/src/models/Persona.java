/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Persona {

    private String name;
    private String firstName;
    private String lastName;

    //Constructor por defecto

    public Persona() {
        this.name = "";
        this.firstName = "";
        this.lastName = "";
    }
    

    //Constructor parametrizado
    public Persona(String name, String firstName, String lastName) {    
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Constructor copia
    public Persona(Persona p) {
        this.name = p.name;
        this.firstName = p.firstName;
        this.lastName = p.lastName;
    }

    /**
     * Metodo toString para imprimir por pantalla los atributos de la clase
     * @return 
     */
    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + ", " + this.name;
    }

    /**
     * Getters y setters de la clas Persona
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
