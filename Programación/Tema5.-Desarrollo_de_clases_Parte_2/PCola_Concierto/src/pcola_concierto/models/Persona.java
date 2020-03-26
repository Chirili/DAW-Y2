/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcola_concierto.models;

import Utils.Utils;
import java.util.StringTokenizer;

/**
 *
 * @author Andres
 */
public class Persona {

    private String dni;
    private String nombre;
    private String ape1;
    private String ape2;
    private int numero_entrada;

    //Constructor por defecto
    public Persona() {
        this.dni = Utils.calcDNI();
        this.nombre = "";
        this.ape1 = "";
        this.ape2 = "";
        this.numero_entrada = generateNumeroEntrada();
    }
    //Constructor parametrizado
    public Persona(String nombre, String ape1, String ape2) {
        this.dni = Utils.calcDNI();
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.numero_entrada = generateNumeroEntrada();
    }

    //Metodo encargado de generar un numero aleatorio de entrada
    private int generateNumeroEntrada() {
        return (int) (Math.random() * 10000000);
    }

    //Metodo encargado de capturar los datos de las personas
    public void capturarPersona() {

        Utils uts = new Utils();
        String apellidos;

        System.out.print("Introduzca su nombre: ");
         this.nombre = uts.getString();
        do{
            System.out.print("Introduzca sus apellidos(Separados por espacios): ");
            apellidos = uts.getString();
        }while(apellidos.contains(" ") == false);
        this.ape1 = apellidos.split(" ")[0];
        this.ape2 = apellidos.split(" ")[1];
        
    }

    @Override
    public String toString() {
        return "DNI de la persona: "+ getDni()+
                "\nApellido 1: "+this.ape1+
                "\nApellido 2: "+this.ape2;
    }
    
    

    /**
     * Getters y setters de Persona
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public int getNumero_entrada() {
        return numero_entrada;
    }

    public void setNumero_entrada(int numero_entrada) {
        this.numero_entrada = numero_entrada;
    }

}
