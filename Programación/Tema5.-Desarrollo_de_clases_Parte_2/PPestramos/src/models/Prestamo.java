/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import Utils.Utils;

/**
 *
 * @author Andres
 */
public class Prestamo extends Persona {

    private int numPrestamo;
    private Persona solicitante;
    private LocalDate fechaEntrega;
    private LocalDate fechaAutorizacion;
    private LocalDate fechaPago;
    private double valor;

    //Constructor por defecto de Prestamo
    public Prestamo() {
        this.numPrestamo = 0;
        this.solicitante = new Persona();
        this.fechaEntrega = LocalDate.of(1, 1, 1);
        this.fechaAutorizacion = LocalDate.of(1, 1, 1);
        this.fechaPago = LocalDate.of(1, 1, 1);
        this.valor = 0;
    }

    //Constructor parametrizado de Prestamo
    public Prestamo(Persona solicitante) {
        this.numPrestamo = 0;
        this.solicitante = solicitante;
        this.fechaEntrega = LocalDate.of(1, 1, 1);
        this.fechaAutorizacion = LocalDate.of(1, 1, 1);
        this.fechaPago = LocalDate.of(1, 1, 1);
        this.valor = 0;
    }

    //Metodo encargado de capturar los datos relacionados con el Prestamo
    public void capturar() {
        Utils uts = new Utils();

        System.out.print("Introduce el numero del prestamo: ");
        this.numPrestamo = uts.getInt();
        System.out.print("Introduce el valor del prestamo: ");
        this.valor = uts.getDouble();
        do {
            System.out.println("Introduce la fecha de Autorizacion");
            this.fechaAutorizacion = super.capturarFecha();
        } while (fechaAutorizacion.getDayOfMonth() > 20);
        this.fechaEntrega = this.fechaAutorizacion.plusDays(7);
        this.fechaPago = this.fechaAutorizacion.plusDays(30);
    }

    @Override
    public String toString() {
        return "Datos del prestamo: "
                + "\nNumero de prestamo: " + this.numPrestamo
                + "\nFecha de autorizacion del prestamo: " + this.fechaAutorizacion
                + "\nFecha de entrega del prestamo: " + this.fechaEntrega
                + "\nFecha de pago del prestamo: " + this.fechaPago;
    }

    /**
     * Getters y setters
     *
     * @return
     */
    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(LocalDate fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
