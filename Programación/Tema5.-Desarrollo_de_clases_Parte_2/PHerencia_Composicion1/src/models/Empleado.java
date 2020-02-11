/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Utils.Utils;
import java.time.DateTimeException;

import java.time.LocalTime;

/**
 *
 * @author Andres
 */
public class Empleado extends Persona {

    LocalTime horaEntrada;
    LocalTime horaSalida;

    //Constructor por defecto
    public Empleado() {
        this.horaEntrada = LocalTime.of(0, 0, 0);
        this.horaSalida = LocalTime.of(0, 0, 0);
    }

    /**
     * Pregunta al usuario por una hora y devuelve un objeto de tipo LocalTime
     *
     * @return
     */
    public LocalTime getHora() {
        LocalTime horaCreada = LocalTime.of(0, 0, 0);
        int hora = 0, segundo = 0, minuto = 0;
        Utils uts = new Utils();
        do {
            try {
                System.out.print("Dime la hora: ");
                hora = uts.getInt();
                System.out.print("Dime los minutos: ");
                minuto = uts.getInt();
                System.out.print("Dime los segundos: ");
                segundo = uts.getInt();
                horaCreada = LocalTime.of(hora, minuto, segundo);
                return horaCreada;
            } catch (DateTimeException ex) {
                System.out.println("Te has equivocado al introducir la fecha, introduce datos coherentes.");
            };
        } while (true);
    }

    //Setter del empleado
    public void setEmpleado(LocalTime horaEntrada, LocalTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    //Metodo encargado de recoger toda la informacion relacionada con el empleado
    public void capturarEmpleado() {
        if (horaSalida.isAfter(horaEntrada) || horaSalida.equals(horaEntrada)) {
            super.capturarPersona();
        }
        System.out.println("Datos de la hora de entrada: ");
        setHoraEntrada(getHora());

        System.out.println("Datos de la hora de salida: ");
        setHoraSalida(getHora());
        if (horaSalida.isBefore(horaEntrada)) {
            System.out.println("Error la hora de salida es anterior a la de entrada, vuelve a introducir la hora.");
            capturarEmpleado();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nHora de entrada del empleado: " + this.horaEntrada
                + "\nHora de salida del empleado: " + this.horaSalida;
    }

    /**
     * Getters y setters de empleado.
     *
     * @return
     */
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

}
