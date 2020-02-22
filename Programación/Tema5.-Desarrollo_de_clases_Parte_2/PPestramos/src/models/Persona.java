/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import Utils.Utils;
import java.time.DateTimeException;

/**
 *
 * @author Andres
 */
public class Persona {

    private String identidad;
    private String primerNombre;
    private String primerApellido;
    private String segundoApellido;
    private String segundoNombre;
    private LocalDate fechaNacimiento;
    private NumeroTelefonico telefonoCasa;
    private NumeroTelefonico telefonoOficina;
    private NumeroTelefonico telefonoMovil;

    //Constructor por defecto de Persona
    public Persona() {
        this.identidad = "";
        this.primerNombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.segundoNombre = "";
        this.telefonoCasa = new NumeroTelefonico();
        this.telefonoMovil = new NumeroTelefonico();
        this.telefonoOficina = new NumeroTelefonico();
    }

    //Metodo encargado de capturar los datos de la persona
    public void capturar() {
        Utils uts = new Utils();

        System.out.print("Identidad de la persona: ");
        this.identidad = uts.getString();
        System.out.print("Primer nombre de la persona: ");
        this.primerNombre = uts.getString();
        System.out.print("Primer apellido de la persona: ");
        this.primerApellido = uts.getString();
        System.out.print("Segundo apellido de la persona: ");
        this.segundoApellido = uts.getString();
        System.out.println("Introduce la fecha de nacimiento: ");
        fechaNacimiento = capturarFecha();
        System.out.println("Datos del numero de telefono movil: ");
        telefonoMovil.capturar();
        System.out.println("Datos del numero de telefono de casa: ");
        telefonoCasa.capturar();
    }

    /**
     * Metodo encargado de comprobar is el año actual es bisiesto
     *
     * @return de un valor true o false
     */
    public boolean isLeapYear() {
        if (LocalDate.now().isLeapYear()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula la edad en funcion de la fecha de nacimiento de la persona
     *
     * @param f
     * @return de un valor int que es la cantidad de años de la persona
     */
    public int calcularEdad(LocalDate f) {
        return LocalDate.now().getYear() - f.getYear();
    }

    /**
     * Metodo encargado de capturar las fechas utilzadas en el programa
     *
     * @return de un objeto de tipo LocalDate
     */
    public LocalDate capturarFecha() {
        Utils uts = new Utils();
        int year, month, day;
        do {
            try {
                System.out.print("Introduce el anio: ");
                year = uts.getInt();
                do {
                    System.out.print("Introduce el mes: ");
                    month = uts.getInt();
                } while (month < 1 || month > 12);
                System.out.print("Introduce el dia: ");
                day = uts.getInt();
                return LocalDate.of(year, month, day);
            } catch (DateTimeException ex) {
                System.out.println("Los datos introducidos para las fechas son incorrectos, por favor vuelve a intentarlo:");
            }
        } while (true);
    }

    @Override
    public String toString() {
        return "Datos de la persona: "
                + "\nPrimer nombre: " + this.primerNombre
                + "\nPrimer apellido: " + this.primerApellido
                + "\nSegundo apellido: " + this.segundoApellido
                + "\nFecha de nacimiento: " + this.fechaNacimiento
                + "\nTelefono movil: " + telefonoMovil.toString()
                + "\nTelefono de casa: " + telefonoCasa.toString();
    }

    /**
     * Getters y setters de Persona
     *
     * @return
     */
    public NumeroTelefonico getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(NumeroTelefonico telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public NumeroTelefonico getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(NumeroTelefonico telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public NumeroTelefonico getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(NumeroTelefonico telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
