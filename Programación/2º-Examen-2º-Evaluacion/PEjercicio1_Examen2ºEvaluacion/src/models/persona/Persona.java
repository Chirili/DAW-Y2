/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.persona;
import Utils.Utils;
/**
 *
 * @author usuario
 */
public class Persona {

    private String nombreCompleto;
    private int identificador;
    private int numHijos;
    private boolean isCasado;

    //Constructor por defecto
    public Persona() {
        this.nombreCompleto = "";
        this.identificador = generarIdentificador();
        this.numHijos = 0;
        this.isCasado = false;
    }

    //Constructor parametrizado
    public Persona(String nombreCompleto, int numHijos, boolean isCasado) {
        this.nombreCompleto = nombreCompleto;
        this.numHijos = numHijos;
        this.identificador = generarIdentificador();
        this.isCasado = isCasado;
    }

    //Constructor copia
    public Persona(Persona p) {
        this.nombreCompleto = p.getNombreCompleto();
        this.numHijos = p.getNumHijos();
        this.identificador = generarIdentificador();
        this.isCasado = p.isIsCasado();
    }

    //Metodo encargado de capturar los datos de la persona
    public void capturarPersona(){
        String choice;
        Utils uts = new Utils();
        System.out.print("Dime el nombre completo de la persona: ");
        this.setNombreCompleto(uts.getString());
        do{
        System.out.print("¿Esta casad@ la persona?Escribe si o no: ");
        choice = uts.getString();
        }while(!choice.equalsIgnoreCase("si") && !choice.equalsIgnoreCase("no"));
        if(choice.equalsIgnoreCase("si")){
            this.setIsCasado(true);
        }else {
            this.setIsCasado(false);
        }
        do{
        System.out.print("¿Tiene hijos la persona? Escribe si o no: ");
        choice = uts.getString();
        }while(!choice.equalsIgnoreCase("si") && !choice.equalsIgnoreCase("no"));
        if(choice.equalsIgnoreCase("si")){
            do{
            System.out.print("Dime el numero de hijos: ");
            this.setNumHijos(uts.getInt());
            }while(this.numHijos > 10 || this.numHijos < 0);
        }else {
            this.setIsCasado(false);
        }
    }
    //Metodo encargado de devolver si la persona tiene hijos o no
    private String imprimirHijos() {
        if (this.numHijos > 0) {
            return "Numero de hijos: " +this.numHijos;
        } else {
            return "No tiene hijos.";
        }
    }

    //Metodo encargado de devolver si la persona esta casada o no
    private String imprimirIsCasado() {
        if (this.isCasado) {
            return "Esta casado";
        } else {
            return "No esta casado";
        }
    }

    @Override
    public String toString() {
        return "\nDatos de la persona: \n"
                + "Nombre completo: " + this.getNombreCompleto()
                + "\n" + imprimirHijos()
                + "\n" + imprimirIsCasado();
    }

    //Metodo encargado de generar un identificador para cada usuario
    public int generarIdentificador() {
        return (int) (Math.random() * 1000000);
    }

    /**
     * Getters y setters de Persona
     *
     * @return
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isIsCasado() {
        return isCasado;
    }

    public void setIsCasado(boolean isCasado) {
        this.isCasado = isCasado;
    }

}
